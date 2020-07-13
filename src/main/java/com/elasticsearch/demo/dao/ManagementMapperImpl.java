package com.elasticsearch.demo.dao;

import com.elasticsearch.demo.entity.AdvertisementManager;
import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class ManagementMapperImpl implements ManagementMapper {
    @Resource
    private RestClient restClient;
    private static final String INDEX_ARTICLE = "advertisement_index_information";
    private static final String TYPE_ARTICLE = "advertisement_information";
    @Override
    public Map<String, Object> addAdvertisementManager(AdvertisementManager advertisementManager) {
        return null;
    }

    @Override
    public Map<String, Object> updateAdvertisementManager(AdvertisementManager advertisementManager) {
        return null;
    }

    @Override
    public Map<String, Object> deleteAdvertisementManager(String advertisementManager) {
        return null;
    }

    @Override
    public Map<String, Object> batchInsertAdvertisement(List<AdvertisementManager> advertisementManager) {
        return null;
    }
}
