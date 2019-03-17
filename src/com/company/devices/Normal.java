package com.company.devices;

import com.company.network.Network;

public class Normal extends ScreenDevice{

    private int yearManufacturedIn;


    public Normal(Network network, int age, int batteryLife, ScreenSize screenSize, int yearManufacturedIn) {
        super(network, age, batteryLife, screenSize);
        this.yearManufacturedIn = yearManufacturedIn;
    }


    @Override
    public int calculateRemainingPower() {
        int baseRemainingPower = batteryLife - age * 3;
        if (yearManufacturedIn >= 2000){
            return baseRemainingPower *2;
        }
        else {
            return baseRemainingPower /2;

        }

    }

}
