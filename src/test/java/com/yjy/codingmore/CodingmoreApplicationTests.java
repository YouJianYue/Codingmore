package com.yjy.codingmore;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootTest
class CodingmoreApplicationTests {


    static Logger logger = LoggerFactory.getLogger(CodingmoreApplication.class);

    @Test
    void contextLoads() {
        logger.info("logback testing");
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
