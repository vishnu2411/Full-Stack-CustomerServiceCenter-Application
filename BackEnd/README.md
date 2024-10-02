# CustomerServiceCenter - Backend

Folder Structure

    ├── src/
    │   ├── main/
    │     ├── java/
    │     │   └── com/
    │     │       └── example/
    │     │           └── customerService/
    │     │               ├── controller/  
    │     │               |      ├── CustomerServiceController.java
    │     │               ├── model/    
    │     │               |      ├── RegularHours.java
    │     │               |      ├── SpecialHours.java
    │     │               |      ├── SpecialHoursResponse.java     
    │     │               |── service/    
    │     │               |      ├── CustomerService.java
    │     │               |── CustomerServiceApplication.java
    │     └── resources/
    │         └── application.properties         
    │                                   
    ├── build.gradle
    ├── README.md    
    
Steps to run:

1. clone the repository to your local.
2. Open the project in any IDE and run the CustomerServiceApplication.java class
3. The Application will be live at http://localhost:8080
4. You can access the end points using postman or any other API Tool.


## API Endpoints

### 1. GET /api/hours/regular
    
    Response Code:
        200 OK (fetched result sucessfully)
    Purpose: 
        Retrieve regular customer support hours.
    
    Sample Response:
        [
            {
                "day": "Monday - Thursday",
                "hours": "8 AM - 7:45 PM"
            },
            {
                "day": "Friday",
                "hours": "9 AM - 7:45 PM"
            },
            {
                "day": "Saturday",
                "hours": "9 AM - 5:45 PM"
            },
            {
                "day": "Sunday",
                "hours": "9 AM - 5:45 PM"
            }
        ]

### 2. GET /api/hours/special
    
    Response Code:
        200 OK (fetched result sucessfully)
    Purpose: 
        Retrieve special customer support hours.
    
    Headers: 
        The Current Date for which special hours are fetched
        {
          "date": "2024-09-30",
          "hours": "10:00 - 14:00",
          "message": "Annual General Meeting"
        }
    Sample Response:
        {
            "specialHours": {
                "date": "2024-09-30",
                "hours": "10:00 - 14:00",
                "message": "Annual General Meeting"
            },
            "message": "We are operating in Special Hours Today!!"
        }

### 3. POST /api/hours/special
    
    Response Code:
        201 OK (Posted Data Sucessfully)
    Purpose: 
        Add new special hours.
    
    Sample Body:
        {
            "date": "2024-09-30",
            "hours": "10:00 - 14:00",
            "message": "Annual General Meeting"
        }

    Sample Response:
        {
            "date": "2024-09-30",
            "hours": "10:00 - 14:00",
            "message": "Annual General Meeting"
        }

## Sample Outputs with Screenshots
   1. Fetch Regular Hours:
      
      ![image](https://github.com/user-attachments/assets/92c4fd2a-4803-4fd1-96d0-70758e96743b)

  2. Fetch Special Hours with no special hours for given date
     
      ![image](https://github.com/user-attachments/assets/e4cec256-e37e-4f4b-91cf-34334729480c)

  3. Post Special Hours
     
     ![image](https://github.com/user-attachments/assets/3a66ac39-ce75-4c8e-9883-c99120456bb2)

  4. Fetch Special Hours with Special Hours for given date

     ![image](https://github.com/user-attachments/assets/484d5386-7d7b-403d-9f95-089b5f0a6e83)



