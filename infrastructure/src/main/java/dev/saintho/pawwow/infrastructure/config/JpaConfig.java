package dev.saintho.pawwow.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"dev.saintho.pawwow.infrastructure.jpa"})
@EnableJpaAuditing
public class JpaConfig {
}
