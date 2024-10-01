package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        DataProvider Dp=new UserDatabaseProvider();
        UserManager UM=new UserManager(Dp);
        System.out.println(UM.getUserInfo());
    }
}
