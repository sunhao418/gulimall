package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sunhao
 * @email sunhaojc@163.com
 * @date 2021-08-15 09:24:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
