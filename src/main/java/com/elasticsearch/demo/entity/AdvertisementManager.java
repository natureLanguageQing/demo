package com.elasticsearch.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class AdvertisementManager {

    /**
     * advertisementId 广告id
     */
    private String advertisementId;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 标签
     */
    private List<String> aiTags;

}
