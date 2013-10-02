Datalist Extensions for Alfresco Share (for Alfresco 4.1)
===========================================================

This a fork of the 4.x fme datalist extensions.  The following has been removed:

* fme discussions
* XLS export button

Additonally, the filter search has been switched back to lucene as the solr query is incredibly slow and times out in my environment. Additionally, I've added thumbnail generation if you insert a column with the label "Thumbnail". A a thumbnail will need to be registered for the name used, this will be included in a later commit.

This has only been tested on 4.1

Installation
============

* Run `mvn package`
* Put `./fme-alfresco-extdl-share/target/fme-alfresco-extdl-share-1.2.jar` in `tomcat/shared/lib` or `tomcat/webapps/share/WEB-INF/lib`
* Put `./fme-alfresco-extdl-repo/target/fme-alfresco-extdl-repo-1.2.jar` in `tomcat/webapps/alfresco/WEB-INF/lib`


