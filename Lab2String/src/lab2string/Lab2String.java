/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2string;

import com.sun.istack.internal.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author mzharley
 */
public class Lab2String {
         public static void main(String[] args) {
           String filename = "records.txt";
           String [] records; 
         records = new String[100]; 
         String output = null;
         getRecords(filename, output);
             
    }
        public static void getRecords(String filename, String output)
        {
            try {
                Scanner reader = new Scanner(new File(filename));
                        
                
                while(reader.hasNext()) {
                    String line = reader.nextLine();
                    String[] record = line.split(",");
                    String firstName = record[0];
                    String lastName = record[1];
                    String gender = record[2];
                    String emailAddress = record[3];
                    String age = record[4];
                    String phoneNumber = record[5];
                        
 output = String.format("%-10s%-30s%-30s%-30s%-30s%30s", firstName, lastName, gender, emailAddress, age, phoneNumber);
       System.out.println(output);             
                
                
        } 
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab2String.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
