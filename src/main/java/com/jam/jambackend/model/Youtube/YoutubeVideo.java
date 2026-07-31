package com.jam.jambackend.model.Youtube;

import lombok.Data;

import java.util.Map;

@Data
public class YoutubeVideo {

    private String kind;
    private String etag;
    private YoutubeID id;
    private YoutubeSnippet snippet;
    private Map<String, YoutubeThumbnail> thumbnails;

}
