# TestOne


Hey guys,
welcome to project TestOne projetc.

In addition to performing the test on the platform, I ran the tests using Selenium with Java. The tests are running using the Google Chrome browser.
In addition, the project uses PageObject and best practices.
To run in your browser, you will need to download ChromeDrive and point to its directory in the "constants" class.

TrustlyTest/src/main/java/Home

Classes:

Constant:
It has data that can be changed throughout the life of the project and that are allocated in a specific class, for better maintenance. Login data, directories for example are located in this location.

DSL:
In this class are well described methods that will facilitate interaction with selenium methods. With that, I changed generic methods for specific ones, for the action we want to execute at that moment.

LoginPage:
Class where all screen elements are located. By centralizing the locators on a Page, code maintenance will be much easier. This will also help when we use the same element in several tests.

TestLogin:
Main class with test calls.

Hope you like it!
