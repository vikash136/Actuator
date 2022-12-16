package com.learn.helpler;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyDBHealthService implements HealthIndicator {

    public static final String DB_SERVICE = "Database Service";

    public boolean isHealthGood() {
        // custome logic
        //agar hardware releted koi chij check karsakte hai
        return true;
    }

    @Override
    public Health health() {
        if (isHealthGood())
        {
            return Health.up().withDetail("DB_SERVICE", "Database service is running").build();
        }
        return Health.down().withDetail("DB_SERVICE", "Database service is running down").build();
    }

}
/*
hamlog isko as a component bana dete hai jis ki iska khud se opject create ho jaye , taki spring kahi vi use karna chahe touse kar sakta hai*/
