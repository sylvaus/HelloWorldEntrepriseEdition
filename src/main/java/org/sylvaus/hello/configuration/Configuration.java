package org.sylvaus.hello.configuration;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Locale;

@Singleton
public class Configuration {

    @Inject
    public Configuration() {

    }

    public Locale provideLocal() {
        return Locale.CANADA;
    }
}
