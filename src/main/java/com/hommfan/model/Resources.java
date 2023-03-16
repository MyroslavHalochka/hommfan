package com.hommfan.model;

public class Resources {

  private Long id;
  private String name;
  private String avatar;
  private String description;

  public Resources(Long id, String name, String avatar, String description) {

    this.id = id;
    this.name = name;
    this.avatar = avatar;
    this.description = description;

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {

    return name;

  }

  public void setName(String name) {

    this.name = name;

  }

  public String getAvatar() {

    return avatar;

  }

  public void setAvatar(String avatar) {

    this.avatar = avatar;

  }

  public String getDescription() {

    return description;

  }

  public void setDescription(String description) {

    this.description = description;

  }

}
