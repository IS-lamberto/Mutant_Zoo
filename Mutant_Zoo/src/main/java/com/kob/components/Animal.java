package com.kob.components;

public class Animal {
    private int animalId;
    private String name;
    private String biology;
    private String imageURL;

    public Animal() {
    }

    public Animal(int animalId, String name,  String biology, String imageURL) {
        this.animalId = animalId;
        this.name = name;

        this.biology = biology;

        this.imageURL = imageURL;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiology() {
        return biology;
    }

    public void setBiology(String biology) {
        this.biology = biology;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURl(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", name='" + name + '\'' +
                ", biology=" + biology +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
