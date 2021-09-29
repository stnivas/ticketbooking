package com.levelTw0;

import Pojo.Requirement;
import logic.Save;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Requirement customer = new Requirement();
            Save store=new Save();
            System.out.println("1.signup\n2.sign in ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter the your name");
                    String name = input.next();
                    System.out.println("enter your age");
                    int age = input.nextInt();
                    if (age > 18) {
                        System.out.println("enter the your phone number");
                        long phoneNumber = input.nextLong();
                        System.out.println("please  make password");
                        String password = input.next();
                        System.out.println("user id we are give you after signup");

                        customer.setUserName(name);
                        customer.setAge(age);
                        customer.setPhoneNumber(phoneNumber);
                        customer.setPassword(password);
                        System.out.println("USER ID IS " + customer.getUserId());
                        store.addGiveDetails(customer);
                    }
                    else {
                        System.out.println("your not eligible");
                    }
                case 2:
                    System.out.println("enter the userId");
                    int userId=input.nextInt();
                    System.out.println("enter the password");
                    String password=input.next();
                     boolean ans=store.check(userId,password);
                     if(ans=true){
                         System.out.println("continue to book");
                        LinkedHashMap bus = store.available();
                         System.out.println(bus);
                         System.out.println("select the seat hit respective number\n finished enter 00");
//                         int bookedSeat=input.nextInt();
//                         int total=0;
//                         while (bookedSeat!=000){
//                             total= (total+bus.get(bookedSeat));

                         }


                     else{
                         System.out.println("doest not match");
                     }

            }
        }
    }
}