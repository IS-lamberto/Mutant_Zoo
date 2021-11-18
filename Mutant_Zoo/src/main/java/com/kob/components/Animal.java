package com.kob.components;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_animal")
public class Animal {
    @Id
    
    private String name;
    private String biology;
    private String imageURL;

    public Animal() {
    }

    public Animal( String name,  String biology, String imageURL) {
        
        this.name = name;

        this.biology = biology;

        this.imageURL = imageURL;
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
                ", name='" + name + '\'' +
                ", biology=" + biology +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
