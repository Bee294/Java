package mvc;

import mvc.view.LoginConsole;
import mvc.view.ProductConsole;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //LoginConsole loginConsole = new LoginConsole();
        //loginConsole.start();

        ProductConsole productConsole = new ProductConsole();
        productConsole.start();
    }
}
