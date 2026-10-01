package edu.upv.evaluacion;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize the Central System
        LockerSystem centralSystem = new LockerSystem("Polanco Express Terminal");

        // 2. Locker instantiation
        Locker locker1 = new Locker("L-101", "Medium", 15.50);
        Locker locker2 = new Locker("L-205", "Large", 25.00);

        // Register lockers in the system
        centralSystem.addLocker(locker1);
        centralSystem.addLocker(locker2);

        // 3. Parcel instantiation
        Parcel parcel1 = new Parcel("TRK98765", "Zaid Valdez", 2.5);
        Parcel parcel2 = new Parcel("TRK12345", "Fernando Cortez", 8.0);

        // 4. Operation simulations
        locker1.depositParcel(parcel1, 1234);

        // Report from the central module
        centralSystem.printGeneralReport();

        // 5. Retrievals
        System.out.println("Attempting to retrieve with code 9999...");
        locker1.retrieveParcel(9999, 5);

        System.out.println("\nAttempting to retrieve with code 1234...");
        locker1.retrieveParcel(1234, 5);

        // Final system report
        centralSystem.printGeneralReport();
    }
}