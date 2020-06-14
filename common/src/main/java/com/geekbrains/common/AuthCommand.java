package com.geekbrains.common;


public class AuthCommand
		extends DataPackage
{

  public final String login;
  public final String password;


  public AuthCommand(String login, String password)
  {
	this.login = login;
	this.password = password;
  }

}