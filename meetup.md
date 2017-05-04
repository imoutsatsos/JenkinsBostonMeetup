# Jenkins-LSCI: Dojo-Meetup

Thursday, May 04, 2017


## References
### Jenkins for Life Science Continous Integration
> <https://github.com/Novartis/Jenkins-LSCI>
### Jenkins-LSCI Installation
> <https://github.com/Novartis/Jenkins-LSCI/blob/master/userContent/docs/installation_and_use.md>
### Jenkins for Life Science-Boston Jenkins Meetup (Slides)
> <https://drive.google.com/open?id=13XnxIw_F09cfkBzpqRHBm-m4inzAMH36ldzFAwOhoxkp>

## Key points

> ### Introduce Life-Science Workflow systems

-   Galaxy example: <https://usegalaxy.org/>
 
> ### Jenkins advantages

-   Quick prototyping of requirements

<!-- -->

-   Web accessible free style builds

<!-- -->

-   Job pipelines of arbitrary complexity

<!-- -->

-   Access to remote resources (HPC, cloud etc.)

<!-- -->

-   Quick integration with other software tools, custom code

<!-- -->

-   Ease of setup and maintenance

    -   Compared to custom build scientific workflow systems

<!-- -->

-   Availability of large number of general DevOps/compute plugins

<!-- -->

-   A solid foundation for reproducible research

<!-- -->

-   Visibility into the status of complex pipelines

<!-- -->

-   Well known for development operations

    -   Even in scientific labs

 
> ### Jenkins Disadvantages

-   Minimal number of scientific Jenkins plugins

    -   [Functional fixedness](https://en.wikipedia.org/wiki/Functional_fixedness)

<!-- -->

-   Poor User Experience for Scientists

    -   Lack of **adaptive/interactive** interfaces

    -   DevOps chatter

    -   Metadata and searching

<!-- -->

-   Unknown to academics scientists

    -   Lack of academic publications

<!-- -->

-   Poor dependency management and packaging of complex jobs

    -   jobs with complex parameters and external tool/code dependencies

<!-- -->

-   Lack of a uniform way to distribute/install jobs and their dependencies

    -   Lack of a job repository

    -   Poor dependency management and packaging of complex jobs (parameters, code, scriptlets, external tools etc.)

<!-- -->

-   Lack of graphical configuration tools

    -   Difficult project comprehension

    -   Difficult to reuse existing components

        -   No easy way to reuse Use Interface components

            -   Such as task oriented groups of parameters

>  
>
>  

## Greasing the Wheels of Jenkins for Science

> ### Scientific Plugins
>
> BioUno provides scientific plugins: <http://biouno.org/jenkins-plugins.html>
>
> R-Plugin: [Data Science plugin](https://wiki.jenkins-ci.org/display/JENKINS/R+Plugin) for statistical Computing and Graphing
>
>  
>
> ## Interactive Build Forms
>
> Active Choices: <https://wiki.jenkins-ci.org/display/JENKINS/Active+Choices+Plugin>
>
>  
>
> ## Consistent Reporting
>
> Across multiple tools and analysis
>
>  
>
> ## Guided Workflows
>
> ACTIONS: tab
>
> Controlling the analysis input
>
> Automatic creation of build labels
>
>  
>
> ## PR to Scientific/DevOps Community
>
> ### Jenkins-LSCI publication (in a SLAS Discovery 2017)
> <http://journals.sagepub.com/doi/full/10.1177/1087057116679993>
>
> ## Meetups & Meetings
>
> 1. Boston Groovy Grails
> 2. Boston Jenkins
> 3. JUC 2014
>
>  
>
>## Jenkins-LSCI Job Repositories
>
> Jenkins-LSCI: Jobs for image analysis in high content screening.
>
> <https://github.com/Novartis/Jenkins-LSCI>

 

## Demo Projects

<table>
<thead>
<tr class="header">
<th><strong>UI</strong></th>
<th><strong>Project Info</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p><img src="media/image1.png" width="293" height="216" /></p>
<p> </p></td>
<td><p>This project demonstrates how an AC Reactive Reference parameter can be rendered in a variety of interesting ways with some rather simple HTML!</p>
<p> </p>
<p>Pasted from : job/DEMO_REACTREF/</p>
<p> </p></td>
</tr>
<tr class="even">
<td><p><img src="media/image2.png" width="282" height="282" /></p>
<p> </p></td>
<td><p>Another demonstration of rendering Active Choices Reactive Reference parameter to provide information and feedback to the user. We use an iframe to display a reference to the image structure</p>
<p> </p>
<p>Pasted from : job/NCBI_STRUCTURE_VIEWER/</p>
<p> </p></td>
</tr>
<tr class="odd">
<td><p><img src="media/image3.png" width="218" height="219" /></p>
<p> </p></td>
<td><p>A project demonstrating the introduction of javascript interactivity via an Active Choices Reactive Reference parameter formatted as hidden html.<br />
 </p>
<p>Pasted from : job/TEST_D3_CIRCLERADIUS/</p></td>
</tr>
</tbody>
</table>

 

## Demo: A 'mini-analytics' Jenkins system

### Demo

1.  Load delimited data sets

<!-- -->

1.  Extract/generate dataset metadata

<!-- -->

1.  Perform aggregate statistics

<!-- -->

1.  Plot histogram distributions of user selected parameters

<!-- -->

1.  Build an interactive 'pre-build' dashboard for data exploration

>  

## Favorite Plugins

### User Interface enhancements

| Jenkins Plugin         | Link                                                                       |
|------------------------|----------------------------------------------------------------------------|
| Dashboard View         | <http://wiki.jenkins-ci.org/display/JENKINS/Dashboard+View>                |
| OWASP Markup Formatter | <http://wiki.jenkins-ci.org/display/JENKINS/OWASP+Markup+Formatter+Plugin> |
| Active Choices         | <https://wiki.jenkins-ci.org/display/JENKINS/Active+Choices+Plugin>        |

>  
>
### Job execution

| Jenkins Plugin       | Link                                                                  |
|----------------------|-----------------------------------------------------------------------|
| Jenkins MultiJob     | <https://wiki.jenkins-ci.org/display/JENKINS/Multijob+Plugin>         |
| Rebuilder            | <https://wiki.jenkins-ci.org/display/JENKINS/Rebuild+Plugin>          |
| Environment Injector | <https://plugins.jenkins.io/envinject>                                |
| Groovy               | <https://plugins.jenkins.io/groovy>                                   |
| Scriptler            | <http://wiki.jenkins-ci.org/display/JENKINS/Scriptler+Plugin>         |
| Workspace Cleanup    | <http://wiki.jenkins-ci.org/display/JENKINS/Workspace+Cleanup+Plugin> |
| R-Plugin             | <https://wiki.jenkins-ci.org/display/JENKINS/R+Plugin>                |
| SSH                  | <http://wiki.jenkins-ci.org/display/JENKINS/SSH+plugin>               |

>  
>
### Job Reporting

|Jenkins Plugins          |Link                                                                      |
|-------------------------|--------------------------------------------------------------------------|
| Summary Display Plugin  | <https://wiki.jenkins-ci.org/display/JENKINS/Summary+Display+Plugin>     |
| HTML Publisher Plugin   | <https://wiki.jenkins-ci.org/display/JENKINS/HTML+Publisher+Plugin>      |
| Associated files plugin | <https://wiki.jenkins-ci.org/display/JENKINS/Associated+Files+Plugin>    |
| Build Name Setter       | <http://wiki.jenkins-ci.org/display/JENKINS/Build+Name+Setter+Plugin>    |
| Rich Text Publisher     | <https://wiki.jenkins-ci.org/display/JENKINS/Rich+Text+Publisher+Plugin> |

## Enhancements

1.  Summary Display Configuration (from Properties file)

<!-- -->

1.  Configuration Analyzer

    1.  [Jenkins-JobConfigurationAnalyzer ](https://github.com/imoutsatsos/Jenkins-JobConfigurationAnalyzer)

## Examples of functionality not available in Jenkins

## Job Repositories

> Galaxy: ToolShed [repositories](https://galaxyproject.org/admin/tools/add-tool-from-toolshed-tutorial/)

-   Allow import of a job and its dependencies from a specified repository

## Graphical Job Configuration

> See my BioUno blog: '[Is it Wow or Just About Time?](http://biouno.org/2016/06/07/Jenkins-Wow-or-JustAbout-Time)'
