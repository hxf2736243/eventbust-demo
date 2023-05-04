package org.example.event;

import lombok.Data;

@Data
public class DemoEvent {
    private String message;

    public DemoEvent(String message) {
        this.message = message;
    }

}
