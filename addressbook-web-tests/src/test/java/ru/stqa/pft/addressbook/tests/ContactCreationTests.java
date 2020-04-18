package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomepage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Asset", "Kussainov", "Astana", "My_Family"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }

}
