
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;


@ManagedBean

public class database {
    
    Connection connection = null;
    
    public static void main(String[] argv) throws SQLException {


        Connection connection = null;
        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/bdteste", "postgres",
                    "joao");
        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
           
        }
        if (connection != null) {
            
        } else {
            System.out.println("Failed to make connection!");
        }
        
                  Statement stmt = null;
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM valores;");
           int time=50;
            String valorgraph1 ="";
            while (rs.next()) {
                int tensao1 = rs.getInt("TENSAO1");
                int tensao2 = rs.getInt("TENSAO2");
                int tensao3 = rs.getInt("TENSAO3");
//                 int tensao1 = rs.getInt("TENSAO1");
//                int tensao2 = rs.getInt("TENSAO2");
//                int tensao3 = rs.getInt("TENSAO3");
                valorgraph1 += "[" + tensao1 + "," + tensao2 + "," + tensao3 + ",]";
                             
            }
//            rs.close();
//            stmt.close();
//            connection.close();
           System.out.println(valorgraph1);
         
   
    }
    

}

