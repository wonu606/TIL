package com.wonu606.facadepattern.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public Product findById(Integer productId) {
        System.out.println("[ProductService] called findById Method");
        return productList.get(productId);
    }

    public Product create(Product product) {
        System.out.println("[ProductService] called create Method");
        product.registerId(productList.size());
        productList.add(product);
        System.out.println("Product 생성됨: " + product);
        return product;
    }
}
