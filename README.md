# JenkinsBostonMeetup
Notes, references and code used for the May 4th 2017, Jenkins Boston Meetup
# Abstract
Jenkins-CI, despite its DevOps pedigree, provides a robust framework for the integration and standardization of scientific workflows.  Scientific applications, custom code, data management, analytics,  and Jenkins plugins can be integrated into pipelines of arbitrary complexity,  and can be made accessible through the Jenkins web portal.  As a result, research scientists can easily access and execute common data processing tasks, access high performance computing resources, collaborate with each other, and track data and metadata to enhance reproducible research. 

# Demos and code
At this Meetup I provided usage examples and highlighted some of the Jenkins plugins that we have used to make Jenkins more scientist friendly. An example mini-analytics system using the Jenkins R-Plugin was demonstrated and discussed. 

This data analytics workflow is based on three separate but linked Jenkins jobs:
1. Job JD_FILE_UPLOAD for uploading and typing arbitrary CSV data sets
2. Job JD_DATASET_SUMMARY for creating a statistical summary of each of the numeric columns in the data set
3. Job JD_DATASET_HISTOGRAM for creating graphical histogram distributions of each of the data sets

# Example Build Output
![Build report](https://docs.google.com/drawings/d/1Sy5rzo4hrSPW46r3GZzXbWZg5MmDKP_LTkcJR3re_6s/pub?w=960&h=720)
