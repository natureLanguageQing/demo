package com.elasticsearch.demo.service;

import com.elasticsearch.demo.dao.ManagementMapper;
import com.elasticsearch.demo.entity.AdvertisementManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 广告数据管理层接口
 * Created by ygq
 * 2018/3/7 16:40
 */
@Service
public class ManagementService {

    private static final Logger logger = LoggerFactory.getLogger(ManagementService.class);

    @Autowired
    private ManagementMapper managementMapper;


    /**
     * 新增 广告 数据
     * @return 新增成功 新增失败
     */
    public Map<String, Object> addAdvertisement(AdvertisementManager advertisementManager){
        return  managementMapper.addAdvertisementManager(advertisementManager);
    }

    /**
     * 删除 广告 数据
     * @param advertisementManagerId 广告id
     * @return 删除成功、删除失败
     */
    public Map<String, Object> deleteAdvertisement(String advertisementManagerId){
        return managementMapper.deleteAdvertisementManager(advertisementManagerId);

    }

    /**
     * 更改广告数据
     * @param advertisementManager 广告数据
     * @return 更改成功 更改失败
     */
   public Map<String, Object> updateAdvertisement(AdvertisementManager advertisementManager){
       return managementMapper.updateAdvertisementManager(advertisementManager);
   }


    /**
     * 批量导入广告数据
     * @param advertisementManager 广告数据集合
     * @return roleId
     */
    public Map<String, Object> batchInsertAdvertisement(List<AdvertisementManager> advertisementManager) {
        return managementMapper.batchInsertAdvertisement(advertisementManager);
    }




}
