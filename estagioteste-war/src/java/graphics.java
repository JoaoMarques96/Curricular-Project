package conexaopostgresql; 
import java.sql.Statement;  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;




 @ManagedBean
public class graphics implements Serializable { 
    
   
    /**
     *
     * @return
     */
    public String graph1() {
       String graphicsValor = "230";
       return graphicsValor; 
    }

}




