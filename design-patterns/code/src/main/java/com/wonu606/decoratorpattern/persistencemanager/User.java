package com.wonu606.decoratorpattern.persistencemanager;

public class User {

    private final String name;
    private final String phoneNumber;
    private final String address;

    public User(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n"
                + "phoneNumber: " + phoneNumber + "\n"
                + "address: " + address + "\n";
    }
}
