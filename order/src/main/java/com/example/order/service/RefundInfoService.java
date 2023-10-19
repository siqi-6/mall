package com.example.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:25:37
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

