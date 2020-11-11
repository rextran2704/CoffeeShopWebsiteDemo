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
public class CoffeeShopInfo {

    private String name;
    private String description;
    private String image;
    private String owner;

    public CoffeeShopInfo() {
    }

    public CoffeeShopInfo(String name, String description, String image, String owner) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.owner = owner;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "CoffeeShopInfo{" + "name=" + name + ", description=" + description + ", image=" + image + ", owner=" + owner + '}';
    }

}
