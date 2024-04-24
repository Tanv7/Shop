package com.example.shop;

public class Main {

        public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
            ProductService productService = context.getBean("productService", ProductService.class);
            OrderService orderService = context.getBean("orderService", OrderService.class);
            Cart cart = context.getBean("shop", Shop.class);

            //productService.getProductInConsol();
            Product p = productService.findProduct("strawberrry");
            Product p1 = productService.findProduct("milk");
            Product p2 = productService.findProduct("chiken fillet");
            Product p3 = productService.findProduct("beer");
            //System.out.println(p);


            String nameProduct = String.valueOf(productService.findProduct(""));
            shop.addProduct(p);
            shop.addProduct(p1);
            shop.addProduct(p2);
            shop.addProduct(p3);

            orderService.makeOrder(shop);
            System.out.println(shop);


        }


    }
}
