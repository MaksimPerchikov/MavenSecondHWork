package ru.ibs;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class StarterClass {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            show(StringUtils.upperCase(str));
            //
            showWithoutApache(str);

        }
    }
    public static void show(String str){
        System.out.println(String.format(str));
    }
    //Верхний регистр без Апачи
    public static void showWithoutApache(String str){
        System.out.println(str.toUpperCase());
    }
}
