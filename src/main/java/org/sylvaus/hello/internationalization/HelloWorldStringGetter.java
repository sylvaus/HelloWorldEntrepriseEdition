package org.sylvaus.hello.internationalization;

import org.sylvaus.hello.configuration.Configuration;
import org.sylvaus.hello.configuration.IConfiguration;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class HelloWorldStringGetter implements IHelloWorldStringGetter {
    private IConfiguration configuration;

    @Inject
    public HelloWorldStringGetter(IConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String getHelloWorld() {
        return "Hello, World!";
    }
}
