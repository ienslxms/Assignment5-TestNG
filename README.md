# Assignment 5 – Test Automation (TestNG)

## Project Overview

This project implements automated UI testing using **Java**, **Selenium WebDriver**, and **TestNG**.
It demonstrates test lifecycle management, logging, reporting, and screenshot capture as required in Assignment 5.

**Tested Application:**
[https://www.saucedemo.com](https://www.saucedemo.com)

---

## Technologies Used

* Java (JDK 17) at least
* Selenium WebDriver
* TestNG
* Maven
* Log4j2 (logging)
* Extent Reports (HTML test report)
* Google Chrome browser

---

## Project Structure

```
Assignment5-TestNG/
│
├── src/test/java
│   ├── base        → setup & teardown logic
│   ├── tests       → automated test cases
│   └── utils       → driver, logging, reports, screenshots
│
├── src/test/resources
│   ├── log4j2.xml
│   └── testng.xml
│
├── reports         → HTML test reports
├── screenshots     → screenshots on test failure
├── logs            → execution logs
└── pom.xml
```

---

## Prerequisites

Before running the project, ensure the following are installed:

1. **Java JDK 17 at least**

   ```
   java -version
   ```

2. **Google Chrome (latest version)**

3. **IntelliJ IDEA** (recommended)
   or Maven installed locally

---

## Setup Instructions

### Option 1: Run using IntelliJ IDEA (Recommended)

1. Open IntelliJ IDEA
2. Click **Open** and select the project folder
3. Wait for Maven dependencies to download
4. Open **Maven** tool window (right side)
5. Run:

   ```
   Lifecycle → test
   ```

---

### Option 2: Run using Command Line (Maven)

1. Ensure Maven is installed:

   ```
   mvn -version
   ```

2. Navigate to project directory:

   ```
   cd Assignment5-TestNG
   ```

3. Execute tests:

   ```
   mvn clean test
   ```

---

## Test Execution Details

* Test framework automatically performs:

  * Setup before each test
  * Teardown after each test
* Logging is written to:

  ```
  logs/test.log
  ```
* Screenshots are captured automatically on test failure
* HTML test report is generated after execution

---

## Test Reports

After execution, open the HTML report:

```
reports/extent-report.html
```

The report includes:

* Test execution summary
* Pass / Fail status
* Individual test case results
* Logs
* Screenshots for failed tests

---

## Test Cases Implemented

1. Login with valid credentials
2. Login with invalid password
3. Login with empty credentials

---

## Notes

* Warnings related to Chrome DevTools Protocol (CDP) do not affect test execution
* All tests are repeatable and automated
* Project follows TestNG lifecycle and logging best practices

---

## Author

**Adilet Zhaksylyk**

