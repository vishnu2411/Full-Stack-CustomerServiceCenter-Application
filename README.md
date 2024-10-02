# Full Stack Customer Service Center Application

This Application is divided into 2 parts:
1. Frontend
2. Backend


# 1.Frontend

Overview

The frontend of the application is built using React and TypeScript. It provides an interactive interface for users to view customer support hours and submit special hours for upcoming dates.

Folder Structure                 
    
    ├── src/
    |   ├── components/         
    │   │   ├── ContactOptions.tsx
    │   │   ├── HoursDisplay.tsx
    │   │   └── SpecialHoursForm.tsx
    │   ├── App.tsx              
    │   ├── App.css            
    │   └── data.ts            
    ├── public/                
    │   └── index.html
    |── package.json             

Steps to run:

1. clone the repository to your local.
2. Open the terminal and give the command npm start.
3. The Application can be viewed at http://localhost:3000/

# 2.Backend

Overview

The backend of the application is built using Spring Boot. It exposes RESTful APIs for managing and retrieving customer support hours.

Folder Structure

   
    ├── src/
    │   ├── main/
    │     ├── java/
    │     │   └── com/
    │     │       └── example/
    │     │           └── customerService/
    │     │               ├── controller/        
    │     │               ├── model/            
    │     │               ├── repository/       
    │     │               └── service/           
    │     └── resources/
    │         └── application.properties         
    │                                   
    ├── pom.xml    
    
Steps to run:

1. clone the repository to your local.
2. Open the project in any IDE and run the CustomerServiceApplication.java class
3. The Application will be live at http://localhost:8080
4. You can access the end points using postman or any other API Tool.
