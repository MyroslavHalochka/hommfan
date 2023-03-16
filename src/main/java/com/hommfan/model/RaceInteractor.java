package com.hommfan.model;

import org.springframework.beans.factory.annotation.Value;

public class RaceInteractor {

  private Race race;
  private int id;
  @Value("${raceInteractor.text}")
  private String text;

  public RaceInteractor(Race race) {

    this.race = race;

  }

  public RaceInteractor() {

  }

  public void setRace(Race race) {

    this.race = race;

  }

  public int getId() {

    return id;

  }

  public void setId(int id) {

    this.id = id;

  }

  public String getText() {

    return text;

  }

  public void setText(String text) {

    this.text = text;

  }

  public void talk() {

    System.out.println(race.getText());

  }

}
