package com.selenium.project.Utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {

    public  static void main(String[] args) throws IOException {

        String excelfilepath=".\\Utilities\\Readdata.xlsx";
        FileInputStream  inputStream= new FileInputStream(excelfilepath);
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
       // XSSFSheet sheet= workbook.getSheet("sheet1");
        XSSFSheet sheet=workbook.getSheetAt(0);
       /* int rows=sheet.getLastRowNum();
        int cols=sheet.getRow(1).getLastCellNum();
        for (int r=0;r<=0;r++) {
       XSSFRow row= sheet.getRow(r);
            for (int c=0;c<cols;c++){
                XSSFCell cell=row.getCell(c);
                switch (cell.getCellType())
                {
                    case STRING:
                        System.out.print(cell.getStringCellValue()); break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()); break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue()); break;
                }
                System.out.print("|");
            }
            System.out.println();
        }*/

        //Itirator
        Iterator iterator= sheet.iterator();
        while (iterator.hasNext()) {
            XSSFRow row=(XSSFRow) iterator.next();
            Iterator cellItirtor= row.cellIterator();
            while (cellItirtor.hasNext())
            {
                XSSFCell cell=(XSSFCell) cellItirtor.next();

                switch (cell.getCellType())
                {
                    case STRING:
                        System.out.print(cell.getStringCellValue()); break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()); break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue()); break;
                }
                System.out.print("|");
            }
            System.out.println();
            }
        }

    }


