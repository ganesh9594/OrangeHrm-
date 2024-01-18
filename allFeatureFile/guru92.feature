Feature: Test Facebook Application

  Scenario Outline: Test The Register Page Functionality
    Given user is on register page
    When user enter "<firstname>", "<lastname>","<username>", "<password>"
Examples:
|firstname|lastname|username|password|
|ganesh|mahadik|gm@123|ga456|
|aniket|pawar|ap@123|aa125|
