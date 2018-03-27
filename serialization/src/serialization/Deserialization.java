/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;
import java.io.*;
/**
 *
 * @author macstudent
 */
public class Deserialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Employee e = null;
    try {
    FileInputStream filein = new FileInputStream("employee.txt");
    ObjectInputStream in = new ObjectInputStream(filein);
    
    e = (Employee) in.readObject();
    in.close();
    filein.close();
    }
    catch(IOException i){
    i.printStackTrace();
    return;
    
    }
    catch(ClassNotFoundException c) {
        System.out.println("eMPLOYEE CLASS NOT FOUND");
    c.printStackTrace();
    return;
    }
    
        System.out.println("Deserialized Employee ");
        System.out.println("name : "+e.name);
        System.out.println("address : "+e.address); 
        System.out.println("SSN  : "+e.SSN);
         System.out.println("number : "+e.number);
    
    }
    
}
