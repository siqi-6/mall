package com.example.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author siqi
 * @email LSQ20201001@163.com
 * @date 2023-11-01 16:52:42
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

