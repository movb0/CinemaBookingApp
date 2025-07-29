/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class CinemaBookingApp {
    public static void main(String[] args) {
        Movie movie = new Movie("Avengers: Endgame", 100); // Create a movie object with 100 available seats

        BookingThread thread1 = new BookingThread(movie);
        BookingThread thread2 = new BookingThread(movie);
        BookingThread thread3 = new BookingThread(movie);
        BookingThread thread4 = new BookingThread(movie);
        BookingThread thread5 = new BookingThread(movie);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final number of available seats: " + movie.getAvailableSeats());
    }
}

