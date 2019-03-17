package com.company.devices;

import com.company.network.Network;

import java.util.ArrayList;
import java.util.List;

public class Smart extends ScreenDevice{


    private String name;

    public Smart(Network network, int age, int batteryLife, ScreenSize screenSize, String name) {
        super(network, age, batteryLife, screenSize);
        this.name = name;
    }


    private List<Normal> collectNormalDevices(int powerDiffThreshHold){
        List<Normal> normalDevices = network.getNormalDevices();
        List<Normal> filteredDevices = new ArrayList<>();

        int remainingPower = calculateRemainingPower();

        for (Normal normalDevice : normalDevices){
            if (Math.abs(normalDevice.calculateRemainingPower() - remainingPower) < powerDiffThreshHold) {
                filteredDevices.add(normalDevice);
            }
        }

        return filteredDevices;

    }

    @Override
    public int calculateRemainingPower() {
        int batteryLifeLostDueScreenSize = 0;
        switch (screenSize){
            case EDTV: batteryLifeLostDueScreenSize= 5; break;
            case HD: batteryLifeLostDueScreenSize = 10; break;
            case UHD: batteryLifeLostDueScreenSize = 15; break;
            case FULLHD: batteryLifeLostDueScreenSize = 20; break;

        }

        return batteryLife - 15 * age - batteryLifeLostDueScreenSize;

    }

}
