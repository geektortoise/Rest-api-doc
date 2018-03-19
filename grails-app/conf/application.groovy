//import grails.util.Holders
//import org.springframework.http.MediaType

// configuration for plugin testing - will not be included in the plugin zip

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}

    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d{dd-MM-yyyy HH:mm:ss,SSS} %5p %c{1} - %m%n')
    }

    info 'org.restapidoc'

    error  'org.codehaus.groovy.grails.web.servlet',  //  controllers
           'org.codehaus.groovy.grails.web.pages', //  GSP
           'org.codehaus.groovy.grails.web.sitemesh', //  layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping', // URL mapping
           'org.codehaus.groovy.grails.commons', // core / classloading
           'org.codehaus.groovy.grails.plugins', // plugins
           'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'
}



// Uncomment and edit the following lines to start using Grails encoding & escaping improvements

/* remove this line 
// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside null
                scriptlet = 'none' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        filteringCodecForContentType {
            //'text/html' = 'html'
        }
    }
}
remove this line */


grails {
    plugins{
        restapidoc {

            docVersion = "0.1.1"

            basePath = "Fill with basePath config" //"http://localhost:8080/RestApiDoc" //app.name

            outputFileGeneration = "restapidoc.json"
            outputFileReading = "restapidoc.json"
            customClassName = null  //"org.restapidoc.CustomResponseDoc"

            defaultFormat = "json"

            //defaultResponseType = MediaType.APPLICATION_JSON_VALUE
            controllerPrefix = ""
            controllerSuffix = "Controller"

            defaultFormatString = "{format}"

            defaultObjectFields = [ ]

            defaultErrorAll = []

            defaultErrorGet = []

            defaultErrorPost = []

            defaultErrorPut = []

            defaultErrorDelete = [:]


            verbPerMethodPrefix = [
                    "show" : "GET",
                    "list" : "GET",
                    "save" : "POST",
                    "add" : "POST",
                    "update" : "PUT",
                    "edit" : "PUT",
                    "delete" : "DELETE",
                    "remove" : "DELETE",
                    "partial" : "PATCH",
                    "patch" : "PATCH"
            ]

            pathPerMethodPrefix =[
                    "show" : "show/{id}",
                    "list" : "list",
                    "add" : "add",
                    "save" : "save",
                    "update" : "update/{id}",
                    "edit" : "edit/{id}",
                    "delete" : "delete/{id}",
                    "remove" : "delete/{id}",
            ]

            grailsDomainDefaultType = null //= null will appear 'domain' type


            defaultParamsQueryAll = []
            defaultParamsQuerySingle = []
            defaultParamsQueryMultiple = [
                    //                [name:"max",description:"Pagination: Number of record per page (default 0 = no pagination)",type:"int"],
                    //                [name:"offset",description:"Pagination: Offset of first record (default 0 = first record)",type:"int"]
            ]

            packageToScan = null

            layout = "main"
        }
    }
}

