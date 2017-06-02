/*** BEGIN META {
  "name" : "UC_helper_getDataSetUrl",
  "comment" : "returns the URL of the primary data set based on certain conventions. vDataSet value is formatted as PROJECT_NAME$BUILDNUMBER",
  "parameters" : [ 'vDataSet'],
  "core": "1.593",
  "authors" : [
    { name : "Ioannis Moutsatsos" }
  ]
} END META**/

/*
 Note that the DATA_URL is a Hidden HTML Formatted parameter
 Typically used internally by a build to find other components such as data set properties etc
 Requires one input parameters
 vDataSet
*/
import hudson.model.*
import jenkins.model.*
import hudson.model.Fingerprint.RangeSet;
dataSet=vDataSet //dataSet assigned from
choices=[]

if (dataSet==null||dataSet=='')
 return '<input name="value" value="'+'SELECT A DATA_SET'+'" class="setting-input" type="text">'

def jenkinsUrl=jenkins.model.Jenkins.instance.getRootUrl()
def dataRun=dataSet.split('#')
def jobName=dataRun[0].trim()
def buildRange=dataRun[1]
def range = RangeSet.fromString(buildRange, true);
def bl=jenkins.model.Jenkins.instance.getItem(jobName).getBuilds(range) // return a FreeStyleBuild list
def b=bl[0]
def bUrl=b.getUrl()

b.getArtifacts().each{
  fileName=it.getFileName()
  println fileName
  if (fileName.startsWith('JData')&&fileName.endsWith('csv')){
   choices.add(jenkinsUrl+bUrl+'artifact/'+it.toString()) 
}
  }
//verify that there is only one instance of the data
if (choices.size>1){
   return '<input name="value" value="'+'FAILED UNIQUENESS TEST'+'" class="setting-input" type="text">'
} else{
  return '<input name="value" value="'+choices[0]+'" class="setting-input" type="text">'
}