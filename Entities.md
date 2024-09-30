# Entities

## Case Diagram
![BookNow](Diagrams/CaseDiagram.jpg)

Entities in the BookNow application I have describes their roles and attributes.

### 1. **Customer**
- **Description**: The `Customer` entity represents a user who can create an account, log in, and make reservations.
- **Attributes**:
    - `id`: The unique identifier for the customer.
    - `username`: The username chosen by the customer for logging in.
    - `password`: The customer's password.
    - `phoneNumber`: Contact information for the customer.

---

### 2. **Restaurant**
- **Description**: The `Restaurant` entity represents a restaurant that users can search for and make reservations, etc.
- **Attributes**:
  - `String name`: The name of the restaurant.
  - `String location`: The location of the restaurant.
  - `float rating`: The rating of the restaurant (on a scale from 1 to 5).
  - `float price`: The price range of the restaurant.

---

### 3. **Reservation**
- **Description**: The `Reservation` entity represents a reservation made by a customer at a restaurant for a specific date and time.
- **Attributes**:
  - `Customer customer`: The customer who made the reservation.
  - `Restaurant restaurant`: The restaurant where the reservation is made.
  - `LocalDateTime reservationDateTime`: The date and time of the reservation.
  - `int numberOfGuests`: The number of guests for the reservation.

---

