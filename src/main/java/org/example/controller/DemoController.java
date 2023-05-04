package org.example.controller;


import com.google.common.eventbus.EventBus;
import org.example.event.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    EventBus eventBus;

    @GetMapping("/publish")
    public String publish() {
        eventBus.post(new DemoEvent("Hello from controller!"));
        return "Success";
    }
}
