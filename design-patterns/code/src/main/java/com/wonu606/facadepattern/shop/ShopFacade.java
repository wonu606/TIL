package com.wonu606.facadepattern.shop;

public class ShopFacade {

    private final ProductService productService;
    private final OrderService orderService;

    public ShopFacade(ProductService productService, OrderService orderService) {
        this.productService = productService;
        this.orderService = orderService;
    }

    public Order purchaseProductById(Integer productId) {
        System.out.println("[ShopFacade] called purchaseProductById Method");
        Product product = productService.findById(productId);
        return orderService.create(product);
    }

    public Product createProduct(Product product) {
        System.out.println("[ShopFacade] called createProduct Method");
        return productService.create(product);
    }
}
