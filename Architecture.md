# Architecture.md

## Class Diagram 1: **Reservation System Entities**

### Description:
This class diagram illustrates the main entities involved in the **BookNow reservation system**, including 
`Customer`, `Restaurant`, and `Reservation`. Each class represents a key entity in the system, containing 
attributes that define their properties. The relationships between these entities are represented with 
association lines.

- **Customer**: Represents the user of the system who can create reservations and log in. Attributes include:
    - `id`: Unique identifier for each customer.
    - `username`: The name the customer uses to log in.
    - `password`: The customer's login password.
    - `phoneNumber`: The customer's contact number.

- **Restaurant**: Represents a restaurant where reservations can be made. Attributes include:
    - `id`: Unique identifier for each restaurant.
    - `name`: Name of the restaurant.
    - `location`: Location of the restaurant.
    - `imagePath`: Path to the restaurant's image.
    - `description`: A brief description of the restaurant.
    - `rating`: The restaurant's overall rating.
    - `numberOfReviews`: The number of reviews submitted for the restaurant.
    - `price`: Price range of the restaurant.

- **Reservation**: Represents a reservation made by a `Customer` at a `Restaurant`. Attributes include:
    - `reservationId`: Unique identifier for the reservation.
    - `customer`: Links to the `Customer` who made the reservation.
    - `restaurant`: Links to the `Restaurant` where the reservation was made.
    - `reservationDateTime`: Date and time of the reservation.
    - `numberOfGuests`: The total number of guests included in the reservation.

### Diagram:
![Class Diagram](/Diagrams/ClassDiagram1.jpg)

This diagram shows how customers, restaurants, and reservations interact in the system. Each `Reservation` is linked to a specific `Customer` and `Restaurant`, reflecting the relationships between the entities in the application.

---
# Class Diagram 2: Reservation System (MVC Architecture)

## Description:
This class diagram extends the **BookNow reservation system** to follow the **Model-View-Controller (MVC)** architecture. The system is structured with three primary layers: **Models**, **Views**, and **Controllers**.

### **Models**:
The **Model** layer represents the core entities of the system. This layer contains the following classes:

1. **Customer**
  - **Attributes**:
    - `id: int` - Unique identifier for the customer.
    - `username: String` - Username for login.
    - `password: String` - Customer's password.
    - `phoneNumber: String` - Customer's phone number.
  - **Methods**:
    - `getId(): int` - Returns the unique identifier of the customer.
    - `setId(int id): void` - Sets the customer's unique identifier.
    - `getUsername(): String` - Returns the username of the customer.
    - `setUsername(String username): void` - Sets the username for the customer.
    - `getPassword(): String` - Returns the password of the customer.
    - `setPassword(String password): void` - Sets the customer's password.
    - `getPhoneNumber(): String` - Returns the customer's phone number.
    - `setPhoneNumber(String phoneNumber): void` - Sets the customer's phone number.

2. **Restaurant**
  - **Attributes**:
    - `id: int` - Unique identifier for each restaurant.
    - `name: String` - Name of the restaurant.
    - `location: String` - Location of the restaurant.
    - `imagePath: String` - Path to the restaurant image.
    - `description: String` - Brief description of the restaurant.
    - `rating: float` - Rating of the restaurant.
    - `numberOfReviews: int` - Total number of reviews.
    - `price: float` - Price range of the restaurant.
  - **Methods**:
    - `getId(): int` - Returns the unique identifier of the restaurant.
    - `setId(int id): void` - Sets the restaurant's unique identifier.
    - `getName(): String` - Returns the name of the restaurant.
    - `setName(String name): void` - Sets the name for the restaurant.
    - `getLocation(): String` - Returns the location of the restaurant.
    - `setLocation(String location): void` - Sets the location for the restaurant.
    - `getImagePath(): String` - Returns the path to the restaurant's image.
    - `setImagePath(String imagePath): void` - Sets the path to the restaurant's image.
    - `getDescription(): String` - Returns the description of the restaurant.
    - `setDescription(String description): void` - Sets the description for the restaurant.
    - `getRating(): float` - Returns the rating of the restaurant.
    - `setRating(float rating): void` - Sets the rating for the restaurant.
    - `getNumberOfReviews(): int` - Returns the total number of reviews for the restaurant.
    - `setNumberOfReviews(int numberOfReviews): void` - Sets the number of reviews for the restaurant.
    - `getPrice(): float` - Returns the price range of the restaurant.
    - `setPrice(float price): void` - Sets the price range for the restaurant.

3. **Reservation**
  - **Attributes**:
    - `reservationId: int` - Unique reservation ID.
    - `customer: Customer` - Customer who made the reservation.
    - `restaurant: Restaurant` - Restaurant where the reservation is made.
    - `reservationDateTime: LocalDateTime` - Date and time of the reservation.
    - `numberOfGuests: int` - Number of guests for the reservation.
  - **Methods**:
    - `getReservationId(): int` - Returns the unique reservation ID.
    - `setReservationId(int reservationId): void` - Sets the reservation ID.
    - `getCustomer(): Customer` - Returns the customer associated with the reservation.
    - `setCustomer(Customer customer): void` - Sets the customer for the reservation.
    - `getRestaurant(): Restaurant` - Returns the restaurant associated with the reservation.
    - `setRestaurant(Restaurant restaurant): void` - Sets the restaurant for the reservation.
    - `getReservationDateTime(): LocalDateTime` - Returns the date and time of the reservation.
    - `setReservationDateTime(LocalDateTime reservationDateTime): void` - Sets the date and time of the reservation.
    - `getNumberOfGuests(): int` - Returns the number of guests for the reservation.
    - `setNumberOfGuests(int numberOfGuests): void` - Sets the number of guests for the reservation.

### **Views**:
The **View** layer consists of the user interface (UI) for interacting with the system. These are defined using JavaFX and FXML files:
- **LoginView**: The UI for users to log in.
- **CreateAccountView**: The UI for new users to create an account.
- **BookNowView**: The main UI where users search for restaurants and create reservations.

### **Controllers**:
The **Controller** layer acts as the intermediary between the views and models. Each controller listens to events in the UI, interacts with the models, and updates the view:
1. **LoginController**
  - **Methods**:
    - `onLoginButtonAction()`: Handles the click event of the login button and authenticates the user.
    - `onCreateAccountButtonAction()`: Redirects users to the account creation page.

2. **CreateAccountController**
  - **Methods**:
    - `onCreateAccountButtonAction()`: Handles the account creation logic and communicates with the CustomerService to add the new user.
    - `onButtonLogin()`: Redirects users to the login page.

3. **BookNowController**
  - **Methods**:
    - `onGuestButtonAction()`: Opens the guest selection popup.
    - `onSearchButtonClick()`: Fetches and displays restaurants based on the selected filters.
    - `increaseAdults()`: Increases the count of adults.
    - `decreaseAdults()`: Decreases the count of adults.
    - `increaseChildren()`: Increases the count of children.
    - `decreaseChildren()`: Decreases the count of children.
    - `onConfirmReservation()`: Confirms the reservation and records it.
    - `onViewReservationHistory()`: Fetches and displays past reservations for the customer.
    - `onLeaveReview()`: Handles leaving a review for a selected restaurant.
    - `onCancelReservation()`: Handles the cancellation of a reservation.

### **Services**:
The system uses services to manage business logic and interaction with the models:
1. **AuthenticationService**
  - **Methods**:
    - `authenticate(String username, String password): boolean` - Authenticates the user with the provided credentials.

2. **CustomerService**
  - **Methods**:
    - `addCustomer(Customer customer): boolean` - Adds a new customer to the system.

  # RestaurantService
- **Methods**:
  - `getRestaurantsByLocation(String location): List<Restaurant>` - Retrieves a list of restaurants by location.
  - `getRestaurantsByCuisine(String cuisine): List<Restaurant>` - Retrieves a list of restaurants by cuisine.
  - `getRestaurantsByRating(int rating): List<Restaurant>` - Retrieves a list of restaurants by rating.
  - `getRestaurantsByPriceRange(String priceRange): List<Restaurant>` - Retrieves a list of restaurants by price range.
  - `submitReview(Restaurant restaurant, String review, int rating): boolean` - Submits a review for a restaurant and returns a success status.
  - `searchRestaurants(String location, String cuisine, LocalDateTime time): List<Restaurant>` - Searches for restaurants based on location, cuisine, and time.

# ReservationService
- **Methods**:
  - `selectReservation(Reservation reservation): boolean` - Selects a reservation and returns a success status.
  - `getReservationsByCustomer(Customer customer): List<Reservation>` - Retrieves a list of reservations for a given customer.
  - `getAvailableTimes(Restaurant restaurant): List<LocalDateTime>` - Retrieves available reservation times for a restaurant.
  - `cancelReservation(Reservation reservation): boolean` - Cancels a reservation and returns a success status.


### **Utilities**:
Utilities are responsible for handling shared services, such as alerting users and managing the database connection.
1. Alerts
- **Methods**:
  - `showInfoAlert(String title, String message): void` - Displays an informational alert with the specified title and message.
  - `showErrorAlert(String title, String message): void` - Displays an error alert with the specified title and message.
  - `showAlert(Alert.AlertType alertType, String title, String message): void` - A general method to show an alert of a specific type (INFORMATION or ERROR) with the given title and message.

2. **DatabaseConnection**
  - **Attributes**:
    - `url: String` - URL of the database.
    - `username: String` - Username for the database.
    - `password: String` - Password for the database.
  - **Methods**:
    - `connect(): Connection` - Establishes a connection to the database.

### Diagram:
![Class Diagram](Diagrams/ClassDiagram2.jpeg)

This diagram illustrates the relationships between models, views, controllers, services, and utilities. Each **View** sends user input to its corresponding **Controller**, which processes the input, interacts with the **Models** via the **Services**, and updates the **View** accordingly. The **DatabaseConnection** utility ensures that all interactions with the database are centralized and managed securely.

---

### Example: Interaction Flow
1. **Login Flow**:
  - The user enters their credentials in the **LoginView**. The **LoginController** validates the credentials through the **AuthenticationService**. If valid, the user is redirected to the **BookNowView**; otherwise, an error alert is displayed.

2. **Restaurant Search and Reservation Flow**:
  - In the **BookNowView**, the user enters search criteria (location, cuisine, etc.) and clicks the search button. The **BookNowController** retrieves the matching restaurants from the **RestaurantService** and displays them. The user can then select a restaurant and create a reservation, which is processed by the **ReservationService**.

---

### Adherence to MVC Principles:
1. **Separation of Concerns**:
  - The system is divided into distinct layers (Model, View, Controller), each handling a specific part of the system logic.
2. **High Cohesion, Low Coupling**:
  - The components are cohesive and interact minimally with one another. The Views are separate from the Models, and all interactions occur through the Controllers.
3. **Controller as the Mediator**:
  - All communication between Views and Models occurs via the Controllers, ensuring modularity and easy updates.


# Sequence Diagram for Customer Login and Restaurant Search

## Overview
In this milestone, we focus on the use case where a customer logs in and searches for restaurants. This sequence diagram captures the interactions between various components in the system, illustrating the flow of messages and the relationships between the classes.

## Use Case
The most complicated use case selected from Milestone 2 involves the following steps:
1. **Customer initiates login.**
2. **Login processing and validation.**
3. **Successful login triggers the restaurant search.**
4. **Customer selects search criteria.**
5. **Fetch available restaurants based on selected criteria.**
6. **Display results to the customer.**

## Sequence Diagram

![Sequence Diagram](Diagrams/SequenceDiagram.jpg)

# Sequence Diagram

- **Customer**: The user who interacts with the application.

- **LoginController**: Handles the login process.
  - Calls `onLoginButtonAction()` when the customer initiates a login.
  - Invokes `authenticate(username, password)` from the `AuthenticationService` to verify credentials.

- **AuthenticationService**: Verifies the provided credentials.
  - Calls `authenticate(username, password)` to check the validity of the login.
  - Returns `authenticationResult` indicating success or failure.

- **BookNowController**: Manages the main application flow.
  - If login is successful, it calls `displayLoginResult(success)`.
  - If login fails, it invokes `Alerts(title: message)` to notify the user.

- **Search Button Action**: After a successful login, the customer can search for restaurants.
  - Calls `onSearchButtonClick()` to initiate the search process.

- **RestaurantService**: Responsible for fetching restaurants.
  - The method `searchRestaurants(location, cuisine, time)` is called with the selected criteria.
  - Calls `getRestaurantsByLocation(location)` and `getRestaurantsByCuisine(cuisine)` to fetch available restaurants based on the selected filters.

- **Display Results**: Finally, the `BookNowController` calls `displayRestaurants(availableRestaurantsList)` to update the view with the list of available restaurants based on the search criteria.

## Conclusion
This sequence diagram effectively illustrates the interactions and flow of control during the customer login and restaurant search process. It demonstrates how the MVC architecture components collaborate to handle user actions, providing a clear understanding of the system's behavior in this use case.
