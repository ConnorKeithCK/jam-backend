package com.jam.jambackend.model.Youtube;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.Instant;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class YoutubeVideo {

    private String kind;
    private String etag;
    private YoutubeID id;
    private YoutubeSnippet snippet;
    private Map<String, YoutubeThumbnail> thumbnails;
    private String channelTitle;
    private String liveBroadcastContent;
    private Instant publishTime;

}
