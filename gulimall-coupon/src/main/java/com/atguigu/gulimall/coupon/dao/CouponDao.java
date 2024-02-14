package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hudi
 * @email hudi@qq.com
 * @date 2024-02-13 15:02:55
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
