Feature: Hotel Booking In Adactin Application

@smoketest
Scenario Outline:: User Login In The Web Application

Given user Launch The Adactin Application

When user Enter The "<username>" In Username Field

And user Enter The "<password>" In Password Field

Then user Click The Login Button And It Navigates To Search Hotel Page

Examples:
|username|password|
|AAA|123|
|deneshdb|samjam1466|

Scenario: Searching A Hotel In The Web Application

When user Select The Location From Dropdown

And user Select The Hotel From Dropdown

And user Select The Room Type From Dropdown

And user Select The Number Of Rooms From Dropdown

And user Enter The Check In Date In Check In Date Field

And user Enter The Check Out  Date In Check Out Date Field

And user Select The Adults Per Room In The Adults Per Room Field

And user Select The Childrens Per Room In The Childrens Per Room Field

Then user Click The Search Button And It Navigates To Search Hotel Page


Scenario: Selecting A Hotel In The Web Application

When user Select The Option In Select Hotel Field

Then user Click The Continue Button And It Naviagtes To Book A Hotel Page


Scenario: Booking A Hotel In The Web Application

When user Enter The First Name In The First Name Field

And user Enter The Last Name In The Last Name Field

And user Enter The Billing Address In The Billing Address Field

And user Enter The  Credit Card Number In The Credit Card Number Field

And user Select The Credit Card Type From Dropdown

And user Select The  Select Month Dropdown In Expiry Date Field

And user Select The Select Year Dropdown In Select Year Field

And user Enter The Cvv Number In Cvv Number Field

Then user Click The Book Now Button And It Will Navigates To Booking Confirmation Page



Scenario: Logging Out In The Booking Confirmation Page

When user Click The Log Out Button





