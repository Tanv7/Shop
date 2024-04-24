package com.example.shop;

    @Component
    public class OrderService {

        public void makeOrder(Shop shop){
            double totalCost = 0;
            for (Product p : shop.getShop()) {
                System.out.println(p);
                totalCost += p.getCost();
            }
            System.out.println("ИТОГО " + totalCost);
            shop.setShop(null);

        }
    }
}
