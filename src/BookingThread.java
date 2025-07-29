/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class BookingThread extends Thread {
    private Movie movie;

    public BookingThread(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        synchronized (movie) {
            boolean isBooked = movie.bookSeat();
            if (isBooked) {
                System.out.println(Thread.currentThread().getName() + " successfully booked a seat for " + movie.getTitle());
            } else {
                System.out.println(Thread.currentThread().getName() + " failed to book a seat for " + movie.getTitle());
            }
        }
    }
}

