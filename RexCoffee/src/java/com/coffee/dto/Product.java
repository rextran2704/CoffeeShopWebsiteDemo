/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dto;

/**
 *
 * @author Rex
 */
public class Product {

    private int id;
    private String name;
    private String description;
    private String image;
    private String type;

    public Product() {
    }

    public Product(int id, String name, String description, String image, int typeInt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.setTypeInt(typeInt);
    }

    public Product(String name, String description, String image, int typeInt) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.setTypeInt(typeInt);
    }

    public Product(String name, String description, String image, String type) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTypeInt(int type) {
        switch (type) {
            case 1:
                this.type = "drink";
                break;
            case 2:
                this.type = "food";
                break;
            case 3:
                this.type = "other";
                break;
            default:
                this.type = "other";
                break;
        }
    }

    public int getTypeInt() {
        switch (type) {
            case "drink":
                return 1;
            case "food":
                return 2;
            case "other":
                return 3;
            default:
                return 3;
        }
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + '}';
    }

}
