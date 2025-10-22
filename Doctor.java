/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hoang
 */
// File: Doctor.java

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Doctor {
    private int id;
    private String name;
    private String dateOfBirth;
    private String specialization;
    private int availability;
    private String email;
    private String numberPhone; // <-- ĐÃ ĐỔI TÊN: từ 'mobile' thành 'numberPhone'

    public Doctor(int id, String name, String dateOfBirth, String specialization, int availability, String email, String numberPhone) { // <-- ĐÃ ĐỔI TÊN
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.specialization = specialization;
        this.availability = availability;
        this.email = email;
        this.numberPhone = numberPhone; // <-- ĐÃ ĐỔI TÊN
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    // Helper method to parse Date for sorting
    public Date getDobAsDate() {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        } catch (ParseException e) {
            // This should not happen if validation is correct
            return null; 
        }
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // --- BẮT ĐẦU THAY ĐỔI CHO SỐ ĐIỆN THOẠI ---
    
    public String getNumberPhone() { // <-- ĐÃ ĐỔI TÊN: từ 'getMobile' thành 'getNumberPhone'
        return numberPhone; // <-- ĐÃ ĐỔI TÊN
    }

    public void setNumberPhone(String numberPhone) { // <-- ĐÃ ĐỔI TÊN: từ 'setMobile' thành 'setNumberPhone'
        this.numberPhone = numberPhone; // <-- ĐÃ ĐỔI TÊN
    }
    
    // --- KẾT THÚC THAY ĐỔI ---

    // toString method to display doctor information
    @Override
    public String toString() {
        String avail;
        switch (availability) {
            case 0: avail = "In vacation"; break;
            case 1: avail = "Available"; break;
            case 2: avail = "Busy in emergency"; break;
            case 3: avail = "In diagnosing"; break;
            default: avail = "Unknown";
        }
        
        return String.format("%-5d | %-20s | %-12s | %-20s | %-20s | %-25s | %-15s",
                id, name, dateOfBirth, specialization, avail, email, numberPhone); // <-- ĐÃ ĐỔI TÊN
    }
}
