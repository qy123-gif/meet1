package com.xyongfeng.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyongfeng.pojo.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author xyongfeng
 * @since 2022-06-09
 */
@Component
public interface UsersMapper extends BaseMapper<Users> {

    IPage<Users> selectFriendsAndChatPage(Page<Users> page, @Param("ownerId") Integer ownerId);
}
