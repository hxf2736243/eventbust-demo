package org.example.config;

import lombok.extern.slf4j.Slf4j;
import org.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ScheduleConfig {
    @Autowired
    DemoService demoService;

    @Scheduled(fixedRate = 5000)
    public void publish() {
        log.info("ScheduleConfig.publish执行");
        demoService.publish();
    }
}
