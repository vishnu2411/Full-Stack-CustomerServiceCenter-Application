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

