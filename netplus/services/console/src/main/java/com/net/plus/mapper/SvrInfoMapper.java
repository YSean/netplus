package com.net.plus.mapper;

import com.net.plus.model.SvrInfo;
import com.net.plus.model.SvrInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SvrInfoMapper {
    int countByExample(SvrInfoExample example);

    int deleteByExample(SvrInfoExample example);

    int deleteByPrimaryKey(String svrSeq);

    int insert(SvrInfo record);

    int insertSelective(SvrInfo record);

    List<SvrInfo> selectByExample(SvrInfoExample example);

    SvrInfo selectByPrimaryKey(String svrSeq);

    int updateByExampleSelective(@Param("record") SvrInfo record, @Param("example") SvrInfoExample example);

    int updateByExample(@Param("record") SvrInfo record, @Param("example") SvrInfoExample example);

    int updateByPrimaryKeySelective(SvrInfo record);

    int updateByPrimaryKey(SvrInfo record);
}