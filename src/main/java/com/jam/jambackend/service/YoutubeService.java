package com.jam.jambackend.service;

import com.google.api.services.youtube.model.SearchResult;
import com.jam.jambackend.configuration.YoutubeConfiguration;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

@Service
public class YoutubeService {

    private final YoutubeConfiguration youtubeConfiguration;

    public YoutubeService(YoutubeConfiguration youtubeConfiguration) {
        this.youtubeConfiguration = youtubeConfiguration;
    }

    public List<SearchResult> searchYoutubeVideos(String videoTitle) throws
            GeneralSecurityException,
            IOException {

        return youtubeConfiguration.youtube()
                .search()
                .list(List.of("snippet"))
                .setKey(youtubeConfiguration.retrieveApiKey())
                .setQ(videoTitle)
                .setType(List.of("video"))
                .setVideoSyndicated("true")
                .setMaxResults(10L).execute().getItems();
    }

}
