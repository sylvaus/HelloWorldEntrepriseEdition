package org.sylvaus.hello.internationalization;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class HelloWorldStringModule {
    @Binds
    abstract IHelloWorldStringGetter bindHelloWorldStringGetter(HelloWorldStringGetter helloWorldStringGetter);
}
