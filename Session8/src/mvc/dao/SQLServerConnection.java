package mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {
    public static Connection getSQLServerConnection() throws ClassNotFoundException, SQLException {
        String hostName ="localhost";
        String instanceName ="DESKTOP-V4JDILL\\SQLEXPRESS";
        String databaseName ="myjdbcapp";
        String userName ="sa";
        String password ="sa";
        return getSQLServerConnection(hostName,instanceName,databaseName,userName,password);
    }
    public static Connection getSQLServerConnection(String hostName,
                                                    String instanceName,
                                                    String databaseName,
                                                    String userName,
                                                    String password) throws ClassNotFoundException, SQLException {
        //1. Load and register driver SQLServer
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = "jdbc:sqlserver://"+hostName+":1433"
                +";instance="+instanceName+";databaseName ="+databaseName;
        //String connectionString2 = "jdbc:sqlserver://localhost:1433;instance=.;databaseName =myjdbcapp";
        Connection connection = DriverManager.getConnection(connectionString,userName,password);
        return connection;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = getSQLServerConnection();
        if (connection!=null){
            System.out.println("Ket noi thanh cong");
        }
    }
}
