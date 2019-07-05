package com.duobei.selenium.utils;

import org.openqa.selenium.By;

public class getByLocator {

    public static By getLocator(String key) {
        PropertiesUtil proUtil = new PropertiesUtil("element.properties");
        String locator = proUtil.getProperties(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        if (locatorType.equals("id")) {
            return By.id(locatorValue);
        } else if (locatorType.equals("name")) {
            return By.name(locatorValue);
        } else if (locatorType.equals("className")) {
            return By.className(locatorValue);
        } else if (locatorType.equals("tagName")) {
            return By.tagName(locatorValue);
        } else if (locatorType.equals("linkText")) {
            return By.linkText(locatorValue);
        } else if (locatorType.equals("partialLinkText")) {
            return By.partialLinkText(locatorValue);
        } else if (locatorType.equals("xpath")) {
            return By.xpath(locatorValue);
        } else if (locatorType.equals("cssSelector")) {
            return By.cssSelector(locatorValue);
        } else {
            return null;
        }


    }
}
