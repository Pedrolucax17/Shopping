public class Shopping implements Comparable<Shopping>{
    private String nameProduct;
    private Double price;

    public Shopping() {}

    public Shopping(String nameProduct, Double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Shopping otherProduct) {
        return this.getPrice().compareTo(otherProduct.getPrice());
    }
}
