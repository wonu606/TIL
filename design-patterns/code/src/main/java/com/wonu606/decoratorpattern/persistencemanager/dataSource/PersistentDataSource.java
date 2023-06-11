package com.wonu606.decoratorpattern.persistencemanager.dataSource;

import com.wonu606.decoratorpattern.persistencemanager.User;

public class PersistentDataSource implements DataSource {

    private User user;

    @Override
    public void writeData(User user) {
        this.user = user;
    }

    @Override
    public User readData() {
        return user;
    }
}
