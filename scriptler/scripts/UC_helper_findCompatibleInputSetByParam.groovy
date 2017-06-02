/*** BEGIN META {
  "name" : "UC_helper_findCompatibleInputSetByParam",
  "comment" : "Returns a map of builds related by a common build parameter whose value is defined by the user. Keys are in PROJECT_NAME#BUILD_NUMBER format",
  "parameters" : ['vJobName','vName','vValue','vIncludeParent'],
  "core": "1.593",
  "authors" : [
    { name : "Ioannis Moutsatsos" }
  ]
} END META**/

/*
vJobName      : Required; The current job name
vName         : Required; The common parameter name 
vValue        : Required; parameter value to match
vIncludeParent: Optional;'true' Use 'false' to not add parent
*/
import jenkins.model.*;
def options=[:] //by default we add the PARAMETER VALUE; this is the parent data set KEY
def includeParent=vIncludeParent

//get valid vSearchSpace from dataType.properties

def jobName =vJobName
jenkinsURL=jenkins.model.Jenkins.instance.getRootUrl()

def propFile='analysisType.properties'
def relPropFileUrl='userContent/properties/'
def propAddress="${jenkinsURL}${relPropFileUrl}$propFile"
def props= new Properties()
props.load(new URL(propAddress).openStream())

/* handle parent inclusion */
def propKey="inputset.parent.${jobName}"
parentJobNames=props.get(propKey.toString()).split(",")
def parentJobType=vValue.split('#')[0]
if ((includeParent==''||includeParent==null||includeParent=='true')&&parentJobType in parentJobNames ){
options.put(vValue,vValue)
}

/* handle children data set inclusion */
propKey="inputset.${jobName}"
jobNames=props.get(propKey.toString()).split(",")
jobNames.each{ job->
  job=job.trim()
if (jenkins.model.Jenkins.instance.getItem(job)!=null){
jenkins.model.Jenkins.instance.getItem(job).getBuilds().each{
  commonParam=it.buildVariables.getAt(vName)
  if (commonParam==vValue && it.result.toString()=='SUCCESS'){
    uc_key=job+'#'+it.number
    uc_value="$job: ${it.getDisplayName()}"
    options.put(uc_key,uc_value.toString())
  }
}
}//end not null
} //end each JobNames

return options