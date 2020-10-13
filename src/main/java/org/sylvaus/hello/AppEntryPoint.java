package org.sylvaus.hello;


import dagger.Component;
import org.sylvaus.hello.internationalization.HelloWorldStringModule;

import javax.inject.Singleton;

@Singleton
public class AppEntryPoint
{
    public static void main( String[] args ){
        DaggerAppEntryPoint_AppHelloWorldFactory.create().build().run();
    }

    @Singleton
    @Component(modules = {HelloWorldStringModule.class})
    interface AppHelloWorldFactory {
        AppHelloWorld build();
    }
}
