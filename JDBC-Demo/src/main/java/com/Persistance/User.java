package com.Persistance;

import com.Utils.CustomDAOInterface;

public class User {
    //these are variables representing the variables inside the tables in our database
    private Integer user_id;
    private String first_name;
    private String last_name;
    private String email;

    public User(){}

    //this is the constructor we would use when retrieving from the db
    public User(Integer user_id, String first_name, String last_name, String email){
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    //here we are not including the user_id
    //we would most likely use this constructor when creating a user
    public User(String first_name, String last_name, String email){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    //These are our getters and setters because we have made all the fields private
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        //I can add some functionality to check the incoming info,
        //parameters, or dependency to confirm that it is valid before
        //setting it to the class variable
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //I can add logic or functionality to ensure that an email is valid
        //before setting a new email
        this.email = email;
    }
    //End of getters and setters
}
