package com.wonu606.decoratorpattern.persistencemanager.decorator;

import com.wonu606.decoratorpattern.persistencemanager.User;
import com.wonu606.decoratorpattern.persistencemanager.dataSource.DataSource;
import java.util.regex.Pattern;

public class ValidationDecorator extends DataSourceDecorator {

    public static final String KOREAN_NAME_REGEX = "^[가-힣]{2,4}$";
    public static final String PHONE_NUMBER_REGEX = "^010(-\\d{4}){2}$";
    public static final String ADDRESS_REGEX = "^[가-힣0-9\\s\\-,]+$";

    private final Pattern koreanNamePattern = Pattern.compile(KOREAN_NAME_REGEX);
    private final Pattern phoneNumberPattern = Pattern.compile(PHONE_NUMBER_REGEX);
    private final Pattern addressPattern = Pattern.compile(ADDRESS_REGEX);

    public ValidationDecorator(DataSource wrapped) {
        super(wrapped);
    }

    @Override
    public void writeData(User user) {
        if (validate(user)) {
            wrapped.writeData(user);
        }
    }

    private boolean validate(User user) {
        return isValidKoreanName(user.getName())
                && isValidPhoneNumber(user.getPhoneNumber())
                && isValidAddress(user.getAddress());
    }

    private boolean isValidKoreanName(String name) {
        return koreanNamePattern.matcher(name).matches();
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumberPattern.matcher(phoneNumber).matches();
    }

    private boolean isValidAddress(String address) {
        return addressPattern.matcher(address).matches();
    }
}
