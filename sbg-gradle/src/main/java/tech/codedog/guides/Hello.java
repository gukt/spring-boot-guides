package tech.codedog.guides;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author https://github.com/gukt
 * @version 1.0
 * @date 2020/7/15 03:53
 */
public class Hello {

  private static final Logger LOGGER = LoggerFactory.getLogger(Hello.class);

  public static void main(String[] args) {
    LOGGER.info("Hello world");
  }
}
