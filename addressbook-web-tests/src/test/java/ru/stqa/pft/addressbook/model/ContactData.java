package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String address;
  private String group;

  public ContactData(String firstname, String lastname, String address, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getGroup() {
    return group;
  }
}
