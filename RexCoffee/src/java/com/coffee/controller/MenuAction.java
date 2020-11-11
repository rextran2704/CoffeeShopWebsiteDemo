/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.controller;

import com.coffee.dao.ProductDB;
import com.coffee.dto.Product;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author Rex
 */
public class MenuAction extends ActionSupport {

    ArrayList<Product> productList;
    ArrayList<Product> foodList;
    ArrayList<Product> drinkList;
    ArrayList<Product> otherProductList;

    public MenuAction() {
    }

    @Override
    public String execute() throws Exception {
        ProductDB productDao = new ProductDB();
        productList = productDao.getAllProducts();
        foodList = new ArrayList<>();
        drinkList = new ArrayList<>();
        otherProductList = new ArrayList<>();

        productList.forEach(product -> {
            int type = product.getTypeInt();
            switch (type) {
                case 1:
                    drinkList.add(product);
                    break;
                case 2:
                    foodList.add(product);
                    break;
                case 3:
                    otherProductList.add(product);
                    break;
                default:
                    otherProductList.add(product);
                    break;
            }
        });
        return SUCCESS;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<Product> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Product> foodList) {
        this.foodList = foodList;
    }

    public ArrayList<Product> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(ArrayList<Product> drinkList) {
        this.drinkList = drinkList;
    }

    public ArrayList<Product> getOtherProductList() {
        return otherProductList;
    }

    public void setOtherProductList(ArrayList<Product> otherProductList) {
        this.otherProductList = otherProductList;
    }
}
