Datalist Extensions for Alfresco Share (for Alfresco 4.1)
===========================================================

This a fork of the 4.x fme datalist extensions.  The following has been removed:

* fme discussions
* XLS export button

With the following additions/fixes/enhancements:

* Switch filter back to solr query
* Added Thumbnail generation for columns labeled Thumbnail
* Corrected issue preventing view action from showing for read-only items

This has only been tested on 4.1 but I plan to update it to work for 4.2.

TODO: 

* Figure out why XLS Export doesn't work
* Create new view/edit template for datalist items (as the current one looks like crap without discussions)
* Add direct link to datalist items (opening url will take you directly to an item)
* Add Reset button to filter.

Installation
============

* Run `mvn package`
* Put `./fme-alfresco-extdl-share/target/fme-alfresco-extdl-share-1.2.jar` in `tomcat/shared/lib` or `tomcat/webapps/share/WEB-INF/lib`
* Put `./fme-alfresco-extdl-repo/target/fme-alfresco-extdl-repo-1.2.jar` in `tomcat/webapps/alfresco/WEB-INF/lib`


