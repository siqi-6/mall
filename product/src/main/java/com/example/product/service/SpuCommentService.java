package com.example.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:17:13
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

