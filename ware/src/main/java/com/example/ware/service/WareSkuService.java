package com.example.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:45:14
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

