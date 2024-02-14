package com.springbootdemo;

public class Student {


    private String FirstName;
    private String LastName;

    public Student(String FirstName,String LastName){
        super();
        this.FirstName=FirstName;
        this.LastName=LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
