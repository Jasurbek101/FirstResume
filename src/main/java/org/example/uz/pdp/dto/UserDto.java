package org.example.uz.pdp.dto;

import org.example.uz.pdp.model.User;

import java.util.Scanner;

public class UserDto {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);

    public static boolean registration(){
        User user = new User();
        System.out.print(" Enter your name : ");
        user.setName(scannerStr.nextLine());

        System.out.print("\n Enter your lastName : ");
        user.setLastName(scannerStr.nextLine());

        System.out.print("\n Enter your phoneNumber \n +998");
        user.setPhoneNumber(scannerInt.nextInt());

        System.out.print("\n Enter your Birthday : \n\t Day ");
        user.setBirthday(scannerStr.nextInt());

        System.out.print("\n Enter your Birthday : \n\t Moth ");
        user.setMonth(scannerStr.nextInt());

        System.out.print("\n Enter your Birthday : \n\t Year ");
        user.setYear(scannerStr.nextInt());

        System.out.println("\n Choose the ypur gender\n1.Male\n2.Female");
        int k = scannerInt.nextInt();
        if(k == 1){
            user.setGender("MALE");
        } else if (k == 2) {
            user.setGender("MALE");
            // +++++++++++++++++++++++++
        }


        return true;
    }

    public static void main(String[] args) {
        registration();
    }
}
