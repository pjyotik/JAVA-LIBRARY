package com.learning.pjyotik.helpers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author Pranob Kalita
 * @project_name JAVA-LIBRARY
 * @date 9/12/2021
 * @package_name com.learning.pjyotik.helpers
 */
public class ExcelHelperTest {

    private static final Logger logger = LogManager.getLogger(ExcelHelperTest.class);

    @Test
    public void testExcelUtil(){
        String path = "src/test/resources/files/SampleExcel.xlsx";
        ExcelHelper excelHelper = new ExcelHelper(path);

        String cellData = excelHelper.getCellData("login", 0, 2);
        logger.info("CELL DATA : "+cellData);

        String data = excelHelper.getCellData("login", "username", 3);
        System.out.println(data);

        boolean sheetAdded = excelHelper.addSheet("TestSheet");
        logger.info("Sheet Added :"+sheetAdded);

        boolean sheetExist = excelHelper.isSheetExist("TestSheet");
        logger.info("Sheet Exists :"+sheetExist);

        boolean removeSheet = excelHelper.removeSheet("TestSheet");
        logger.info("Sheet Removed :"+removeSheet);

        boolean sheetExist2 = excelHelper.isSheetExist("TestSheet");
        logger.info("Sheet Exists :"+sheetExist2);

        boolean status = excelHelper.addColumn("login", "Status");
        logger.info("Column added : " + status);

        boolean setCellData = excelHelper.setCellData("login", "Status", 2, "PASS");
        logger.info("Set Data : "+setCellData);

        int rowCount = excelHelper.getRowCount("login");
        logger.info("No Of Rows : "+rowCount);
        boolean removeColumn = excelHelper.removeColumn("login", 2);
        logger.info(removeColumn);
    }
}