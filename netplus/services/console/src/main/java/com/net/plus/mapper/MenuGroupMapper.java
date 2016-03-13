package com.net.plus.mapper;

import com.net.plus.model.MenuGroup;
import com.net.plus.model.MenuGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuGroupMapper {
    int countByExample(MenuGroupExample example);

    int deleteByExample(MenuGroupExample example);

    int deleteByPrimaryKey(String gmenuSeq);

    int insert(MenuGroup record);

    int insertSelective(MenuGroup record);

    List<MenuGroup> selectByExample(MenuGroupExample example);

    MenuGroup selectByPrimaryKey(String gmenuSeq);

    int updateByExampleSelective(@Param("record") MenuGroup record, @Param("example") MenuGroupExample example);

    int updateByExample(@Param("record") MenuGroup record, @Param("example") MenuGroupExample example);

    int updateByPrimaryKeySelective(MenuGroup record);

    int updateByPrimaryKey(MenuGroup record);
}