package mvc.model;

import mvc.dao.SQLServerConnection;
import mvc.entity.Users;

import java.sql.*;

public class LoginDaoImpl implements LoginDAO{
    @Override
    public String checkLoginStatement(Users users) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();

        String query = "select username from users where username= '"+users.getUserName()+"'"
                +"and password='"+users.getPassword()+"'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            System.out.println("Login thanh cong: "+resultSet.getString("username"));
            return users.getUserName();
        }
        return "fail";

    }

    @Override
    public String checkLoginPreparedStatement(Users users) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select username from users where username =? and password=?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1,users.getUserName());
        preparedStatement.setString(2,users.getPassword());

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("Login thanh cong: "+resultSet.getString("username"));
            return users.getUserName();

        }
        return "Login fail";

    }
}
