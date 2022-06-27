package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author sunhao
 * @email sunhaojc@163.com
 * @date 2021-08-15 09:34:20
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
