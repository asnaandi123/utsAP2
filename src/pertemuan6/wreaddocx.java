/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Cyber Play
 */
public class wreaddocx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
          String teks ="write adalah kebalikan dari read"
                  +"write secara bahasa adalah menulis "
                  +"arti nya menulis suatu teks"
                  +"untuk di buat suatu file berekstensi tertentu"
                  +"sesuai dengan gambar4 /n ini beda paragraf"
                  ;
          
          XWPFDocument documentDocx = new XWPFDocument();
        String outDocxEN="F:\\wreatdocx.docx";
        FileOutputStream outdocx = new FileOutputStream(new File(outDocxEN));
        XWPFParagraph paragraphDocx =documentDocx.createParagraph();
          XWPFRun runDocx =paragraphDocx.createRun();
          runDocx.setText(teks);
          documentDocx.write(outdocx);
          outdocx.close();
          System.out.println("docx writen successfully");
    }
    
}
