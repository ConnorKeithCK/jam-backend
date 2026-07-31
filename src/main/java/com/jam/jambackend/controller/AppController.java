package com.jam.jambackend.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jam.jambackend.model.Youtube.YoutubeVideo;

import java.util.List;

@RestController
public class AppController {


//    YouTube Search API for proof of concept
    @RequestMapping(method = HttpMethod.GET)
    public List<YoutubeVideo> searchYouTubeVideos() {

    }


}
