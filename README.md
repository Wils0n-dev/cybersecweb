# CyberSecWeb

CyberSecWeb is a Grails web application designed as a learning project in cybersecurity. It simulates a simple login system with account lockout functionality, showing how web applications handle authentication and user input.

## Technologies Used

This project combines **three programming languages**:

1. **Groovy** – The main language of Grails.  
   - Used in controllers (`LoginController.groovy`) to handle login logic, user authentication, and account lockouts.  

2. **GSP (Groovy Server Pages)** – Grails’ templating language.  
   - Used in the `grails-app/views/login/login.gsp` file to create the login page form and dynamically display messages from the controller.  

3. **HTML** – Standard markup embedded in GSP.  
   - Structures the content of the webpage, including headings, input fields, and buttons for the login form.  

## Features

- A login page with username and password fields.
- Dynamic messages for login success, failure, and account lockout after 3 failed attempts.
- Demonstrates a simple web app workflow using Grails MVC architecture.
## How to Run

1. **Install Grails**  
   - Download and install [Grails](https://grails.org/download.html), version 7.0.8 recommended.  

2. **Clone the repository**

```bash
git clone https://github.com/YOUR_USERNAME/cybersecweb.git

Navigate into the project folder

cd cybersecweb

Start the Grails application

.\grailsw.bat run-app

Open the login page in your browser

http://localhost:8080/login/login

You should now see the login page and can test the login functionality.
