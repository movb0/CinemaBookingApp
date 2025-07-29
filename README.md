# 🎬 CinemaBookingApp

A simple Java console application that simulates a multithreaded cinema seat booking system. This project demonstrates the use of **threads** and **synchronized blocks** in Java.

## 🧠 Key Concepts

- **Multithreading** with `Thread` class
- **Shared object access** using `synchronized` block
- **Thread-safe booking** to avoid race conditions- Basic object-oriented design

---

## 📦 Class Overview

### `Movie.java`
Represents a movie with:
- A title
- A number of available seats
- A `bookSeat()` method that checks and updates seat availability using `synchronized`

### `BookingThread.java`
Extends `Thread`:
- Tries to book a seat from the shared `Movie` object
- Prints whether the booking was successful or not

### `CinemaBookingApp.java`
Main class:
- Creates a `Movie` with 100 available seats
- Starts 5 threads to simulate 5 customers booking simultaneously
- Waits for all threads to finish
- Prints the final number of available seats

---

## 🏃‍♂️ How to Run

1. Compile the classes:

```bash
javac src/*.java
