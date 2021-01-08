Feature: Book a ticket in Hotel Booking Application

Scenario: To validate  whether User is logged in to a Hotel Booking Application Login page
Given Launch the login.html application browser
When Open the web page login in the browser
Then Verify login page heading as Hotel Booking Application 
And Enter UserName and Ensure that displays the error message Please enter UserName upon clicking on the Login button without entering any data in the text box
And  Enter Password and Ensure that displays the error message Please enter Password upon clicking on the Login button without entering any data in the text box
And Verify the user successfully logged in to Hotel Booking

Scenario: Verify User is able to ente the Personal details in Hotel Booking Form
Given User navigated to Hotel Booking 
When user is in Personal details section
Then Enter First Name Ensure that the alert box displays the message Please fill the First Name upon clicking on the button Confirm Booking without entering any data in the text box
And Enter Last Name Ensure that the alert box displays the message Please fill the Last Name upon clicking on the button Confirm Booking without entering any data in the text box
And Enter Email Ensure that the alert box displays the message Plese fill the Email upon wrong email format entered in the text box
And Enter mobile no Ensure that the alert box displays the message Please fill the Mobile No upon clicking on the button Confirm Booking without entering any data in the text box
And Ensure that the alert box displays the message Please enter valid Contact no upon clicking on the button Confirm Booking on entering wrong data that doesnot start with either 7 8 or 9 and doesnot have 10 digits in the text box
And Enter mobile no Ensure that the alert box displays the message Please fill the Mobile No upon clicking on the button Confirm Booking without entering any data in the text box
And Enter address details validation for address
And Select Number of people staying at the Hotel Ensure that the alert box displays the message Number of people attending upon clicking on the button Confirm Booking without entering any data in the box
And Select City Ensure that alert box display the message Please select city upon clicking on the button Confirm Booking without selecting any city
And Select State Ensure that alert box display the message Please select state upon clicking on the button Confirm Booking without selecting any state
And Enter Card Holder Name Ensure that the alert box displays the message Please fill the Card holder name upon clicking on the button Confirm Booking without entering any data in the text box
And Enter Debit card Number Ensure that the alert box displays the message Please fill the Debit card Number upon clicking on the button Confirm Booking without entering any data in the text box
And Enter Card expiration month Ensure that the alert box displays the message Please fill expiration month upon clicking on the button Confirm Booking without entering any data in the text box
And Enter Card expiration year Ensure that the alert box displays the message Please fill expiration year upon clicking on the button Confirm Booking without entering any data in the text box
And Click on Confirm Booking button Ensure that it navigates to success page which displays the message Booking Completed
And SuccessMessage is displayed