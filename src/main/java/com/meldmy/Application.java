package com.meldmy;

import com.meldmy.sample.some_logic.LogicUnderWeaving;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Dmytro Melnychuk
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private LogicUnderWeaving logicUnderWeaving;

    @Override
    public void run(String... args) {
        logicUnderWeaving.foo();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
