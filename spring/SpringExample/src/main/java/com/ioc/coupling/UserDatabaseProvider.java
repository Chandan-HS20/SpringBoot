package com.ioc.coupling;

public class UserDatabaseProvider implements DataProvider {
    @Override
    public String getUserDetails(){
        return "user credentials info";
    }
}
