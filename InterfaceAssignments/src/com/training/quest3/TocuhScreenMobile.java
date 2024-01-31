package com.training.quest3;

public class TocuhScreenMobile extends BasicMobile implements SmartPhone {

    @Override
    public void showApps() {
        System.out.println("Applications available in phone");
    }

    @Override
    public void cameraTypes() {
        System.out.println("selfie,rear camera");
    }
}
