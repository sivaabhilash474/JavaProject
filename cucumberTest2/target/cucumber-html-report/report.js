$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the login feature of facebook",
  "description": "",
  "id": "testing-the-login-feature-of-facebook",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Facebook"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To verify the login page",
  "description": "",
  "id": "testing-the-login-feature-of-facebook;to-verify-the-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User navigated to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Entered \"\u003cusername\u003e\" as username and \"\u003cpassword\u003e\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User \"\u003cvalidateLogin\u003e\" to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "testing-the-login-feature-of-facebook;to-verify-the-login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "validateLogin"
      ],
      "line": 11,
      "id": "testing-the-login-feature-of-facebook;to-verify-the-login-page;;1"
    },
    {
      "cells": [
        "sivapothireddy474@gmail.com",
        "YWJoaV8xMjM\u003d",
        "shouldgo"
      ],
      "line": 12,
      "id": "testing-the-login-feature-of-facebook;to-verify-the-login-page;;2"
    },
    {
      "cells": [
        "xxx@gmail.com",
        "xxx",
        "shouldnot"
      ],
      "line": 13,
      "id": "testing-the-login-feature-of-facebook;to-verify-the-login-page;;3"
    },
    {
      "cells": [
        "sivapohireddy4432@gmail.com",
        "kasdflaj",
        "shouldnot"
      ],
      "line": 14,
      "id": "testing-the-login-feature-of-facebook;to-verify-the-login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "To verify the login page",
  "description": "",
  "id": "testing-the-login-feature-of-facebook;to-verify-the-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Facebook"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigated to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Entered \"sivapothireddy474@gmail.com\" as username and \"YWJoaV8xMjM\u003d\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User \"shouldgo\" to home page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginSteps.user_navigated_to_the_login_page()"
});
formatter.result({
  "duration": 6522305878,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sivapothireddy474@gmail.com",
      "offset": 9
    },
    {
      "val": "YWJoaV8xMjM\u003d",
      "offset": 55
    }
  ],
  "location": "FacebookLoginSteps.entered_as_username_and_as_password(String,String)"
});
formatter.result({
  "duration": 1864325328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldgo",
      "offset": 6
    }
  ],
  "location": "FacebookLoginSteps.user_to_home_page(String)"
});
formatter.result({
  "duration": 183065,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginSteps.close_the_browser()"
});
formatter.result({
  "duration": 2082668902,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To verify the login page",
  "description": "",
  "id": "testing-the-login-feature-of-facebook;to-verify-the-login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Facebook"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigated to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Entered \"xxx@gmail.com\" as username and \"xxx\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User \"shouldnot\" to home page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginSteps.user_navigated_to_the_login_page()"
});
formatter.result({
  "duration": 169208,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xxx@gmail.com",
      "offset": 9
    },
    {
      "val": "xxx",
      "offset": 41
    }
  ],
  "location": "FacebookLoginSteps.entered_as_username_and_as_password(String,String)"
});
formatter.result({
  "duration": 33435295,
  "error_message": "org.openqa.selenium.NoSuchSessionException: no such session\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027DESKTOP-8MPHSFA\u0027, ip: \u0027192.168.29.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73), userDataDir\u003dC:\\Users\\sivaa\\AppData\\Local\\Google\\Chrome\\User Data\\Default}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d64.0.3282.186, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 1f6743df9e81375d24e8d076edb729fa\n*** Element info: {Using\u003dcss selector, value\u003d#email}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:450)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat pageClasses.FacebookLoginPage.setUsername(FacebookLoginPage.java:27)\r\n\tat pageClasses.FacebookLoginPage.login(FacebookLoginPage.java:44)\r\n\tat stepdefinitions.FacebookLoginSteps.entered_as_username_and_as_password(FacebookLoginSteps.java:25)\r\n\tat ✽.When Entered \"xxx@gmail.com\" as username and \"xxx\" as password(login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldnot",
      "offset": 6
    }
  ],
  "location": "FacebookLoginSteps.user_to_home_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FacebookLoginSteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "To verify the login page",
  "description": "",
  "id": "testing-the-login-feature-of-facebook;to-verify-the-login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Facebook"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigated to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Entered \"sivapohireddy4432@gmail.com\" as username and \"kasdflaj\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User \"shouldnot\" to home page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginSteps.user_navigated_to_the_login_page()"
});
formatter.result({
  "duration": 143316,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sivapohireddy4432@gmail.com",
      "offset": 9
    },
    {
      "val": "kasdflaj",
      "offset": 55
    }
  ],
  "location": "FacebookLoginSteps.entered_as_username_and_as_password(String,String)"
});
formatter.result({
  "duration": 10011699,
  "error_message": "org.openqa.selenium.NoSuchSessionException: no such session\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027DESKTOP-8MPHSFA\u0027, ip: \u0027192.168.29.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73), userDataDir\u003dC:\\Users\\sivaa\\AppData\\Local\\Google\\Chrome\\User Data\\Default}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d64.0.3282.186, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 1f6743df9e81375d24e8d076edb729fa\n*** Element info: {Using\u003dcss selector, value\u003d#email}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:450)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat pageClasses.FacebookLoginPage.setUsername(FacebookLoginPage.java:27)\r\n\tat pageClasses.FacebookLoginPage.login(FacebookLoginPage.java:44)\r\n\tat stepdefinitions.FacebookLoginSteps.entered_as_username_and_as_password(FacebookLoginSteps.java:25)\r\n\tat ✽.When Entered \"sivapohireddy4432@gmail.com\" as username and \"kasdflaj\" as password(login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldnot",
      "offset": 6
    }
  ],
  "location": "FacebookLoginSteps.user_to_home_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FacebookLoginSteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});