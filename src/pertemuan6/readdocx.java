/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



/**
 *
 * @author Cyber Play
 */
public class readdocx {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParserConfigurationException, SAXException {
  
            File filenya = new File("F://readdocx.docx");
            FileInputStream file = new FileInputStream(filenya.getPath());
            ZipInputStream docxfile = new ZipInputStream(file);
            ZipEntry ZipEntry;
            OutputStream out;
            String xml = "";
            while ((ZipEntry = docxfile.getNextEntry()) != null) {
                if (ZipEntry.toString().equals("word/document.xml")) {
                    byte[] buffer = new byte[1024 * 4];
                    long count = 0;
                    int n = 0;
                    long size = ZipEntry.getSize();
                    out = System.out;
                    
                    while (-1 != (n = docxfile.read(buffer)) && count < size) {
                        xml += new String(buffer, 0, n);
                        count += n;
                        
                    }
                    
                }

            }
            InputStream is =new ByteArrayInputStream(xml.getBytes("UTF-8"));
            DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factory.newDocumentBuilder();
            
      Document document =  parser.parse(is);
            
            
 NodeList sections =document.getElementsByTagName("w:t");
         String isidocx="";
         for(int i=0;i<sections.getLength();i++){
             isidocx +=sections.item(i).getFirstChild().getNodeValue();
         
             
         }
            System.out.println(isidocx);
        }
        
     

    } 


