package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {

    By productDuffle = By.xpath("//a[contains(text(),'Overnight Duffle')]");


    public void clickOnOvernightDuffle() {
        clickOnElement(productDuffle);
    }


}
