
Feature: certificate Service functionality 

Scenario Outline: Sign In functionality
Given landing on certificate service sign In page
When user enter "<Username>" and "<Password>"
And Click on Sign in button
Then user navigated to homepage
 
 Examples: 
 |Username  | Password | 
 |tina9999  |tina1234  |    #valid credentials
 |krisha9|krisha1234|       # invalid username and valid password
 |mina9977  |mina12  |      #valid username and invalid password
 |          |tina1234  |    # blank username
 |tina9999  |          |    # blank password
 |tina    9999  |tina1234  |  #username with space
 |tina9999  |tina     1234  |  #password with space
   