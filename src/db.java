
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet
 */
public class db {
   
    
    public static Connection java_db()
    {
        Connection conn = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ahmet\\NetBeansProjects\\RestaurantYonetimi\\rysdb.sqlite");
            return conn;
        }catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("bağlanamadı");
            return null;
        }
        
    }  
}
