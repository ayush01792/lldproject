🍽 Swiggy — Low Level Design
A low-level design implementation of a Swiggy-like food delivery platform, focusing on the core backend entities, relationships, and business logic.

This project models users, restaurants, menus, orders, and delivery agents in an object-oriented way, with an emphasis on clean class design, modularity, and extensibility.

📜 Problem Statement
Design the core backend system for an online food ordering platform similar to Swiggy. The system should allow:

Customers to register, search restaurants, browse menus, and place orders.

Restaurants to manage menus and update item availability.

Delivery agents to accept and deliver orders.

The system to assign delivery agents automatically based on availability and location.

🎯 Goals of the LLD
Demonstrate OOP concepts (Encapsulation, Inheritance, Polymorphism, Abstraction).

Implement clean relationships between entities.

Allow future scaling (e.g., payments, reviews, offers).

Showcase design patterns (Factory, Singleton, Strategy, Observer where applicable).

🛠 Tech Stack
Language: Java / Python / C++ (choose your actual implementation)

Design Patterns: Singleton, Factory, Strategy, Observer

Architecture: Layered (Models → Services → Controllers)

Storage: In-memory data structures (Map/List) for simplicity

📂 Project Structure
php
Copy
Edit
swiggy-lld/
│
├── models/                  # Entity classes
│   ├── User.java
│   ├── Restaurant.java
│   ├── MenuItem.java
│   ├── Order.java
│   ├── DeliveryAgent.java
│   └── enums/
│       ├── OrderStatus.java
│       └── PaymentStatus.java
│
├── services/                # Business logic
│   ├── UserService.java
│   ├── RestaurantService.java
│   ├── OrderService.java
│   ├── DeliveryService.java
│   └── PaymentService.java
│
├── controllers/             # API-like interface for testing
│   └── SwiggyController.java
│
├── utils/                   # Helpers
│   ├── LocationService.java
│   └── IdGenerator.java
│
├── diagrams/                # UML diagrams
│   └── class-diagram.png
│
└── README.md
🧩 Class Diagram
pgsql
Copy
Edit
+----------------+         +------------------+        +----------------+
|    User        |<>------>|     Order         |<>----- |  Restaurant    |
+----------------+         +------------------+        +----------------+
| id             |         | id               |        | id             |
| name           |         | items[]          |        | name           |
| location       |         | status           |        | menu[]         |
+----------------+         +------------------+        +----------------+
       ^
       |
+----------------+
| DeliveryAgent  |
+----------------+
| availability   |
| assignedOrders |
+----------------+
(Full diagram can be included as an image in /diagrams)

🔄 Flow
User Registration → Users sign up with location.

Restaurant Onboarding → Restaurants add menu items.

Menu Browsing → Users browse menu items by restaurant or category.

Order Placement → User places an order, status = PENDING.

Delivery Assignment → System assigns nearest available delivery agent.

Order Tracking → Status updates (PREPARING → PICKED → DELIVERED).

🚀 How to Run
Java
bash
Copy
Edit
javac Main.java
java Main
Python
bash
Copy
Edit
python main.py
(Adjust depending on your language)

📌 Sample Usage
java
Copy
Edit
User u1 = userService.registerUser("Nirvan", new Location(12.9716, 77.5946));
Restaurant r1 = restaurantService.addRestaurant("Pizza Palace", location);
restaurantService.addMenuItem(r1, "Veg Pizza", 250);

Order o1 = orderService.placeOrder(u1, r1, Arrays.asList("Veg Pizza"));
orderService.assignDelivery(o1);
🏗 Design Highlights
Singleton Pattern → Central SwiggyApp instance managing services.

Factory Pattern → For creating menu items and orders.

Strategy Pattern → Delivery assignment strategies (nearest agent, fastest ETA).

Observer Pattern → Notify users about order status updates.

🧪 Testing
Unit tests for services (JUnit / pytest).

Simulation scripts for creating users, restaurants, and placing multiple orders.

📌 Future Enhancements
✅ Payment integration (UPI, Cards)

✅ Customer reviews & ratings

✅ Offers, discounts, and coupons

✅ Real database integration (MySQL / MongoDB)

✅ Microservices-based scaling.
