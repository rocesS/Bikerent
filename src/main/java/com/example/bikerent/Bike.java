package com.example.bikerent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
class Bike {

    @Id
    private Long id;
    private String model;
    private String serialNo;
    private double hourPrice;
    private double dayPrice;
    private String borrowerId;
    private LocalDateTime dateOfReturn;

    public Bike(Long id, String model, String serialNo, double hourPrice) {}

    public Bike() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public LocalDateTime getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDateTime dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public Bike(Long id, String model, String serialNo, double hourPrice, double dayPrice) {
        this.id = id;
        this.model = model;
        this.serialNo = serialNo;
        this.hourPrice = hourPrice;
        this.dayPrice = dayPrice;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", hourPrice=" + hourPrice +
                ", dayPrice=" + dayPrice +
                ", borrowerId='" + borrowerId + '\'' +
                ", dateOfReturn=" + dateOfReturn +
                '}';
    }

    public double getHourPrice() {
        return hourPrice;
    }
}

