package ru.stqa.pft.addressbook.selenide.helpers;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HelperBase {

  protected static void click(By locator) {
    element(locator).click();
  }

  protected static void type(By locator, String text) {
    click(locator);
    element(locator).clear();
    element(locator).setValue(text);
  }
}
