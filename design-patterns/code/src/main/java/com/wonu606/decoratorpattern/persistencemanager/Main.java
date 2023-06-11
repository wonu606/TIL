package com.wonu606.decoratorpattern.persistencemanager;

import com.wonu606.decoratorpattern.persistencemanager.dataSource.DataSource;
import com.wonu606.decoratorpattern.persistencemanager.dataSource.PersistentDataSource;
import com.wonu606.decoratorpattern.persistencemanager.decorator.DataSourceDecorator;
import com.wonu606.decoratorpattern.persistencemanager.decorator.EncryptionDecorator;
import com.wonu606.decoratorpattern.persistencemanager.decorator.ValidationDecorator;

public class Main {

    public static void main(String[] args) {
        DataSource storage = new PersistentDataSource();
        DataSourceDecorator decorator =
                new ValidationDecorator(new EncryptionDecorator(storage));

        User user = new User(
                "유원우", "010-3756-4670", "경기도 번영로 111-2222");

        decorator.writeData(user);
        System.out.println("EncryptedUser = " + storage.readData());

        User decryptedUser = decorator.readData();
        System.out.println("decryptedUser = " + decryptedUser);
    }
}
