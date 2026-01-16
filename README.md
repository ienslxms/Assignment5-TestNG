Project Overview

This project implements automated UI testing using Java, Selenium WebDriver, and TestNG.
It demonstrates test lifecycle management, logging and reporting.

Tested Application:
https://www.saucedemo.com

Technologies Used

Java

Selenium WebDriver

TestNG

Maven

Log4j2 (logging)

Extent Reports (HTML test report)

Google Chrome browser

Prerequisites

Before running the project, ensure the following are installed:

Java JDK 17 at least

java -version


Google Chrome (latest version)

IntelliJ IDEA (recommended)
or Maven installed locally

Setup Instructions
Option 1: Run using IntelliJ IDEA (Recommended)

Open IntelliJ IDEA

Click Open and select the project folder

Wait for Maven dependencies to download

Open Maven tool window (right side)

Run:

Lifecycle → test

Option 2: Run using Command Line (Maven)

Ensure Maven is installed:

mvn -version


Navigate to project directory:

cd Assignment5-TestNG


Execute tests:

mvn clean test

Test Execution Details

Test framework automatically performs:

Setup before each test

Teardown after each test

Logging is written to:

logs/test.log


Screenshots are captured automatically on test failure

HTML test report is generated after execution

Test Reports

After execution, open the HTML report:

reports/extent-report.html


The report includes:

Test execution summary

Pass / Fail status

Individual test case results

Logs

Screenshots for failed tests

Test Cases Implemented

Login with valid credentials

Login with invalid password

Login with empty credentials

Notes

Warnings related to Chrome DevTools Protocol (CDP) do not affect test execution

All tests are repeatable and automated

Project follows TestNG lifecycle and logging best practices
