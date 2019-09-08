package com.taobao.spring.entity;

import com.taobao.spring.core.UserSex;
import com.taobao.spring.core.UserStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @auther liuyang
 * @date 2019年09月04日
 */
@Setter
@Getter
@ToString
public class User {

    private long userId;

    private String username;

    private String password;

    private UserSex userSex;

    private UserStatus status;

    private LocalDateTime regDate;
}
