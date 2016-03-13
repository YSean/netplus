package com.net.plus.mapper;

import com.net.plus.model.Menus;
import com.net.plus.model.MenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenusMapper {
    int countByExample(MenusExample example);

    int deleteByExample(MenusExample example);

    int deleteByPrimaryKey(String menuSeq);

    int insert(Menus record);

    int insertSelective(Menus record);

    List<Menus> selectByExample(MenusExample example);

    Menus selectByPrimaryKey(String menuSeq);

    int updateByExampleSelective(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByExample(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKey(Menus record);
}