package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {

    By size32 = By.id("option-label-size-143-item-175");
    By colorBlack = By.id("option-label-color-93-item-49");
    By addToCart = By.xpath("//li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
    By verifyAddedToCart = By.xpath("//div[@data-bind = 'html: $parent.prepareMessageForHtml(message.text)']");
    By clickOnCartInMessage = By.xpath("//a[(text() = 'shopping cart')]");


    public void mouseHoverAndClickOnSize32() {
        mouseHoverToElementAndClick(size32);
    }

    public void mouseHoverAndClickOnBlack() {
        mouseHoverToElementAndClick(colorBlack);
    }

    public void mouseHoverAndClickOnAddToCartButton() {
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyAddedToCartText() {
        return getTextFromElement(verifyAddedToCart);
    }

    public void clickOnShoppingCartInMessage() {
        clickOnElement(clickOnCartInMessage);
    }

}
