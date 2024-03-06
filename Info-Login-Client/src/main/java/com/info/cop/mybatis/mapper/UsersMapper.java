package com.info.cop.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.info.cop.mybatis.pojo.UsersTbDo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UsersMapper extends BaseMapper<UsersTbDo> {

}
