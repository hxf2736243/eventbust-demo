package org.example.handeler;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.example.event.DemoEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DemoEventListener {
    @Subscribe
    public void onDemoEvent(DemoEvent event) {
        log.info("Received: " + event.getMessage());
    }
}
