package com.jikaigg.mapper;

import com.jikaigg.domain.PhotocPng;
import com.jikaigg.domain.PhotocPngExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PhotocPngMapper {
    long countByExample(PhotocPngExample example);

    int deleteByExample(PhotocPngExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhotocPng row);

    int insertSelective(PhotocPng row);

    List<PhotocPng> selectByExample(PhotocPngExample example);

    PhotocPng selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") PhotocPng row, @Param("example") PhotocPngExample example);

    int updateByExample(@Param("row") PhotocPng row, @Param("example") PhotocPngExample example);

    int updateByPrimaryKeySelective(PhotocPng row);

    int updateByPrimaryKey(PhotocPng row);
}