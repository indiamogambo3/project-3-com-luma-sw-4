package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();


    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        Thread.sleep(2000);
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverOnTops();
        homePage.clickOnJackets();
    }

    public void verifyProductNameInAlphabeticalOrder() {

        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }

        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Product Name");

        jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListAfter = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());

            jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);

            Assert.assertEquals(jacketsNameListAfter, jacketsNameListBefore, "Unable to verify order.");
        }
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {

        Thread.sleep(2000);
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverOnTops();
        homePage.clickOnJackets();
    }

    public void verifyProductByPriceLowToHigh() {

        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }

        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Price");

        jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }

        Collections.sort(jacketsPriceListBefore);

        Assert.assertEquals(jacketsPriceListAfter, jacketsPriceListBefore);
    }
}

