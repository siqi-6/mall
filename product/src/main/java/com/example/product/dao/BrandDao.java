package com.example.product.dao;

import com.example.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:17:14
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
