package ru.stqa.pft.addressbook.selenide.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.selenide.helpers.GroupHelper;
import ru.stqa.pft.addressbook.selenide.helpers.NavigationHelper;
import ru.stqa.pft.addressbook.selenide.helpers.SessionHelper;
import ru.stqa.pft.addressbook.selenide.model.GroupData;

import static com.codeborne.selenide.Selenide.*;

public class CreateGroupTest{

  @Test
  void testCreateGroup() {
    open("http://localhost/addressbook/");
    SessionHelper.login();
    NavigationHelper.goToGroup();
    GroupHelper.initCreateGroup();
    GroupHelper.fillGroupForm(new GroupData("name1", "header1", "footer1"));
    GroupHelper.submitGroupCreation();
    GroupHelper.returnToGroupPage();
    SessionHelper.logoutWithAssertion();
  }

}
