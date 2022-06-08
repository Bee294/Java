package mvc.controller;

import mvc.entity.Users;
import mvc.model.LoginDaoImpl;

import java.sql.SQLException;

public class LoginController {

    //Step2
    LoginDaoImpl loginDao = new LoginDaoImpl();

    public String loginStatementController(Users users) throws SQLException, ClassNotFoundException {
        //Step2
        return loginDao.checkLoginStatement(users);
    }
    public String loginPreparedStatementController(Users users) throws SQLException, ClassNotFoundException {
        return loginDao.checkLoginPreparedStatement(users);
    }
}
