package com.example.ware.dao;

import com.example.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:45:14
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
