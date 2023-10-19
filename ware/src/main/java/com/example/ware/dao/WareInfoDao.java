package com.example.ware.dao;

import com.example.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:45:14
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
