package com.luv4code.service.limits.configuration;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("limits-service")
@Data
@NoArgsConstructor
public class LimitsConfiguration {
    private int minimum;
    private int maximum;
}
