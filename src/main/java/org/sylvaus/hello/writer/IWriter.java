package org.sylvaus.hello.writer;

/**
 * Does not inherit from Writer as it is way too slow due to the locks
 * and HelloWorld printing is s serious business which need the best performance
 */
public interface IWriter<T> {
    void write(T toBeWritten);
}
