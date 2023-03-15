package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{
    @Autowired
    IEmailSender emailSender;

    public void setEmailSender(IEmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void addProduct(int productId, String productName) {
     Product product = new Product(productId, productName);
        emailSender.sendEmail(String.valueOf(productId),productName + "  has added as a new Item to the DB");
    }
}
