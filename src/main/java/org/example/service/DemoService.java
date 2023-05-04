package org.example.service;

import com.google.common.eventbus.EventBus;
import org.example.event.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    EventBus eventBus;

    public void publish() {
        eventBus.post(new DemoEvent("Hello from service!"));
    }
}
