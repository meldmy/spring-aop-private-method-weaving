package com.meldmy.sample.config;

import com.meldmy.sample.some_logic.LogicUnderWeaving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

import static org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving.ENABLED;

/**
 * @author Dmytro Melnychuk
 */
@Configuration
@EnableSpringConfigured
@EnableLoadTimeWeaving(aspectjWeaving = ENABLED)
public class SomeConfiguration {

    @Bean
    public LogicUnderWeaving logicUnderWeaving() {
        return new LogicUnderWeaving();
    }

}
