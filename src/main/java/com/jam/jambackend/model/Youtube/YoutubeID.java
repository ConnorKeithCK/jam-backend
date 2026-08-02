package com.jam.jambackend.model.Youtube;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class YoutubeID {

    private String kind;
    private String videoId;
    private String channelId;
    private String playlistId;

}
