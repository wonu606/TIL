package com.wonu606.decoratorpattern.IOdecorator;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        int ch;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    System.in
                            )
                    );
            while ((ch = in.read()) >= 0) {
                if (ch == '\n') {
                    break;
                }
                System.out.print((char) ch);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
