package com.training.quest3;

import java.util.Scanner;

public class Customer {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of phone user is looking for T- touch or B- basic");
        String userChoice = scanner.next();
        if(userChoice.equalsIgnoreCase("t")){
            SmartPhone smartPhone = new TocuhScreenMobile();
            smartPhone.cameraTypes();
            smartPhone.showApps();
            smartPhone.call();
            smartPhone.messaging();
        }else if(userChoice.equalsIgnoreCase("b")){
            FeaturePhone featurePhone = new BasicMobile();
            featurePhone.call();
            featurePhone.messaging();
        }
    }
}
