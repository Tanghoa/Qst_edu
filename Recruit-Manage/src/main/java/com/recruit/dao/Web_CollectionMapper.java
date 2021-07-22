package com.recruit.dao;

import com.recruit.entity.Web_Collection;
import com.recruit.entity.Web_CollectionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface Web_CollectionMapper {
    int countByExample(Web_CollectionExample example);

    int deleteByExample(Web_CollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Web_Collection record);

    int insertSelective(Web_Collection record);

    List<Web_Collection> selectByExample(Web_CollectionExample example);

    Web_Collection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Web_Collection record, @Param("example") Web_CollectionExample example);

    int updateByExample(@Param("record") Web_Collection record, @Param("example") Web_CollectionExample example);

    int updateByPrimaryKeySelective(Web_Collection record);

    int updateByPrimaryKey(Web_Collection record);
}