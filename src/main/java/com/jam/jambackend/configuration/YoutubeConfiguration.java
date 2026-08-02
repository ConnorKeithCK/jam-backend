package com.jam.jambackend.configuration;

import com.google.api.client.googleapis.apache.v2.GoogleApacheHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.youtube.YouTube;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Configuration
public class YoutubeConfiguration {

    @Value("${jam.webclient.credentials.youtube.apiKey}")
    private String apiKey;

    @Bean
    public YouTube youtube() throws GeneralSecurityException, IOException {
        return new YouTube.Builder(
                GoogleApacheHttpTransport.newTrustedTransport(),
                GsonFactory.getDefaultInstance(),
                httpRequest -> {}).setApplicationName("JamMusic").build();
    }

    public String retrieveApiKey() {
        return apiKey;
    }
}
