package com.example.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:17:13
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

