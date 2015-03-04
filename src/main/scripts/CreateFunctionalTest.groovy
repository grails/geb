description("Creates a Geb Functional Test") {
    usage "grails create-functional-test [TEST NAME]"
    argument name:'Test Name', description:"The name of the test"
	completer AllClassCompleter
}


model = model( args[0] )
render	template:"FunctionalSpec.groovy",
		destination: file( "src/integration-test/groovy/$model.packagePath/${model.simpleName}Spec.groovy"),
		model: model
