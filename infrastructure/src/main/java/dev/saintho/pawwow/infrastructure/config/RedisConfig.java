package dev.saintho.pawwow.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories(basePackages = {"dev.saintho.pawwow.infrastructure.redis"})
public class RedisConfig {
}
