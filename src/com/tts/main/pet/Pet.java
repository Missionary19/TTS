package com.tts.main.pet;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet() {
        name = "default name";
        age = 0;
        location = "location";
        type = "type";

    }

    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;

    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}