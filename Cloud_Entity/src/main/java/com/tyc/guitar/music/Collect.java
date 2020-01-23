package com.tyc.guitar.music;

import lombok.Data;

@Data
public class Collect {
    private Integer cid; //收藏id
    private int collectnum; //收藏数量
    private int playnum; //播放数量
}
