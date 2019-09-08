package com.taobao.spring.core;

/**
 * @auther liuyang
 * @date 2019年09月04日
 */
public enum UserSex {

    MALE(1, "男"), FEMALE(2, "女");

    private int sex;

    private String desc;

    UserSex(int sex, String desc) {
        this.sex = sex;
        this.desc = desc;
    }

    public static UserSex toUserSex(int sex) {
        return sex == 1 ? MALE : FEMALE;
    }

    public int getSex() {
        return sex;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "[" + sex + "," + desc + "]";
    }
}