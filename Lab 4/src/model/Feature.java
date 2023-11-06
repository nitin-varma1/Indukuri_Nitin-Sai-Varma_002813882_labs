/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Nitin
 */
public class Feature {
    private Product owner;
    private String name;
    private Object value;
    private ArrayList<Product> products;
    
    public Feature (Product owner){
        this.owner = owner;
        products = new ArrayList<Product>();
        products.add(owner);
    }
    
    public Feature (Product owner, String name, Object value){
        this.name = name;
        this.value = value;
        this.owner = owner;
        products = new ArrayList<Product>();
        products.add(owner);
    }

    public Product getOwner() {
        return owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
    public String toString(){
        return name;
    }
     public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}


