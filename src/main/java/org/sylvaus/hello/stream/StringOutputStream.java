package org.sylvaus.hello.stream;

import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class StringOutputStream implements IOutputStream<String>{
    private final IOutputStream<Byte[]> _bytesOutputStream;
    private final String _charset;

    public StringOutputStream(IOutputStream<Byte[]> bytesOutputStream, String charset) {
        _bytesOutputStream = bytesOutputStream;
        _charset = charset;
    }

    @Override
    public void write(String toBeWritten) {
        try {
            _bytesOutputStream.write(ArrayUtils.toObject(toBeWritten.getBytes(_charset)));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void flush() {
        _bytesOutputStream.flush();
    }

    @Override
    public void close() throws IOException {
        _bytesOutputStream.close();
    }
}
