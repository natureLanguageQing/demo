package com.elasticsearch.demo.controller;

import com.elasticsearch.demo.entity.AdvertisementManager;
import com.elasticsearch.demo.service.ManagementService;
import com.elasticsearch.demo.util.ResponseData;
import com.elasticsearch.demo.util.ResponseDataUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 数据同步管理页面
 * Created by ygq
 * 2020-6-30 15:01:13
 */
@RestController
public class ManagementController {
    private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);

    private final ManagementService mService;

    public ManagementController(ManagementService mService) {
        this.mService = mService;
    }

    /**
     * 新增/更新广告数据
     *
     * @return 成功失败
     */
    @RequestMapping(value = "/addAdvertisement", method = RequestMethod.POST)
    public ResponseData addAdvertisement(@RequestBody AdvertisementManager advertisementManager) {

        Map<String, Object> jsonObject =mService.addAdvertisement(advertisementManager);
        return ResponseDataUtil.buildSuccess(jsonObject);
    }

    /**
     * 下架广告数据
     *
     * @param advertisementId 广告ID
     * @return 删除成功 删除失败
     */
    @RequestMapping(value = "/delAdvertisement", method = RequestMethod.POST)
    public ResponseData updateAdvertisement(String advertisementId) {

        Map<String, Object> jsonObject =mService.deleteAdvertisement(advertisementId);
        return ResponseDataUtil.buildSuccess(jsonObject);
    }


}
