package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDufflePage extends Utility {

    By overnightDuffle = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By quantity = By.id("qty");
    By addToCart = By.id("product-addtocart-button");
    By duffleBagAddedToShoppingCart = By.xpath("//div[@data-bind = 'html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");


    public String verifyOvernightDuffleText() {
        return getTextFromElement(overnightDuffle);
    }

    public void clearQuantity() {
        driver.findElement(quantity).clear();
    }

    public void inputQuantity(String number) {
        sendTextToElement(quantity, number);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    public String verifyDuffleBagAddedToCartText() {
        return getTextFromElement(duffleBagAddedToShoppingCart);
    }

    public void clickOnShoppingCartLinkInMessage() {
        clickOnElement(shoppingCartLink);
    }






}
