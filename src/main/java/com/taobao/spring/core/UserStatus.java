package com.taobao.spring.core;

/**
 * @auther liuyang
 * @date 2019年09月05日
 */
public enum UserStatus {

    INIT(1, "未激活"), OK(2, "正常"), LOCK(3, "锁定"), BLACK(4, "黑名单");

    private int status;
    private String desc;

    UserStatus(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    public static UserStatus toUserStatus(int status) {
        if (status == 1) {
            return INIT;
        } else if (status == 2) {
            return OK;
        } else if (status == 3) {
            return LOCK;
        } else {
            return BLACK;
        }
    }

    @Override
    public String toString() {
        return "[" + status + "," + desc + "]";
    }
}
