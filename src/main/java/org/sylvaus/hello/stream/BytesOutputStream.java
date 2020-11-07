package org.sylvaus.hello.stream;

import java.io.IOException;
import java.util.Arrays;

public class BytesOutputStream implements IOutputStream<Byte[]> {
    private final IOutputStream<Byte> _byteOutputStream;

    public BytesOutputStream(IOutputStream<Byte> byteOutputStream) {
        _byteOutputStream = byteOutputStream;
    }

    @Override
    public void write(Byte[] toBeWritten) {
        Arrays.stream(toBeWritten).forEachOrdered(_byteOutputStream::write);
    }

    @Override
    public void flush() {
        _byteOutputStream.flush();
    }

    @Override
    public void close() throws IOException {
        _byteOutputStream.close();
    }
}
