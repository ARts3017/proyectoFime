/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Arturo
 */
public class Fime {

    /**
     * @param args the command line arguments
     */
    
    Connection con=null;
    public static void main(String[] args) {
        // TODO code application logic here
        Fime f=new Fime();
        f.conexion();
    }
    
    
    public void conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","123");
            PreparedStatement stm=con.prepareStatement("SELECT * FROM persona");
            ResultSet rs=stm.executeQuery();
            int id;
            if(con!=null)
            {
                while(rs.next()){
                    id=rs.getInt("id");
                     System.out.println("id->"+id);
                }
               
            }
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
        
    }
}
