package com.tyc.guitar.music;

import lombok.Data;

@Data
public class MusicScore {
    private Integer pid; //乐谱id
    private String name; //乐谱名
    private String musicperson; //音乐人
    private String mimg; //乐谱图片
    private String music; //乐谱mp3资源
    private String simg; //乐谱封面
}
