package ${packageName}

import grails.test.mixin.integration.Integration
import grails.transaction.Transactional

import spock.lang.*
import geb.spock.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@Integration
class ${className}Spec extends GebSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        when:"The home page is visited"
            go '/'

        then:"The title is correct"
        	\$('title').text() == "Welcome to Grails"
    }
}