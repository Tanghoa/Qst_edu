package com.recruit.dao;

import com.recruit.entity.Staion;
import com.recruit.entity.StaionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface StaionMapper {
    int countByExample(StaionExample example);

    int deleteByExample(StaionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Staion record);

    int insertSelective(Staion record);

    List<Staion> selectByExampleWithBLOBs(StaionExample example);

    List<Staion> selectByExample(StaionExample example);

    Staion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Staion record, @Param("example") StaionExample example);

    int updateByExampleWithBLOBs(@Param("record") Staion record, @Param("example") StaionExample example);

    int updateByExample(@Param("record") Staion record, @Param("example") StaionExample example);

    int updateByPrimaryKeySelective(Staion record);

    int updateByPrimaryKeyWithBLOBs(Staion record);

    int updateByPrimaryKey(Staion record);
}