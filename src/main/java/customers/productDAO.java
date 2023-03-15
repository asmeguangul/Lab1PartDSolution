package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class productDAO implements IProductDAO{

    @Autowired
    private ILogger logger;



    @Override
    public void save(Product product) {
        System.out.println("PrdoctdDAO: adding product  " + product.getProductName() );
        logger.log("Product  is saved in the DB: " + product.getProductName());
    }
}
