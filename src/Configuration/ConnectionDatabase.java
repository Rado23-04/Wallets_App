package Configuration;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionDatabase {


    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/db_wallets";
        String user = "postgres";
        String password = "12345678";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("ok");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
