/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.controller;

import com.coffee.dao.ProductDB;
import com.coffee.dto.Product;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author Rex
 */
public class ProductAction extends ActionSupport {

    private String name;
    private String description;
    private String imageLink;
    private String type;
    private ArrayList<String> productTypeList;

    public ProductAction() {
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String createProduct() {
        ProductDB productDao = new ProductDB();
        if (validateInput()) {
            Product product = new Product(name, description, imageLink, type);
            if (productDao.addProduct(product)) {
                return SUCCESS;
            }
            return ERROR;
        }
        return INPUT;
    }

    public String getProductImage() {
        return SUCCESS;
    }

    public boolean validateInput() {
        boolean isValidated = true;
        if (name.isEmpty()) {
            addFieldError("name", "Product name is required!");
            isValidated = false;
        }
        if (description.isEmpty()) {
            addFieldError("description", "Description is required!");
            isValidated = false;
        }
        if (imageLink.isEmpty()) {
            addFieldError("imageLink", "Image link is required!");
            isValidated = false;
        }
        return isValidated;
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

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getProductTypeList() {
        productTypeList = new ArrayList<>();
        productTypeList.add("drink");
        productTypeList.add("food");
        productTypeList.add("other");
        return productTypeList;
    }

    public void setProductTypeList(ArrayList<String> productTypeList) {
        this.productTypeList = productTypeList;
    }

}
