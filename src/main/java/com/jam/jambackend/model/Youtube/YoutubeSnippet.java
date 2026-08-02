package com.jam.jambackend.model.Youtube;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.Instant;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class YoutubeSnippet {

    private Instant publishedAt;
    private String channelId;
    private String title;
    private String description;
    private YoutubeThumbnail thumbnails;

}
