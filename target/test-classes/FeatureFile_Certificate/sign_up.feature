Feature: certificate Service 

Scenario Outline: Sign Up functionality with valid and invalid credentials.
Given user landing on certificate service sign In page
And  User navigated to Sign Up page
When user enter valid details in "<FirstName>""<LastName>""<UserName>""<Email>""<Password>" and "<Confirmpassword>"
And click on Sign Up 
Then User navigated to Sign In page

Examples:
|FirstName  |LastName  |UserName       |Email               |Password        |Confirmpassword |
|kajal      |mishra    |kajal8015       |kajal8500@gmail.com     |kajal5555  |kajal5555      |
|Nisha      |Patel     |nishaa5555     |nishaa@gmail.com    |nish5555        |nish5555       |
|kajal      |mishra     |kajal5555     |kajal@gmail.com     |kajal5555       |kajal55        |   #pass unmatched
|kajal      |mishra     |kajal5555     |kajalk@gmail.com     |kajal5555       |kajal5555      |  #dupli username
|kajal      |mishra     |kajal55       |kajal@gmail.com     |kajal5555       |kajal5555      |   #dupli email
|k          |m          |kajal@        |kajal@gmail.com     |kajal           |kajal      |  #invalid username and password
|           |           |              |                    |                |            | # all blank