package com.wonu606.facadepattern.shop;

public class TestMain {

    public static void main(String[] args) {
        ShopController shopController = new ShopController(new ShopFacade(
                new ProductService(),
                new OrderService()
        ));

        Product product = new Product("헬멧", 50000);
        Product createdProduct = shopController.createProduct(product);
        System.out.println("--------------- 경계선 ---------------");
        Order order = shopController.purchaseProduct(createdProduct.getId());
        System.out.println("Order 결과: " + order);
    }
}
