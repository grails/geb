Grails Geb Plugin
=================

[![Java CI](https://github.com/grails/geb/actions/workflows/gradle.yml/badge.svg)](https://github.com/grails/geb/actions/workflows/gradle.yml)

Geb Functional Testing for Grails® framework


This plugin just provides the Geb dependencies and a `create-functional-test` command for generating Geb tests in a Grails app. For further reference please see the [Geb documentation](http://www.gebish.org)

Examples
--------

If you are looking for examples check:

[Geb/Grails example project](https://github.com/grails-samples/geb-example-grails)

or [Grails functional test suite](https://github.com/grails/grails3-functional-tests) where Geb tests are used extensively.

Additional Drivers
==================

To setup additional drivers you need to add the driver to your `build.gradle` for example:

    testRuntime 'com.github.detro:phantomjsdriver:1.2.0'
   
Then you need to create a `GebConfig.groovy` file to your `src/test/resources/` directory. For example:

	/*
		This is the Geb configuration file.

		See: http://www.gebish.org/manual/current/#configuration
	*/
	import org.openqa.selenium.chrome.ChromeDriver
	import org.openqa.selenium.firefox.FirefoxDriver
	import org.openqa.selenium.phantomjs.PhantomJSDriver

	waiting {
	timeout = 2
	}
	driver = { new PhantomJSDriver() }


