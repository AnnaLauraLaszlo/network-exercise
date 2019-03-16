package com.company.network;

import com.company.devices.Connected;
import com.company.devices.Device;
import com.company.devices.Normal;
import com.company.devices.Smart;

import java.util.ArrayList;
import java.util.List;

public class Network {

    private List<Connected> connectedDevices = new ArrayList<>();
    private List<Smart> smartDevices = new ArrayList<>();
    private List<Normal> normalDevices = new ArrayList<>();


    public void simulateYear(int numberOfYears){

        for (int i = 0; i < numberOfYears; i++) {

            for (Smart smart: smartDevices
                 ) {
                smart.calculateBatteryLife();
                
            }

            for (Connected connected: connectedDevices
                 ) {
                connected.calculateBatteryLife();

            }

            for (Normal normal: normalDevices
                 ) {
                normal.calculateBatteryLife();

            }
        }

    }

}
