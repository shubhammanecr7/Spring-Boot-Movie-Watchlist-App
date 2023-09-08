# Spring-Boot-Movie-Watchlist-App

An IMDb rating-enabled movie watchlist app built with Spring Boot, allowing you to make informed decisions on your next movie night.
A web application for managing your movie watchlist. This project is developed using Spring Boot and Java.

## Overview

This Movies Watchlist App is designed for movie enthusiasts who want to keep track of the movies they want to watch. It provides features like adding new movies, updating movie details, and fetching real-time IMDb ratings using the OMDB API.

## Features

- Add new movies to your watchlist with details such as title, rating, priority, and comments.
- Edit existing movie entries to update their information.
- Delete movies from your watchlist.
- Real-time IMDb rating fetching based on the movie title.
- Easy-to-use web interface built with Thymeleaf templates.
- MySQL database for storing movie data.

## Getting Started

### Prerequisites
Before you begin, ensure you have met the following requirements:
- Java Development Kit (JDK) installed.
- STS4 installed.
- MySQL database server.
- OMDB API key (you can obtain it [here](https://www.omdbapi.com/)).

1. Configure Database:
Create a MySQL database for the application and note down the database name, username, and password. 
You'll need to update the database configuration in the application.
-Open the src/main/resources/application.properties file and configure the database connection properties:
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
-Replace your_database_name, your_database_username, and your_database_password with your MySQL database details.

2.Set OMDB API Key:
-Open the RatingService.java file located in src/main/java/com/shubham/service/ and set your OMDB API key:
String apiUrl = "https://www.omdbapi.com/?i=tt3896198&apikey=your_api_key&t=";
-Replace your_api_key with the API key you obtained from OMDB.

3.Build and Run:
If you're using STS (Spring Tool Suite):
-Open STS.
-Import the project into STS.
-Right-click on the project and select "Run As" > "Spring Boot App."
-Access the Application:
Once the application is running, open your web browser and go to http://localhost:8080/index to access the Movies Watchlist App.

--Now, you should have the Movies Watchlist App up and running on your local machine. You can start adding, editing, and managing movies in your watchlist. Enjoy your movie organization experience!
