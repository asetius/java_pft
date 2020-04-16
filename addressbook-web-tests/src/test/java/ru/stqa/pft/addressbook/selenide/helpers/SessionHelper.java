package ru.stqa.pft.addressbook.selenide.helpers;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SessionHelper {

  public static void logoutWithAssertion() {
    $(byLinkText("Logout")).click();
    $("Create account").should();
  }

  public static void login() {
    $(byName("user")).setValue("admin");
    $(byName("pass")).setValue("secret");
    $(byValue("Login")).click();
  }
}
