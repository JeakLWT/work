package com.ipaynow.mapper;

import com.ipaynow.domain.PasswordHistory;
import com.ipaynow.domain.PasswordHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasswordHistoryMapper {
    int countByExample(PasswordHistoryExample example);

    int deleteByExample(PasswordHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PasswordHistory record);

    int insertSelective(PasswordHistory record);

    List<PasswordHistory> selectByExample(PasswordHistoryExample example);

    PasswordHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PasswordHistory record, @Param("example") PasswordHistoryExample example);

    int updateByExample(@Param("record") PasswordHistory record, @Param("example") PasswordHistoryExample example);

    int updateByPrimaryKeySelective(PasswordHistory record);

    int updateByPrimaryKey(PasswordHistory record);
}