package utilities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ReusableMethods {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    //HARD WAIT METHOD
    public static void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
