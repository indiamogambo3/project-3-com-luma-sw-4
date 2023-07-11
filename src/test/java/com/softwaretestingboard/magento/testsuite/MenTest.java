package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        Thread.sleep(2000);
        homePage.mouseHoverOnMenMenu();
        homePage.mouseHoverOnBottoms();
        homePage.clickOnPants();
        pantsPage.mouseHoverAndClickOnSize32();
        pantsPage.mouseHoverAndClickOnBlack();
        Thread.sleep(2000);
        pantsPage.mouseHoverAndClickOnAddToCartButton();
        String expectedAddedToCartText = "You added Cronus Yoga Pant to your shopping cart.";
        Assert.assertEquals(pantsPage.verifyAddedToCartText(), expectedAddedToCartText, "Unable to verify text.");
        pantsPage.clickOnShoppingCartInMessage();
        String expectedShoppingCartText = "Shopping Cart";
        Assert.assertEquals(shoppingCartPage.verifyShoppingCartText(), expectedShoppingCartText, "Unable to verify text.");
        String expectedProductName = "Cronus Yoga Pant";
        Assert.assertEquals(shoppingCartPage.verifyProductName(), expectedProductName, "Unable to verify name.");
        String expectedSize = "32";
        Assert.assertEquals(shoppingCartPage.verifyProductSize32(), expectedSize, "Unable to verify size");
        String expectedColour = "Black";
        Assert.assertEquals(shoppingCartPage.verifyColourBlack(), expectedColour, "Unable to verify colour");

    }

}
