package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String message = "  hello, maven wrapper!  ";
        String trimmed = StringUtils.strip(message);
        String capitalized = StringUtils.capitalize(trimmed);
        System.out.println(capitalized);
    }
}
