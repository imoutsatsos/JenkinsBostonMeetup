# Jenkins Boston Meetup: Life Sciences and Jenkins
Notes, references and code used for the [May 4th 2017, Jenkins Boston Meetup](https://www.meetup.com/Boston-Jenkins-Area-Meetup/events/237134375/)
# Abstract
[Jenkins](https://jenkins.io/index.html), despite its DevOps pedigree, provides a robust framework for the integration and standardization of scientific workflows.  Scientific applications, custom code, data management, analytics,  and Jenkins plugins can be integrated into pipelines of arbitrary complexity,  and can be made accessible through the Jenkins web portal.  As a result, research scientists can easily access and execute common data processing tasks, access high performance computing resources, collaborate with each other, and track data and metadata to enhance reproducible research. 
# References
1. Jenkins for Life Science Continous Integration: [github](https://github.com/Novartis/Jenkins-LSCI)
4. Ioannis Moutsatsos K., et al. “Jenkins-CI, an Open-Source Continuous Integration System, as a Scientific Data and Image-Processing Platform.” [Journal of Biomolecular Screening (2016)](http://journals.sagepub.com/doi/abs/10.1177/1087057116679993)
2. Jenkins-LSCI [Installation instructions](https://github.com/Novartis/Jenkins-LSCI/blob/master/userContent/docs/installation_and_use.md)
3. Jenkins for Life Science-Boston Jenkins Meetup [(Slides)](https://docs.google.com/presentation/d/13XnxIw_F09cfkBzpqRHBm-m4inzAMH36ldzFAwOhoxk/edit?usp=sharing)

# Demos and code
At this Meetup I provided usage examples and highlighted some of the Jenkins plugins that we have used to make Jenkins more scientist friendly. An example mini-analytics system using the Jenkins R-Plugin was demonstrated and discussed. 

This data analytics workflow is based on three separate but linked Jenkins jobs:
1. Job JD_FILE_UPLOAD for uploading and typing arbitrary CSV data sets
2. Job JD_DATASET_SUMMARY for creating a statistical summary of each of the numeric columns in the data set
3. Job JD_DATASET_HISTOGRAM for creating graphical histogram distributions of each of the data sets

# Example Build Output
![Build report](https://docs.google.com/drawings/d/1Sy5rzo4hrSPW46r3GZzXbWZg5MmDKP_LTkcJR3re_6s/pub?w=960&h=720)
![Data Summary](https://docs.google.com/drawings/d/17zyAGN4R6w2GB-dJBxISBPIm6CoIRS8lyFeYNku88PQ/pub?w=356&h=374)

