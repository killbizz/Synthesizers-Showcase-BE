package com.synthshowcase.SynthesizersShowcase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Synthesizer {
    
    @Id
    @GeneratedValue
    private Long id;
    @Lob
    private String base64image;
    private String name;
    private String description;
    private String category;
    private double price;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBase64image() {
        return this.base64image;
    }

    public void setBase64image(String base64image) {
        this.base64image = base64image;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
