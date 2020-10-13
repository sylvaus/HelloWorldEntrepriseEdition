package org.sylvaus.hello.internationalization;

import org.sylvaus.hello.configuration.Configuration;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class HelloWorldStringGetter implements IHelloWorldStringGetter {
    private Configuration configuration;

    @Inject
    public HelloWorldStringGetter(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String getHelloWorld() {
        return "Hello, World!";
    }
}
