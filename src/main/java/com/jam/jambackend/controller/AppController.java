package com.jam.jambackend.controller;

import com.google.api.services.youtube.model.SearchResult;
import com.jam.jambackend.service.YoutubeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

@RestController
public class AppController {

    private YoutubeService youtubeService;

    public AppController(YoutubeService youtubeService) {
        this.youtubeService = youtubeService;
    }

//    YouTube Search API for proof of concept
    @RequestMapping(path = "/youtube", method = RequestMethod.GET)
    public List<SearchResult> searchYouTubeVideos(String videoTitle) throws GeneralSecurityException, IOException {
        return youtubeService.searchYoutubeVideos(videoTitle);
    }

    @RequestMapping(path = "/spotify", method = RequestMethod.GET)
    public List<SearchResult> searchSpotify(String videoId) throws GeneralSecurityException, IOException {
        return youtubeService.playYoutubeVideo(videoId);
    }


}
