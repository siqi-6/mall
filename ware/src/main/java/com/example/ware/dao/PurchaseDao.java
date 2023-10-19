package com.example.ware.dao;

import com.example.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:45:14
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
