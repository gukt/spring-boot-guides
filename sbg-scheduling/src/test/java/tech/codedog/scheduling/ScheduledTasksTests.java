package tech.codedog.scheduling;

import org.awaitility.Duration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

/**
 * @author https://github.com/gukt
 * @version 1.0
 * @date 2020/7/12 03:04
 */
@SpringBootTest
class ScheduledTasksTests {

  @SpyBean ScheduledTasks tasks;

  @Test
  void reportCurrentTime() {
    await()
        .atMost(Duration.TEN_SECONDS)
        .untilAsserted(() -> verify(tasks, atLeast(2)).reportCurrentTime());
  }
}
