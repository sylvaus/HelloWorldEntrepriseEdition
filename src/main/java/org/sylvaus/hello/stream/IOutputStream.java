package org.sylvaus.hello.stream;


import java.io.Closeable;

public interface IOutputStream<T> extends Closeable, AutoCloseable {
    void write(T toBeWritten);
    void flush();
}
