package org.example.entities;

public class Player {

    public Player(){

    }
    //parameters about players
    private String playerFullname;
    private int playerAge;
    private int playerClass;

    //method
    public String toString(){
        return "Player name:"+this.playerFullname+", "+"age:"+this.playerAge+" and "+"class:"+this.playerClass;
    }

    //getter fullname
    public String getPlayerFullname(){
        return this.playerFullname;
    }
    //setter fullname
    public void setPlayerFullname(String name){
        this.playerFullname=name;
    }

    //getter age
    public int getPlayerAge(){
        return this.playerAge;
    }
    //setter age
    public void setPlayerAge(int age){
        this.playerAge=age;
    }

    //getter class
    public int getPlayerClass(){
        return this.playerClass;
    }
    //setter class
    public void setPlayerClass(int playerclass){
        this.playerClass=playerclass;
    }






}