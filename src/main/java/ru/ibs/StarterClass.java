package ru.ibs;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class StarterClass {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            showWithoutApache(str);

           // System.out.println(StringUtils.upperCase(str));
           // System.out.println("ERROR");

        }
    }
    public static void show(String str){
        System.out.println(String.format(str));
    }

    public static void showWithoutApache(String str){
        System.out.println(str.toUpperCase());
    }
}
