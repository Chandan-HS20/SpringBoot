package com.ioc.coupling;

public class UserManager {
    DataProvider DP;

    public UserManager(DataProvider DP) {
        this.DP = DP;
    }

    public String getUserInfo(){
        return DP.getUserDetails();
    }
}
