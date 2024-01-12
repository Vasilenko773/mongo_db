package ru.ivvasilen.moongo_db;

import com.mongodb.ConnectionString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {


    @Bean
    public MongoClientSettingsBuilderCustomizer customizer(@Value("${mongo.uri}") String uri) {
        ConnectionString connection = new ConnectionString(uri);

        return settings -> settings.applyConnectionString(connection);
    }
}
