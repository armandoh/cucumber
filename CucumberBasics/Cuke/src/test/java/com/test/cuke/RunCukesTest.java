package com.test.cuke;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Armando on 29/09/2014.
 */
@RunWith(Cucumber.class)
//@Cucumber.Options(monochrome = true, format = {"pretty", "html:target/cucumber", "rerun:target/rerun.txt"})
@Cucumber.Options(format = {"pretty", "html:build/cucumber-html-report", "json-pretty:build/cucumber-report.json"})
public class RunCukesTest {
}
