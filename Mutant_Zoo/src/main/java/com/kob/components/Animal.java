package com.kob.components;

public class Animal {
    private int animalId;
    private String name;
    private String biology;
    private Boolean extra;
    private String imageURL;

    public Animal() {
    }

    public Animal(int animalId, String name,  String biology, Boolean extra, String imageURL) {
        this.animalId = animalId;
        this.name = name;

        this.biology = biology;
        this.extra = extra;
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

    public Boolean getExtra() {
        return extra;
    }

    public void setExtra(Boolean extra) {
        this.extra = extra;
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
                ", phoneNumber='" + extra + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
