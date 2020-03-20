Feature: verifying website availability search functionality
Scenario Outline: verifying website availability search functionality
Given user launch browser
When user enter url
And user click on get started button
And user click on add to cart button of desired package
And user enter the domain name which you want to register "<domainname>"
Examples:
|domainname|
|shivika222|
