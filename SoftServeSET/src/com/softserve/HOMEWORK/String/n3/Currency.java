package com.softserve.HOMEWORK.String.n3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
    public static boolean checkUScurrency(String currencyUS) {
        String pattern = "\\$(\\d*)(\\.\\d{2})";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(currencyUS);//перевіряє чи співпадають символи один за одним

        while (m.matches() == true) {
            System.out.println(currencyUS + " valid");
        break;
        }
        if (m.matches() == false) {
            System.out.println(currencyUS + " not valid");
            return false;
        }
        return true;
    }

}

