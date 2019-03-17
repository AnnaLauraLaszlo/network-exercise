package com.company.devices;

import com.company.network.Network;

public abstract class ScreenDevice extends Device{

    protected ScreenSize screenSize;


    public ScreenDevice(Network network, int age, int batteryLife, ScreenSize screenSize) {
        super(network, age, batteryLife);
        this.screenSize = screenSize;
    }

}
