
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

class konek {
        private static Connection mysqlcon;
public static Connection koneksiDB() throws  SQLException{
   if(mysqlcon==null){
       try {
           String DB = "jdbc:mysql://localhost:3306/delta_db";
           String user="root";
           String pass="";
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           mysqlcon = (Connection) DriverManager.getConnection(DB,user,pass);
       } catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Gagal Koneksi");
       }
   }
   return mysqlcon; 
}
}
