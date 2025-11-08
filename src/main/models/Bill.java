package main.models;

public class Bill {
    private String id;
    private String patientId;
    private double amount;

    public Bill(String id, String patientId, double amount) {
        this.id = id;
        this.patientId = patientId;
        this.amount = amount;
    }

    public String getId() { return id; }
    public String getPatientId() { return patientId; }
    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return id + " | Patient: " + patientId + " | Amount: $" + amount;
    }
}
