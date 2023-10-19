package com.example.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:17:14
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

