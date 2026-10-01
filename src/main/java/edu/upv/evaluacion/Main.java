package edu.upv.evaluacion;

public class Main {
    public static void main(String[] args) {
        // 1. Locker instanciado
        //Hay un nuevo casillero con id y su tamaño a parte la hora en la que llego que son los
        Locker locker1 = new Locker("L-101", "Medium", 15.50);
        Locker locker2 = new Locker("L-205", "Large", 25.00);

        // 2. Instancia del paquete
        Parcel parcel1 = new Parcel("TRK98765", "Said Polanco", 2.5);
        Parcel parcel2 = new Parcel("TRK12345", "Zaid Valdez", 8.0);

        locker1.checkStatus();

        // 3. simulacion de deposito exitos
        locker1.depositParcel(parcel1, 1234);

        locker1.checkStatus();

        // 4. simulacion de recuperacion fallida
        System.out.println("\nAttempting to retrieve with code 9999...");
        locker1.retrieveParcel(9999, 5);

        // 5. simulacion de recuperacion fallida
        System.out.println("\nAttempting to retrieve with code 1234...");
        locker1.retrieveParcel(1234, 5);

        locker1.checkStatus();
    }
}