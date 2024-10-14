package org.grails.geb

import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.RemoteWebDriver
import org.testcontainers.containers.BrowserWebDriverContainer
import spock.lang.Shared

import java.time.Duration

class ContainerGebSpec extends GebSpec {

    @Shared
    BrowserWebDriverContainer webDriverContainer

    void setupSpec() {
        webDriverContainer = new BrowserWebDriverContainer()
        webDriverContainer.start()
        browser.driver = new RemoteWebDriver(webDriverContainer.seleniumAddress, new ChromeOptions())
        browser.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30))
    }

    void setup() {
        assert serverPort : "You must annotate your test class with @Integration for serverPort to be injected"
        baseUrl = "http://host.docker.internal:$serverPort"
    }

    def cleanupSpec() {
        webDriverContainer.stop()
    }
}