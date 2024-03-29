package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hudi
 * @email hudi@qq.com
 * @date 2024-02-13 15:14:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
