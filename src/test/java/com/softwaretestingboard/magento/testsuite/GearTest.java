package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflePage overnightDufflePage = new OvernightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        Thread.sleep(2000);
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        bagsPage.clickOnOvernightDuffle();
        String expectedOvernightDuffleText = "Overnight Duffle";
        Assert.assertEquals(overnightDufflePage.verifyOvernightDuffleText(), expectedOvernightDuffleText, "Unable to verify text.");
        overnightDufflePage.clearQuantity();
        overnightDufflePage.inputQuantity("3");
        overnightDufflePage.clickOnAddToCartButton();
        String expectedShoppingCartText = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(overnightDufflePage.verifyDuffleBagAddedToCartText(), expectedShoppingCartText, "Unable to verify text.");
        overnightDufflePage.clickOnShoppingCartLinkInMessage();
        String expectedProductName = "Overnight Duffle";
        Assert.assertEquals(shoppingCartPage.verifyProductName(), expectedProductName, "Unable to verify name.");
        String expectedQuantity = "3";
        String actualQuantity = driver.findElement(By.xpath("//div[@class = 'control qty']//input[@type= 'number']")).getAttribute("value");
        Assert.assertEquals(actualQuantity, expectedQuantity, "Unable to verify quantity");
        String expectedTotalPrice = "$135.00";
        Assert.assertEquals(shoppingCartPage.verifyTotalPrice(), expectedTotalPrice, "Unable to verify price");
        shoppingCartPage.clearQuantity();
        shoppingCartPage.inputQuantity("5");
        shoppingCartPage.clickOnUpdateShoppingCartButton();
        Thread.sleep(2000);
        String expectedTotal = "$225.00";
        Assert.assertEquals(shoppingCartPage.verifyTotal(), expectedTotal, "Unable to verify total");


    }


}
