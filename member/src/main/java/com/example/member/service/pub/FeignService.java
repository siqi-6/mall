package com.example.member.service.pub;

import com.example.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("coupon")
public interface FeignService {


    @RequestMapping("/coupon/coupon/getOne")
    public R getCoupons();

}
