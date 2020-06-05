package com.maniaq.ESlam;

import org.springframework.data.annotation.Id;

public class Slam {

  @Id
  public String id;
	
  private long friendship;
  private String name, meet, toyou, nickme, mem, phone, email;
  
  public long getFriendship() {
	  return friendship;
  }
  public void setFriendship(long friendship) {
	  this.friendship = friendship;
  }
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  this.name = name;
  }
  public String getMeet() {
	  return meet;
  }
  public void setMeet(String meet) {
	  this.meet = meet;
  }
  public String getToyou() {
	  return toyou;
  }
  public void setToyou(String toyou) {
	  this.toyou = toyou;
  }
  public String getNickme() {
	  return nickme;
  }
  public void setNickme(String nickme) {
	  this.nickme = nickme;
  }
  public String getMem() {
	  return mem;
  }
  public void setMem(String mem) {
	  this.mem = mem;
  }
  public String getPhone() {
	  return phone;
  }
  public void setPhone(String phone) {
	  this.phone = phone;
  }
  public String getEmail() {
	  return email;
  }
  public void setEmail(String email) {
	  this.email = email;
  }
}
