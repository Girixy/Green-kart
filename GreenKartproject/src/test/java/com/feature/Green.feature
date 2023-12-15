Feature: GreenKart automation

Scenario: User buy vegetables in GreenKart

Given user launch the url
When user search the vegetables
And user click search icon
And user click addtocart
And user click items
And user click proceedtocheckout
Then next page shown

Scenario: User Placed the order

When user enter promo code
And user click the apply button
And user click the Place order
Then the next page Shown

Scenario: last page of the application

When user select the country
And user click the agree button
And user click the proceed 