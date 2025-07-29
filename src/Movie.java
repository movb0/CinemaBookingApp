/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Movie {
    private String title;
    private int availableSeats;

    public Movie(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    public String getTitle() {
        return title;
    }

    public synchronized boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        } else {
            return false;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
