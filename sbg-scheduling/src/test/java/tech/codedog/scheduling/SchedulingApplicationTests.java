package tech.codedog.scheduling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchedulingApplicationTests {

    @Autowired
    private ScheduledTasks tasks;

    @Test
    void contextLoads() {
        Assertions.assertThat(tasks).isNotNull();
    }

}
