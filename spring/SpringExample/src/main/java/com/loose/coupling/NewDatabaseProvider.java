package com.loose.coupling;

public class NewDatabaseProvider implements DataProvider{
    public String getUserDetails(){
        return "new credentials info";
    }
}
