package org.sylvaus.hello.internationalization;

import dagger.Binds;
import dagger.Module;
import org.sylvaus.hello.configuration.Configuration;
import org.sylvaus.hello.configuration.IConfiguration;

@Module
public abstract class HelloWorldStringModule {
    @Binds
    abstract IConfiguration bindConfiguration(Configuration configuration);

    @Binds
    abstract IHelloWorldStringGetter bindHelloWorldStringGetter(HelloWorldStringGetter helloWorldStringGetter);
}
