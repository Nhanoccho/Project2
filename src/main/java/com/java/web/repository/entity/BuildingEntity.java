package com.java.web.repository.entity;

public class BuildingEntity {
	private String name;
    private String street;
    private String ward;
    private int numberOfBasement;

    public BuildingEntity() {}
    public BuildingEntity(String name, String street, String ward, int numberOfBasement) {
        this.name = name;
        this.street = street;
        this.ward = ward;
        this.numberOfBasement = numberOfBasement;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public int getNumberOfBasement() {
        return numberOfBasement;
    }

    public void setNumberOfBasement(int numberOfBasement) {
        this.numberOfBasement = numberOfBasement;
    }

    // toString để debug
    @Override
    public String toString() {
        return "BuildingDTO{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", ward='" + ward + '\'' +
                ", numberOfBasement=" + numberOfBasement +
                '}';
    }
}
