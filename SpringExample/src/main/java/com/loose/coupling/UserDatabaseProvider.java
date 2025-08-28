package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
//        Direct access from Database
        return "User details from the Database";
    }
}
