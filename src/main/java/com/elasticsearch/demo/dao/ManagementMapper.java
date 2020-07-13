package com.elasticsearch.demo.dao;


import com.elasticsearch.demo.entity.AdvertisementManager;

import java.util.List;
import java.util.Map;

public interface ManagementMapper {
    /**
     * 增加广告数据
     * @param advertisementManager 广告数据
     * @return 增加成功 增加失败
     */
    Map<String, Object> addAdvertisementManager(AdvertisementManager advertisementManager);
    /**
     * 更新广告数据
     * @param advertisementManager 广告数据
     * @return 增加成功 增加失败
     */
    Map<String, Object> updateAdvertisementManager(AdvertisementManager advertisementManager);
    /**
     * 删除广告数据
     * @param advertisementManager 广告id
     * @return 删除成功
     */
    Map<String, Object> deleteAdvertisementManager(String advertisementManager);

    /**
     * 批量导入广告数据
     * @param advertisementManager 广告集合
     * @return 导入成功、导入失败
     */
    Map<String, Object> batchInsertAdvertisement(List<AdvertisementManager> advertisementManager);
}
