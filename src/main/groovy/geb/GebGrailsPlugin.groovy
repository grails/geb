package geb

import grails.plugins.*

class GebGrailsPlugin extends Plugin {

   // the version or versions of Grails the plugin is designed for
    def grailsVersion = "3.0.0.BUILD-SNAPSHOT > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    
    def title = "Geb Plugin" 
    def author = "Graeme Rocher"
    def authorEmail = "grocher@pivotal.io"
    def description = '''\
Plugin that adds Geb functional testing code generation features.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/geb"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "Github Issues", url: "http://github.com/grails3-plugins/geb/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "http://github.com/grails3-plugins/geb" ]


}
