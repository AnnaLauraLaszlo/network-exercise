package com.company.devices;

import com.company.network.Network;

import java.util.ArrayList;
import java.util.List;

public class Connected extends Device {

    private List<Device> connectedDevices = new ArrayList<>();

    public Connected(Network network, int age, int batteryLife) {
        super(network, age, batteryLife);
        updateConnectedDevices();
    }


    public void updateConnectedDevices(){
        connectedDevices.clear();
        connectedDevices.addAll(network.getConnectedDevices());
    }


    @Override
    public int calculateRemainingPower(){
        return batteryLife -7* age +20 * connectedDevices.size();

    }
}
