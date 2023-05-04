package org.example.config;

import com.google.common.eventbus.EventBus;
import org.example.handeler.DemoEventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventBusConfiguration {
    @Autowired
    DemoEventListener demoEventListener;

    @Bean
    public EventBus eventBus() {
        EventBus eventBus = new EventBus();
        eventBus.register(demoEventListener);
        return eventBus;
    }
}
