# Task — Java Selenium (Page Object Model)

Repository: Saraabdelmaksod/Task

## Overview

Automated UI tests written in Java using Selenium WebDriver and the Page Object Model (POM) pattern. Tests are designed to be run via Maven (or Gradle) and use a standard structure for pages, tests, and utilities.

## Status

- Author: Sara Abdelmaksod
- Last updated: 2026-09-01
- Stack: Java, Selenium WebDriver, JUnit/TestNG, Maven/Gradle, WebDriverManager (recommended)

## Prerequisites

- Java JDK 11 or newer
- Maven 3.6+ or Gradle (if project uses Gradle)
- Chrome or Firefox browser installed
- (Optional) Git

Note: WebDriver binaries can be managed automatically with WebDriverManager; otherwise provide driver executables (chromedriver/geckodriver) on PATH.

## Project layout (conventional)

- src/test/java/             -> test code
  - pages/                   -> Page Object classes
  - tests/                   -> Test classes
  - utils/                   -> helpers, test data, drivers
- src/test/resources/        -> test configuration (properties, testdata)

Adjust paths if the project uses a different layout or a src/main/test split.

## Setup / Installation

1. Clone the repository

   git clone https://github.com/Saraabdelmaksod/Task.git
   cd Task

2. Build and download dependencies (Maven example)

   mvn clean install


## Running tests

- Run the full test suite (Maven):

   mvn test

- Run a single test or test class:

   mvn -Dtest=LoginTest test

- Run with a specific browser:

   mvn test -Dbrowser=firefox

## Test design notes (Page Object Model)

- One Page Object class per page or screen. Each class exposes high-level actions (login(), searchFor(), getResults()).
- Tests should instantiate page objects and use their methods rather than low-level WebDriver calls.
- Keep locators and waiting logic inside page objects; keep assertions inside tests.

Example Page Object (conceptual):

- pages/LoginPage.java
  - enterUsername(String)
  - enterPassword(String)
  - submit()
  - isLoggedIn()

Example test flow:

1. Open start page
2. Login via LoginPage.login()
3. Assert expected behavior on HomePage

## Test reporting

- Add a reporter (Allure or ReportNG) if a richer HTML report is desired.

## Contributing

1. Fork the repo and create a branch: git checkout -b feature/my-feature
2. Add tests and update Page Objects as needed
3. Run tests locally and ensure they pass
4. Open a PR with a clear description and test evidence

## Troubleshooting

- Browser not found: ensure browser is installed or use the correct browser name (chrome, firefox)
- Driver mismatch: update WebDriverManager or download the compatible driver
- Flaky tests: add explicit waits in page objects and avoid brittle locators
