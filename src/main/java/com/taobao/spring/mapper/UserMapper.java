package com.taobao.spring.mapper;

import com.taobao.spring.core.UserStatus;
import com.taobao.spring.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

/**
 * @auther liuyang
 * @date 2019年09月04日
 */
public interface UserMapper {

    Optional<User> queryUserById(@Param("userId") long userId);

    List<User> queryUserListByStatus(@Param("status") UserStatus status);
}