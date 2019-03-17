package com.company.devices;

import com.company.network.Network;

public abstract class Device {


    protected Network network;
    protected int age;
    protected int batteryLife;


    public Device(Network network, int age, int batteryLife) {
        this.network = network;
        this.age = age;
        this.batteryLife = batteryLife;
    }


    public abstract int calculateRemainingPower();

}
