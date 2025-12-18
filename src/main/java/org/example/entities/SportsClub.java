package org.example.entities;

public class SportsClub {
    //parameters about clubs
    private String ClubName;
    private int Memberscount;

    public SportsClub() {
    }



    //method
    @Override
    public String toString(){
        return "Club name:"+this.ClubName+", "+"member count:"+this.Memberscount;
    }

    //getter ClubName
    public String getClubName(){
        return this.ClubName;
    }
    //setter ClubName
    public void setClubName(String name){
        this.ClubName=name;
    }


    //getter Memberscount
    public int getMemberscount(){
        return this.Memberscount;
    }
    //setter Memberscount
    public void setMemberscount(int count){
        this.Memberscount=count;
    }



}
