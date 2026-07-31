package com.jam.jambackend.model.Youtube;

import lombok.Data;

@Data
public class YoutubeID {

    private String kind;
    private String videoId;
    private String channelId;
    private String playlistId;

}
