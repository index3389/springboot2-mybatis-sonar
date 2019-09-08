package com.taobao.spring.typehandler;

import com.taobao.spring.core.UserSex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @auther liuyang
 * @date 2019年09月04日
 */
public class UserSexTypeHandler implements TypeHandler<UserSex> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, UserSex userSex, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, userSex.getSex());
    }

    @Override
    public UserSex getResult(ResultSet resultSet, String s) throws SQLException {
        return UserSex.toUserSex(resultSet.getInt(s));
    }

    @Override
    public UserSex getResult(ResultSet resultSet, int i) throws SQLException {
        return UserSex.toUserSex(resultSet.getInt(i));
    }

    @Override
    public UserSex getResult(CallableStatement callableStatement, int i) throws SQLException {
        throw new SQLException("not supported");
    }
}
