package edu.upv.evaluacion;

import java.util.ArrayList;
import java.util.List;

public class LockerSystem {
    private String branchName;
    private List<Locker> lockerDirectory;

    public LockerSystem(String branchName) {
        this.branchName = branchName;
        this.lockerDirectory = new ArrayList<>();
    }

    public void addLocker(Locker locker) {
        lockerDirectory.add(locker);
    }

    public void printGeneralReport() {
        System.out.println("\n=== SYSTEM GENERAL REPORT: " + branchName + " ===");
        for (Locker locker : lockerDirectory) {
            locker.checkStatus();
        }
    }
}