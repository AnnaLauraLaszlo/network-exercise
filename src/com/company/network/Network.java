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


    public List<Connected> getConnectedDevices(){
        return connectedDevices;
    }


    public List<Smart> getSmartDevices(){
        return smartDevices;
    }


    public List<Normal> getNormalDevices(){
        return normalDevices;
    }


    public void addDevice(Device device){
        if (device instanceof Normal){
            normalDevices.add((Normal) device);
        }
        else if (device instanceof Smart){
            smartDevices.add((Smart) device);
        }
        else if (device instanceof Connected){
            connectedDevices.add((Connected) device);
        }
     }



    private void updateConnectedDevices(){
        for(Connected connectedDevice : connectedDevices){
            connectedDevice.updateConnectedDevices();

        }
    }
}
