package com.wonu606.decoratorpattern.persistencemanager.decorator;

import com.wonu606.decoratorpattern.persistencemanager.User;
import com.wonu606.decoratorpattern.persistencemanager.dataSource.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {

    private final int MOVE_VALUE = 3;

    public EncryptionDecorator(DataSource wrapped) {
        super(wrapped);
    }

    @Override
    public void writeData(User user) {
        User encryptedUser = encrypt(user);
        super.writeData(encryptedUser);
    }

    private User encrypt(User user) {
        String encryptedName = shift(user.getName(), MOVE_VALUE);
        String encryptedPhoneNumber = shift(user.getPhoneNumber(), MOVE_VALUE);
        String encryptedAddress = shift(user.getAddress(), MOVE_VALUE);
        return new User(encryptedName, encryptedPhoneNumber, encryptedAddress);
    }

    private String shift(String str, int moveValue) {
        StringBuilder builder = new StringBuilder();

        for (char ch : str.toCharArray()) {
            builder.append((char) (ch + moveValue));
        }

        return builder.toString();
    }

    @Override
    public User readData() {
        User user = super.readData();
        return decrypt(user);
    }

    private User decrypt(User user) {
        String decryptedName = shift(user.getName(), -MOVE_VALUE);
        String decryptedPhoneNumber = shift(user.getPhoneNumber(), -MOVE_VALUE);
        String decryptedAddress = shift(user.getAddress(), -MOVE_VALUE);
        return new User(decryptedName, decryptedPhoneNumber, decryptedAddress);
    }
}
