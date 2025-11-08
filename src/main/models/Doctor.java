package main.models;

public class Doctor {
    private String id;
    private String name;
    private String specialty;

    public Doctor(String id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecialty() { return specialty; }

    @Override
    public String toString() {
        return id + " | Dr. " + name + " | Specialty: " + specialty;
    }
}
