package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        System.out.println(formatName( "Amanda", "Charles"));
    }
    /*String rosterName = formatName("Ama", "Charles");
    System.out.println(rosterName);*/

    public static String formatName( String first, String last){
        return last + "," + " " + first;
    }
}
