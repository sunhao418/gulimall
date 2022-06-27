package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sunhao
 * @email sunhaojc@163.com
 * @date 2021-08-06 07:50:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
