package com.softserve.TASK.String.n3;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "Yuriy1213";
        name[1] = "12Yarik";
        name[2] = "@D%a^s*h_a";
        name[3] = "a";
        name[4] = "f2r1";

        for (String ss : name) {
            System.out.println(ss + " " + checkWithRegExp(ss));
        }

    }

    public static boolean checkWithRegExp(String userName) {
        Pattern p = Pattern.compile("[a-z0-9_-]$");
        Matcher m = p.matcher(userName);
        return m.matches();
    }


}