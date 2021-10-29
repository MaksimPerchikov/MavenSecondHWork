package ru.ibs;

import org.apache.commons.lang3.StringUtils;

public class StarterClass {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(StringUtils.upperCase(args[i]));
        }
    }
}
