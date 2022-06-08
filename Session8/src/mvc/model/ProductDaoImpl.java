package mvc.model;

import mvc.dao.SQLServerConnection;
import mvc.entity.Product;

import java.sql.*;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDAO{
    private final Connection connection = SQLServerConnection.getSQLServerConnection();
    private final String SQL_CREATE_PRODUCT = "insert into product(proName,proDesc,price) values(?,?,?)";
    private final String SQL_GET_PRODUCT_BY_ID = "select * from product where id =?";
    private final String SQL_UPDATE_PRODUCT = "update product set proName =?, proDesc =?, price =? where id =?";
    private final String SQL_DELETE_PRODUCT = "delete from product where id =?";


    public ProductDaoImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void createProduct(Product product) throws SQLException, ClassNotFoundException {
        //SQl engine:
        //insert into product values(..)
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "insert into product values(?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, product.getProName());
        preparedStatement.setString(2, product.getProDesc());
        preparedStatement.setDouble(3, product.getPrice());

        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        if (resultSet.next()){
            product.setId(resultSet.getInt(1));
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductDaoImpl productDao = new ProductDaoImpl();
        Product product = new Product("Samsung","The new product", 3000.0);
        productDao.createProduct(product);
        System.out.println(product.getId());

       // productDao.deleteProduct(4);
        Product product1 = new Product();
        product1 = productDao.getProductById(5);
        System.out.println(product.getProName());

    }

    @Override
    public Product getProductById(int id) throws SQLException, ClassNotFoundException {
        //select * from product where id =....
        Product product = new Product();
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "Select * from product where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            product.setId(resultSet.getInt(1));
            product.setProName(resultSet.getString(2));
            product.setProDesc(resultSet.getString(3));
            product.setPrice(resultSet.getDouble(4));
        }
        return product;
    }

    @Override
    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException {
        //select * from product
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "Select * from product";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        ArrayList<Product> allProduct = new ArrayList<>();
        while (resultSet.next()){
            Product product = new Product();
            product.setId(resultSet.getInt(1));
            product.setProName(resultSet.getString(2));
            product.setProDesc(resultSet.getString(3));
            product.setPrice(resultSet.getDouble(4));
            allProduct.add(product);
        }

        return allProduct;
    }

    @Override
    public void updateProduct(Product product) throws SQLException, ClassNotFoundException {
        //update ..set..
        Connection connection = SQLServerConnection.getSQLServerConnection();

        String query = "update product set proName =?, proDesc =?, price =? where id =?";

        //Search product by id


        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, product.getProName());
        preparedStatement.setString(2, product.getProDesc());
        preparedStatement.setDouble(3,product.getPrice());
        preparedStatement.setInt(4,product.getId());

        preparedStatement.executeUpdate();


    }

    @Override
    public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException {
        //delete

        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "delete from product where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
        return true;

    }

    @Override
    public ArrayList<Product> getProductByName(String name) throws SQLException, ClassNotFoundException {

        ArrayList<Product> productList = new ArrayList<>();

        Product product = new Product();
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "Select * from product where proName =?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            product.setId(resultSet.getInt(1));
            product.setProName(resultSet.getString(2));
            product.setProDesc(resultSet.getString(3));
            product.setPrice(resultSet.getDouble(4));
            productList.add(product);
        }
        return productList;
    }
}
