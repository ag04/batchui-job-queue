package com.ag04.batchui.dbqueue;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.ag04.batchui.dbqueue")
@EnableJpaRepositories("com.ag04.batchui.dbqueue.repository")
public class DbQueueModuleConfiguration {
}