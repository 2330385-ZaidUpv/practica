package edu.upv.evaluacion;

public class Parcel {
    private String trackingNumber;
    private String recipient;
    private double weightKg;


    //Setter el trackingnumber es el numero de rastreo, el recipient es la persona destinataria y weight el peso
    public Parcel(String trackingNumber, String recipient, double weightKg) {
        this.trackingNumber = trackingNumber;
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    // Getters
    public String getTrackingNumber() { return trackingNumber; }
    public String getRecipient() { return recipient; }
    public double getWeightKg() { return weightKg; }
}