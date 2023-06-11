package com.wonu606.decoratorpattern.persistencemanager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
public class User {

    private String name;
    private String phoneNumber;
    private String address;
}
