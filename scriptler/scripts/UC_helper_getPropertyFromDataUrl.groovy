/*** BEGIN META {
  "name" : "UC_helper_getPropertyFromDataUrl",
  "comment" : "returns the value of a property key read guided by a DATA_URL",
  "parameters" : [ 'vPropKey','vDataUrl'],
  "core": "1.593",
  "authors" : [
    { name : "Ioannis Moutsatsos" }
  ]
} END META**/

/*
Requires 2 script parameters
vDataUrl, vPropKey

given the DATA_URL and a property key 
Finds the corresponding JData properties file and
Returns the key value as a list
*/

import hudson.model.*
def choices=[]

def dataUrl=vDataUrl
def derivedPropKey= vPropKey
def derivedProps= new Properties()
if(dataUrl=='FAILED UNIQUENESS TEST'){
return ['ERROR: JData file is not Unique!']
}
      
  if(dataUrl=='SELECT A DATA_SET'){
    return ['SELECT A DATA_SET']
  }else{

//find property file by replacing the dataUrl '.csv' extension-case insensitive
derivedPropAddress=dataUrl.replaceAll(~/\.(?i)csv/,'.properties')
println derivedPropAddress


/* Using derived data properties find derived data meta and annotations */
derivedProps.load(new URL(derivedPropAddress).openStream())
if (derivedProps.get(derivedPropKey)!=null){
 derivedProps.get(derivedPropKey).split(",").each{
choices.add(it)}
}else{
choices.add('NOT SET')
}
return choices
  } //end else
