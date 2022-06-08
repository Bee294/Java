package mvc.controller;

import mvc.entity.Product;
import mvc.model.ProductDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    //Step2
    ProductDaoImpl productDao = new ProductDaoImpl();

    public ProductController() throws SQLException, ClassNotFoundException {
    }

    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException {
        ArrayList<Product> allProducts = productDao.getAllProducts();
        return allProducts;
    }
    public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException {
        boolean result = productDao.deleteProduct(id);
        return result;
    }
    public void createProduct(Product product) throws SQLException, ClassNotFoundException {
        productDao.createProduct(product);

    }
}
