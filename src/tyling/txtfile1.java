/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyling;

import pertemuan4.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class txtfile1 {
    public static void main(String[] args) throws IOException {
        String filename="C://input.txt";
        String baris=null;
        
        
        FileReader filereader
            = new FileReader(filename);
        
        BufferedReader bufferedReader
                =new BufferedReader(filereader);
        while((baris=bufferedReader.readLine())!=null){
        System.out.println(baris);
    }
        
                
    }
}
