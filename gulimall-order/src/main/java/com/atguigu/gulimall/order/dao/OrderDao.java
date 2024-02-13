package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hudi
 * @email hudi@qq.com
 * @date 2024-02-13 15:30:26
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
