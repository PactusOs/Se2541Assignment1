package org.example.entities;

public class Sport {
    //parameters about Sport
    private String Sports;

    //method
    @Override
    public String toString(){
        return "Sport:"+this.Sports;
    }

    //getter sport
    public String getSport(){
        return this.Sports;
    }
    //setter sport
    public void setSports(String name){
        this.Sports=name;
    }
}
