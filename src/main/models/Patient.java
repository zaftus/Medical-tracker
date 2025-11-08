package main.models;

public class Patient {
    private String id;
    private String name;
    private int age;
    private String condition;

    public Patient(String id, String name, int age, String condition) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.condition = condition;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCondition() { return condition; }

    @Override
    public String toString() {
        return id + " | " + name + " | Age: " + age + " | Condition: " + condition;
    }
}
