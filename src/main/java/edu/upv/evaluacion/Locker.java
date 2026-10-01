package edu.upv.evaluacion;

public class Locker {
    private String id;
    private String size;
    private boolean isAvailable;
    private int securityCode;
    private double hourlyRate;
    private Parcel storedParcel;

    public Locker(String id, String size, double hourlyRate) {
        this.id = id;
        this.size = size;
        this.hourlyRate = hourlyRate;
        this.isAvailable = true;
        this.storedParcel = null;
    }

    public void depositParcel(Parcel parcel, int code) {
        if (!isAvailable) {
            System.out.println("Error: Locker " + id + " is already occupied.");
            return;
        }
        this.storedParcel = parcel;
        this.securityCode = code;
        this.isAvailable = false;
        System.out.println("Parcel " + parcel.getTrackingNumber() + " deposited in locker " + id + ". Code configured.");
    }

    public void retrieveParcel(int enteredCode, int hoursStored) {
        if (isAvailable) {
            System.out.println("Locker " + id + " is empty.");
            return;
        }
        if (this.securityCode != enteredCode) {
            System.out.println("Operation rejected in locker " + id + ": Incorrect security code.");
            return;
        }

        double totalToPay = hoursStored * hourlyRate;
        System.out.println("\n--- Successful Retrieval ---");
        System.out.println("Parcel retrieved: " + storedParcel.getTrackingNumber());
        System.out.println("Hours stored: " + hoursStored);
        System.out.println("Total to pay: $" + totalToPay);

        this.storedParcel = null;
        this.securityCode = 0;
        this.isAvailable = true;
    }

    public void checkStatus() {
        System.out.println("\n--- Status of Locker " + id + " ---");
        System.out.println("Size: " + size);
        System.out.println("Hourly Rate: $" + hourlyRate);
        if (isAvailable) {
            System.out.println("State: Available");
        } else {
            System.out.println("State: Occupied");
            System.out.println("Stored parcel: " + storedParcel.getTrackingNumber() + " (Recipient: " + storedParcel.getRecipient() + ")");
        }
        System.out.println("----------------------------\n");
    }
}