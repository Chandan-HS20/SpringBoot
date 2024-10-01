package com.tight.coupling;

import java.util.Arrays;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager um=new UserManager();
        System.out.println(um.getUserInfo());
    }
}
