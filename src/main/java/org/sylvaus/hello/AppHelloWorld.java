package org.sylvaus.hello;

import org.sylvaus.hello.internationalization.HelloWorldStringGetter;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppHelloWorld {
    private final HelloWorldStringGetter stringGetter;

    @Inject
    public AppHelloWorld(HelloWorldStringGetter stringGetter) {
        this.stringGetter = stringGetter;
    }

    public void run() {
        System.out.println( stringGetter.getHelloWorld() );
    }

}
