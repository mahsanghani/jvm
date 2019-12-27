package com.linuxality.conditionals;

public class Main3 {

    public static void main(String[] args){
        int students = 150;
        int rooms = 0;

        if (rooms > 0 && students/rooms > 30) //Because left hnd condition was not met it ends there using the double &&
            System.out.println("Crowded!!");



        System.out.println();
        System.out.println("** end program **");
    }
}