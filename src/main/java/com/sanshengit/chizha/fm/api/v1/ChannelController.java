package com.sanshengit.chizha.fm.api.v1;

import org.springframework.web.bind.annotation.*;

/**
 * Created by jason on 2017/8/27.
 */
@RestController
@RequestMapping("v1/channel")
public class ChannelController {
    @GetMapping(value = "/{channelID}")
    public String test(@PathVariable("channelID") String channelID){
        return channelID;
    }
}
