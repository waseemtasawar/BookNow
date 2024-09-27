# Requirements


## Case Diagram
![BookNow](pictures/CaseDiagram.jpg)

## Non-functional Requirements

1. **Performance**:
    - *Explanation*: The application should quickly return search results and manage user inputs without delay.
    - *Implementation*: Implement database indexing and optimize SQL queries to speed up the search for restaurants based on location, cuisine type, and other filters.

2. **Portability**:
    - *Explanation*: The application should be able to run on different operating systems (Windows, macOS, Linux) without needing significant changes to the codebase.
    - *Implementation*: Since the application is written in Java, it will leverage Java's "write once, run anywhere" (WORA) principle. The application will be built into an executable JAR 
file to be easily executed on any system that has the Java Runtime Environment (JRE) installed.

3. **Usability**:
    - *Explanation*: The interface should be intuitive and user-friendly, enabling users to quickly navigate the app.
    - *Implementation*: Create a clean, minimalist design with helpful tooltips, responsive error handling, and user feedback mechanisms.

---

## Functional Requirements

### **Use Case 1: Create a Reservation**
- **Actors**: Customer
- **Use case goal**: Allow customers to create a reservation.
- **Primary Actor**: Customer
- **Preconditions**: Customer must be logged in, restaurant data must be available.
- **Basic flow**:
    1. Customer selects a restaurant, Cuisine, location, date, time, and number of guests.
    2. Customer confirms the reservation.
    3. System records the reservation.
    4. Customer receives confirmation.
- **Alternative flow 1**: Customer cancels reservation. 
  * The system discards the entered data and returns the customer to the main dashboard.
  - **Alternative flow 2**: System alerts customer if the time slot is unavailable.
  * If the customer selects a time that is already booked. The system displays an alert to
the customer informing them of the unavailability and suggests alternative time slots.

### **Use Case 2: Sign Up for an Account**
- **Actors**: New User
- **Use case goal**: Create a new user account.
- **Primary Actor**: New User
- **Preconditions**: The new user is not already registered.
- **Basic flow**:
    1. User enters a username, password, and confirmation password.
    2. System validates the input.
    3. User is added to the database and logged in.
- **Alternative flow 1**: User enters mismatched passwords.
- **Alternative flow 2**: Username is already taken.

### **Use Case 3: Search Restaurants**
- **Actors**: Customer
- **Use case goal**: Search for restaurants based on location, cuisine type, etc.
- **Primary Actor**: Customer
- **Preconditions**: Restaurants must be registered in the system.
- **Basic flow**:
    1. Customer selects filters (location, cuisine type, etc.).
    2. The system returns a list of matching restaurants.
- **Alternative flow 1**: No restaurants match the search criteria.

### **Use Case 4: Leave a Review**
- **Actors**: Customer
- **Use case goal**: Allow customers to leave reviews after visiting a restaurant.
- **Primary Actor**: Customer
- **Preconditions**: Customer must have visited the restaurant and made a reservation.
- **Basic flow**:
    1. Customer selects a past reservation.
    2. Customer leaves a review and a rating.
    3. System saves the review and updates the restaurant’s rating.
- **Alternative flow 1**: The customer cancels before submitting the review.

### **Use Case 5: View Reservation History**
- **Actors**: Customer
- **Use case goal**: Allow customers to view past reservations.
- **Primary Actor**: Customer
- **Preconditions**: Customer must be logged in.
- **Basic flow**:
    1. Customer navigates to their account page.
    2. Customer views the list of previous reservations.
- **Alternative flow 1**: No past reservations exist.

### **Use Case 6: Cancel Reservation**
- **Actors**: Customer
- **Use case goal**: Allow customers to cancel a reservation.
- **Primary Actor**: Customer
- **Preconditions**: A valid reservation must exist.
- **Basic flow**:
    1. Customer selects a future reservation.
    2. Customer cancels the reservation.
    3. System updates the reservation status.
- **Alternative flow 1**: Reservation is not cancellable (e.g., within a restricted time window).

---


