package com.example.member.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.member.entity.UmsMemberLevelEntity;
import com.example.member.service.UmsMemberLevelService;
import com.example.common.utils.PageUtils;
import com.example.common.utils.R;



/**
 * 会员等级
 *
 * @author siqi
 * @email sunlightcs@gmail.com
 * @date 2023-10-19 18:39:35
 */
@RestController
@RequestMapping("member/umsmemberlevel")
public class UmsMemberLevelController {
    @Autowired
    private UmsMemberLevelService umsMemberLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:umsmemberlevel:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberLevelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("member:umsmemberlevel:info")
    public R info(@PathVariable("id") Long id){
		UmsMemberLevelEntity umsMemberLevel = umsMemberLevelService.getById(id);

        return R.ok().put("umsMemberLevel", umsMemberLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("member:umsmemberlevel:save")
    public R save(@RequestBody UmsMemberLevelEntity umsMemberLevel){
		umsMemberLevelService.save(umsMemberLevel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   //@RequiresPermissions("member:umsmemberlevel:update")
    public R update(@RequestBody UmsMemberLevelEntity umsMemberLevel){
		umsMemberLevelService.updateById(umsMemberLevel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("member:umsmemberlevel:delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberLevelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
