package com.recruit.dao;

import com.recruit.entity.S_resume;
import com.recruit.entity.S_resumeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface S_resumeMapper {
    int countByExample(S_resumeExample example);

    int deleteByExample(S_resumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S_resume record);

    int insertSelective(S_resume record);

    List<S_resume> selectByExample(S_resumeExample example);

    S_resume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S_resume record, @Param("example") S_resumeExample example);

    int updateByExample(@Param("record") S_resume record, @Param("example") S_resumeExample example);

    int updateByPrimaryKeySelective(S_resume record);

    int updateByPrimaryKey(S_resume record);
}