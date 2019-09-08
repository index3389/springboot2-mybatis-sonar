package com.taobao.spring.typehandler;

import com.taobao.spring.core.UserStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @auther liuyang
 * @date 2019年09月05日
 */
public class UserStatusTypeHandler implements TypeHandler<UserStatus> {

    @Override
    public void setParameter(PreparedStatement ps, int i, UserStatus parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(parameter.getStatus(), i);
    }

    @Override
    public UserStatus getResult(ResultSet rs, String columnName) throws SQLException {
        return UserStatus.toUserStatus(rs.getInt(columnName));
    }

    @Override
    public UserStatus getResult(ResultSet rs, int columnIndex) throws SQLException {
        return UserStatus.toUserStatus(rs.getInt(columnIndex));
    }

    @Override
    public UserStatus getResult(CallableStatement cs, int columnIndex) throws SQLException {
        throw new SQLException("not supported");
    }
}
