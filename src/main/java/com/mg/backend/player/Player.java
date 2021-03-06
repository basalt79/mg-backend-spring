package com.mg.backend.player;


public class Player {

  private String id;
  private String firstName;
  private String lastName;
  private String club;
  private int shirtNumber;
  private Position position;

  public Player() {

  }

  public String getId() {
    return id;
  }

  public Player setId(String id) {
    this.id = id;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public Player setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public Player setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getClub() {
    return club;
  }

  public Player setClub(String club) {
    this.club = club;
    return this;
  }

  public int getShirtNumber() {
    return shirtNumber;
  }

  public Player setShirtNumber(int shirtNumber) {
    this.shirtNumber = shirtNumber;
    return this;
  }

  public Position getPosition() {
    return position;
  }

  public Player setPosition(Position position) {
    this.position = position;
    return this;
  }
}
