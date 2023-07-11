package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//span[@class = 'base']");
    By productName = By.xpath("//td[1]/div[1]/strong[1]/a[1]");
    By size32 = By.xpath("//dd[contains(text(),'32')]");
    By colourBlack = By.xpath("//dd[contains(text(),'Black')]");
    By totalQuantity = By.xpath("/div[@class = 'control qty']//input[@type= 'number']");
    By totalPrice = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/span[1]/span[1]/span[1]");
    By quantity = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]");
    By updateCart = By.xpath("//button[@class = 'action update']");
    By updateTotal = By.xpath("//tbody/tr[1]/td[4]/span[1]/span[1]/span[1]");

    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public String verifyProductName() {
        return getTextFromElement(productName);
    }

    public String verifyProductSize32() {
        return getTextFromElement(size32);
    }

    public String verifyColourBlack() {
        return getTextFromElement(colourBlack);
    }

    public String verifyTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    public void clearQuantity() {
        driver.findElement(quantity).clear();
    }

    public void inputQuantity(String number) {
        sendTextToElement(quantity, number);
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(updateCart);
    }

    public String verifyTotal () {
        return getTextFromElement(updateTotal);
    }

}
