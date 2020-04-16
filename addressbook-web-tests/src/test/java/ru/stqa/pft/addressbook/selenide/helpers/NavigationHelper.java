package ru.stqa.pft.addressbook.selenide.helpers;

import static com.codeborne.selenide.Selectors.*;

public class NavigationHelper extends HelperBase {

  public static void goToGroup() {
    click(byLinkText("groups"));
  }
}
