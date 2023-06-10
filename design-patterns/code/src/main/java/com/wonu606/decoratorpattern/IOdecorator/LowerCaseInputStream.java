package com.wonu606.decoratorpattern.IOdecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code> by assigning the  argument <code>in</code> to the
     * field
     * <code>this.in</code> so as to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if this instance is to be created
     *           without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int ch = in.read();
        return (ch == -1 ? ch : Character.toLowerCase(ch));
    }

    public int read(byte bytes[], int offset, int len) throws IOException {
        int result = in.read(bytes, offset, len);
        for (int i = offset; i < offset + result; i++) {
            bytes[i] = (byte) Character.toLowerCase(bytes[i]);
        }
        return result;
    }
}
