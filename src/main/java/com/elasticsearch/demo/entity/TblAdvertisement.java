package com.elasticsearch.demo.entity;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
//import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 广告基础信息
 */

@Data
@Builder

@Document(indexName = "advert_index_information", type = "advert_information")	// 索引库名称和 type
public class TblAdvertisement {

  private String id;
  /**
   * 一级标题
   */
  private long feedModularId;
  /**
   * 二级标题
   */
  private long feedSecondId;
  /**
   * 三级标题
   */
  private long feedThreeId;
  /**
   * 广告名称 一般不用
   */
  @Field(type = FieldType.text, analyzer = "ik_max_word")
  private String advertisementName;
  @Field(type = FieldType.text, analyzer = "ik_max_word")
  private String advertisementTitle;
  @Field(type = FieldType.text, analyzer = "ik_max_word")
  private String advertisementPic;
  private long orderNum;
  /**
   * 开始展示时间
   */
  private long showBeginTime;
  /**
   * 结束展示时间
   */
  private long showEntTime;
  private long jumpType;

  private String jumpUrl;
  /**
   * 广告状态
   */
  private long advertisementStatus;
  /**
   * 广告标签
   */
  @Field(type = FieldType.text, analyzer = "ik_max_word")
  private String advertisementTag;
  /**
   *
   */
  private String updateTime;
  private long createTime;
}
