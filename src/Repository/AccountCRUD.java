package Repository;

import Configuration.ConnectionDatabase;
import Model.Account;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class AccountCRUD implements CRUDoperatioin<Account> {
    private static Connection connection;
    public static void getConnection() {
        ConnectionDatabase Db = new ConnectionDatabase();
        connection = Db.createConnection();
    }
    @Override
    public List<Account> findAll() {
        getConnection();
        try {
            String sql = "select * from account";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("List of account :");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                String birthday = resultSet.getString("birthday");
                String gender = resultSet.getString("gender");
                String CIN = resultSet.getString("CIN");

                System.out.println(
                        "Author { id : "+id+
                                ", first_name : "+first_name+
                                ", last_name: "+last_name+
                                ", birthday : "+ birthday+
                                ", gender: "+gender+
                                ", CIN : "+CIN+"};"
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Account save(Account save) {
        getConnection();
        try{
            String sql = "INSERT INTO account (id, first_name, last_name,birthday,gender,CIN) VALUES (?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Account.getId);
            statement.setString(2, Account);
            statement.setString(3,Account.get);
            int row = statement.executeUpdate();
            System.out.println("Add Account successfully !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Account delete(Account delete) {
        getConnection();
        try {
            String sql = "delete from account where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,account.getId());
            int row = statement.executeUpdate();
            System.out.println("Deleted Author successfully !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
