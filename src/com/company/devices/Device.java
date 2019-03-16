package com.company.devices;

public abstract class Device {

    protected int age;
    protected int batteryLife;

    public abstract void calculateBatteryLife();

    public abstract void calculateRemainingPower();
}
