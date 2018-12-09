package org.maven.cucumber.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\java\\org\\maven\\cucumber\\feature\\"},glue= {"org.maven.cucumber.stepdefinition"},
plugin= {"pretty","html:reports","junit:reports/cucumber.xml","json:reports/cucumber.json"})















public class RunnerClass {

}
