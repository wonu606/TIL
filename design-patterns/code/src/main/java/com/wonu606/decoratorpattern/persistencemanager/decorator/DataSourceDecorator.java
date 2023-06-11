package com.wonu606.decoratorpattern.persistencemanager.decorator;

import com.wonu606.decoratorpattern.persistencemanager.User;
import com.wonu606.decoratorpattern.persistencemanager.dataSource.DataSource;

public abstract class DataSourceDecorator implements DataSource {

    protected DataSource wrapped;

    public DataSourceDecorator(DataSource wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void writeData(User user) {
        wrapped.writeData(user);
    }

    @Override
    public User readData() {
        return wrapped.readData();
    }
}
