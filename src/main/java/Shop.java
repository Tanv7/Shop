public class Shop {

}
    private List<Product> shop = new ArrayList<>();

    public List<Product> getShop() {
        return shop;
    }

    public void addProduct(Product p) {
        if (p != null)
            shop.add(p);
    }
}