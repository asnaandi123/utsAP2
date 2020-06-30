/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.scene.control.Cell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Cyber Play
 */
public class readxls {

    public static void main(String[] args) throws IOException {
        //kita akan memanggil method  read Exel
        readfromExel("F:\\data.xls");

    }

    public static void readfromExel(String urlexel) throws FileNotFoundException, IOException {
        HSSFWorkbook myexcel = new HSSFWorkbook(new FileInputStream(urlexel));
        HSSFSheet myexelSheet = myexcel.getSheet("training");
        FormulaEvaluator formulaEv = myexcel.getCreationHelper().createFormulaEvaluator();

        for (Row row : myexelSheet) {//for each
            for (org.apache.poi.ss.usermodel.Cell cell : row) {
                switch (formulaEv.evaluateInCell(cell).getCellType()) {
                    case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t\t");
                        break;
                    case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t\t");

                        break;
                }
            }
            System.out.println("");
            myexcel.close();
        }
    }
}
