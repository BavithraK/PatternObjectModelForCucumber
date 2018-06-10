Feature: To login Leaftaps
Scenario Outline: To login Leaftaps
#Given Invoke LeafTap application
And Enter UserNames as <userName>
And Enter Passwords as <passWord>
And Click Login buttons
Then Close Browser
Examples:
|userName|passWord|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|
