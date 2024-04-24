package com.example.shop;

@Configuration
public class AppConfig {
    @Bean(name = "ShopJava")
    public Shop shop(){
        return new JavaClassDemo();
    }
    @Bean(name = "classnameProduct")
    public ClassNameProduct classnameshop(){
        return new Product();
    }

}