package com.company;

import com.company.devices.ScreenDevice;
import com.company.devices.ScreenSize;
import com.company.devices.Smart;
import com.company.network.Network;

public class Main {

    public static void main(String[] args) {

        Network network = new Network();
        Smart smart = new Smart(network, 10, 100, ScreenSize.HD, "alma");
        network.addDevice(smart);
    }
}
