package com.ioc.coupling;

public class WebDatabaseProvider implements DataProvider {
    public String getUserDetails(){
        return "web credentials info";
    }
}
