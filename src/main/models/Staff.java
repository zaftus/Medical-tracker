package main.models;

public class Staff {
    private String id;
    private String name;
    private String role;

    public Staff(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return id + " | " + name + " | Role: " + role;
    }
}
