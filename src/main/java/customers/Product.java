package customers;

public class Product {
  private String productName;
  private int productId;

    public Product(int productId,String productName) {
        this.productId=productId;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
    public int getProductId(){
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductId(int productId){
        this.productId=productId;
    }
}
