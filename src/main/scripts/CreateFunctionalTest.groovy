description("Creates a Geb Functional Test") {
    usage "grails create-functional-test [TEST NAME]"
    argument name:'Test Name', description:"The name of the test"
	completer org.grails.cli.interactive.completers.DomainClassCompleter    
}


model = model( args[0] )
render	template:"FunctionalSpec.groovy",
		destination: file( "src/test/groovy/$model.packagePath/${model.simpleName}Spec.groovy"),
		model: model