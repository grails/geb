package geb

import grails.plugins.Plugin
import grails.plugins.metadata.PluginSource
import groovy.transform.CompileStatic

@PluginSource
@CompileStatic
class GebGrailsPlugin extends Plugin {
    def grailsVersion = "5.1.0 > *"
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]
    def title = "Grails Geb Plugin"
    def author = "Graeme Rocher"
    def authorEmail = "grocher@pivotal.io"
    def description = '''\
Plugin that adds Geb functional testing code generation features.
'''
    def documentation = "https://plugins.grails.org/plugin/grails/geb"
    def license = "APACHE"
    def issueManagement = [system: "Github Issues", url: "https://github.com/grails/geb/issues"]
    def scm = [url: "https://github.com/grails/geb"]
}
