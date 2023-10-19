package com.example.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:45:14
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

