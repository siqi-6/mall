package com.example.product;

import com.example.common.utils.PageUtils;
import com.example.product.entity.BrandEntity;
import com.example.product.entity.BrandEntity;
import com.example.product.service.BrandService;
import com.example.product.service.BrandService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为111");
        brandEntity.setDescript("哈哈哈");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
