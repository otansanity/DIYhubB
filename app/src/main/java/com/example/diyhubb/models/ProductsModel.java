package com.example.diyhubb.models;

import java.io.Serializable;

public class ProductsModel implements Serializable{
    String productname;
    String rating;
    String description;
    String img_url;
    String bookfrom;
    int price;
    int stock;
    int productsold;

    public ProductsModel() {
    }

    public ProductsModel(String productname, String rating, String description, String img_url, String bookfrom, int price, int stock, int productsold) {
        this.productname = productname;
        this.rating = rating;
        this.description = description;
        this.img_url = img_url;
        this.bookfrom = bookfrom;
        this.price = price;
        this.stock = stock;
        this.productsold = productsold;
    }

    public String getBookfrom() {
        return bookfrom;
    }

    public void setBookfrom(String bookfrom) {
        this.bookfrom = bookfrom;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getProductsold() {
        return productsold;
    }

    public void setProductsold(int productsold) {
        this.productsold = productsold;
    }
}
