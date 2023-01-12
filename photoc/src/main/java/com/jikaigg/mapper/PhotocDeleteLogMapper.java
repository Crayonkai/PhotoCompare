package com.jikaigg.mapper;

import com.jikaigg.domain.PhotocDeleteLog;
import com.jikaigg.domain.PhotocDeleteLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PhotocDeleteLogMapper {
    long countByExample(PhotocDeleteLogExample example);

    int deleteByExample(PhotocDeleteLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhotocDeleteLog row);

    int insertSelective(PhotocDeleteLog row);

    List<PhotocDeleteLog> selectByExample(PhotocDeleteLogExample example);

    PhotocDeleteLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") PhotocDeleteLog row, @Param("example") PhotocDeleteLogExample example);

    int updateByExample(@Param("row") PhotocDeleteLog row, @Param("example") PhotocDeleteLogExample example);

    int updateByPrimaryKeySelective(PhotocDeleteLog row);

    int updateByPrimaryKey(PhotocDeleteLog row);

    PhotocDeleteLog selectByMd5(String photomd5);
}