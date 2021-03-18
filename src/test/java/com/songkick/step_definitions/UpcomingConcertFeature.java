package com.songkick.step_definitions;

import com.songkick.pages.ConcertSearchPage;
import com.songkick.pages.LandingPage;
import com.songkick.pages.UpcomingEventPage;
import com.songkick.utilities.BrowserUtils;
import com.songkick.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UpcomingConcertFeature {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;


    LandingPage landingPage = new LandingPage();
    ConcertSearchPage concertSearchPage = new ConcertSearchPage();
    UpcomingEventPage upcomingEventPage = new UpcomingEventPage();


    @When("user search for {string} in find concert box")
    public void user_search_for_in_find_concert_box(String singer) {

        landingPage.findConcertBox.sendKeys(singer + Keys.ENTER);
    }


    @When("user click on the upcoming events")
    public void user_click_on_the_upcoming_events() {

        concertSearchPage.upcomingEvent.click();

    }


    @When("user should see all the related result")
    public void user_should_see_all_the_related_result() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("upcoming"));

    }


    @Then("user should be able to write detail of the concert in exel sheet")
    public void user_should_be_able_to_write_detail_of_the_concert_in_exel_sheet() throws IOException {

        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;


        String path = "src/test/resources/testData/ConcertBook.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Sheet1");
       /* row = sheet.getRow(1);
       cell = row.getCell(0);*/

        BrowserUtils.sleep(3);
        for (int rownum = 1, j = 0; rownum <= upcomingEventPage.concertLocations.size(); rownum++, j++) {

            row = sheet.getRow(rownum);
          /*  if (row.getCell(0) == null) {
                row.createCell(0);
            }*/
            row.getCell(0).setCellValue(upcomingEventPage.concertLocations.get(j).getText());
            row.getCell(1).setCellValue(upcomingEventPage.concertDate.get(j).getText());
            row.getCell(2).setCellValue(upcomingEventPage.cancelled.get(j).getText());

        }



      /*  for (WebElement each:upcomingEventPage.concertLocations) {

            if (row.getCell(0)==null){
                row.createCell(0);
            }
            row.getCell(0).setCellValue(each.getText());


        }
*/


        //===============================================================
        //Load the file to outputStream
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //Write to the file using workbook object
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();


    }


}
