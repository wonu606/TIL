package com.wonu606.facadepattern.shop;

public class ShopController {

    private final ShopFacade shopFacade;

    public ShopController(ShopFacade shopFacade) {
        this.shopFacade = shopFacade;
    }

    public Product createProduct(Product product) {
        System.out.println("[ShopController] called createProduct Method");
        return shopFacade.createProduct(product);
    }

    public Order purchaseProduct(Integer productId) {
        System.out.println("[ShopController] called purchaseProduct Method");
        return shopFacade.purchaseProductById(productId);
    }
}
