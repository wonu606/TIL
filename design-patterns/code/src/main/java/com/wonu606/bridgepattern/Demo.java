package com.wonu606.bridgepattern;

import com.wonu606.bridgepattern.devices.Device;
import com.wonu606.bridgepattern.devices.Radio;
import com.wonu606.bridgepattern.devices.Television;
import com.wonu606.bridgepattern.remotes.AdvancedRemote;
import com.wonu606.bridgepattern.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Television());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
