package com.company.devices;

import java.util.ArrayList;
import java.util.List;

public class Smart extends ScreenDevice{


    private String name;
    private List<Device> normalDevicesWithDiffThrashHold = new ArrayList<>();



    private void collectNormalDevices(int powerDiffTrashHold, Device device){

        normalDevicesWithDiffThrashHold.add(device);



    }

    @Override
    public void calculateBatteryLife() {

    }

    @Override
    public void calculateRemainingPower() {

    }
}
