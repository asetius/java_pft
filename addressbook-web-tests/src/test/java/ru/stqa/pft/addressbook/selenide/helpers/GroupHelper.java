package ru.stqa.pft.addressbook.selenide.helpers;

import ru.stqa.pft.addressbook.selenide.model.GroupData;
import static com.codeborne.selenide.Selectors.*;


public class GroupHelper extends HelperBase {

  public static void returnToGroupPage() {
    click(byLinkText("group page"));
  }

  public static void submitGroupCreation() {
    click(byName("submit"));
  }

  public static void initCreateGroup() {
    click(byName("new"));
  }

  public static void fillGroupForm(GroupData groupData) {
    type(byName("group_name"), groupData.getName());
    type(byName("group_header"), groupData.getHeader());
    type(byName("group_footer"), groupData.getFooter());
  }
}
