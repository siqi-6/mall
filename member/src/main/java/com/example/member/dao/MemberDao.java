package com.example.member.dao;

import com.example.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author siqi
 * @email LSQ20201001@163.com
 * @date 2023-11-01 16:52:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
