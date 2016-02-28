package com.net.plus.mapper;

import com.net.plus.model.MetaImage;
import com.net.plus.model.MetaImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetaImageMapper {
    int countByExample(MetaImageExample example);

    int deleteByExample(MetaImageExample example);

    int deleteByPrimaryKey(String imgId);

    int insert(MetaImage record);

    int insertSelective(MetaImage record);

    List<MetaImage> selectByExampleWithBLOBs(MetaImageExample example);

    List<MetaImage> selectByExample(MetaImageExample example);

    MetaImage selectByPrimaryKey(String imgId);

    int updateByExampleSelective(@Param("record") MetaImage record, @Param("example") MetaImageExample example);

    int updateByExampleWithBLOBs(@Param("record") MetaImage record, @Param("example") MetaImageExample example);

    int updateByExample(@Param("record") MetaImage record, @Param("example") MetaImageExample example);

    int updateByPrimaryKeySelective(MetaImage record);

    int updateByPrimaryKeyWithBLOBs(MetaImage record);

    int updateByPrimaryKey(MetaImage record);
}