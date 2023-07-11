package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By hoverOnWomenMenu = By.xpath("//span[contains(text(),'Women')]");
    By hoverOnTops = By.id("ui-id-9");
    By jackets = By.id("ui-id-11");
    By menMenu = By.id("ui-id-5");
    By bottoms = By.id("ui-id-18");
    By pants = By.id("ui-id-23");
    By hoverOnGear = By.xpath("//span[(text() = 'Gear')]");
    By selectBags = By.xpath("//span[contains(text(),'Bags')]");



    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(hoverOnWomenMenu);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(hoverOnTops);
    }

    public void clickOnJackets() {
        clickOnElement(jackets);
    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottoms() {
        mouseHoverToElement(bottoms);
    }

    public void clickOnPants() {

        clickOnElement(pants);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(hoverOnGear);
    }

    public void clickOnBags() {
        clickOnElement(selectBags);
    }


}
