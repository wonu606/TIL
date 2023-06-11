package com.wonu606.decoratorpattern.persistencemanager.dataSource;

import com.wonu606.decoratorpattern.persistencemanager.User;

public interface DataSource {

    void writeData(User user);

    User readData();
}
