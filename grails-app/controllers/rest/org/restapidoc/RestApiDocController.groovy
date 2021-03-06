package org.restapidoc

import grails.converters.JSON
import grails.util.Holders
//import org.apache.commons.io.IOUtils
import org.restapidoc.pojo.RestApiObjectDoc
import org.restapidoc.utils.BuildPathMap
import org.restapidoc.utils.JSONDocUtilsLight
import org.restapidoc.utils.MappingRules


class RestApiDocController {
    //def grailsApplication
    
    def index() {
    	def layout = grailsApplication.config.grails.plugins.restapidoc.layout
    	[layout: layout]
    }

    def api() {
        def input
        try {
            input = servletContext.getResourceAsStream(grailsApplication.config.grails.plugins.restapidoc.outputFileReading)
            render(input.text)
        }
        finally {
            input.close()
        }

    }
}
