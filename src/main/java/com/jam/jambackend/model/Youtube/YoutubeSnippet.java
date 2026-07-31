package com.jam.jambackend.model.Youtube;

import lombok.Data;

import java.time.Instant;

@Data
public class YoutubeSnippet {

    private Instant publishedAt;
    private String channelId;
    private String title;
    private String description;
    private YoutubeThumbnail thumbnails;

}
