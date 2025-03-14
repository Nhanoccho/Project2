package com.java.web.Model;

public class BuildingDTO {
    private String name;
    private int numberOfBasement;
	private String location;

    public BuildingDTO() {}
    public BuildingDTO(String name, String location, int numberOfBasement) {
        this.name = name;
        this.location = location;
        this.numberOfBasement = numberOfBasement;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", location='" + location +'\'' +
                ", numberOfBasement=" + numberOfBasement +
                '}';
    }
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
