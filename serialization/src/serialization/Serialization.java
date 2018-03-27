/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.*;

public class Serialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Employee e = new Employee();
        e.name = "rush";
        e.address = "toronto";
        e.SSN = 41212255;
        e.number = 1560;
        
        try {
        FileOutputStream fileout = new FileOutputStream("employee.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(e);
        out.close();
        fileout.close();
        
            System.out.println("Serialized data is saved as employee.txt");
        
        }
        catch (IOException i ){
        i.printStackTrace();
        }
        
    }
    
}
