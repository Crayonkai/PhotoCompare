package com.jikaigg.mapper;

import com.jikaigg.domain.PhotocJpeg;
import com.jikaigg.domain.PhotocJpegExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PhotocJpegMapper {
    long countByExample(PhotocJpegExample example);

    int deleteByExample(PhotocJpegExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhotocJpeg row);

    int insertSelective(PhotocJpeg row);

    List<PhotocJpeg> selectByExample(PhotocJpegExample example);

    PhotocJpeg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") PhotocJpeg row, @Param("example") PhotocJpegExample example);

    int updateByExample(@Param("row") PhotocJpeg row, @Param("example") PhotocJpegExample example);

    int updateByPrimaryKeySelective(PhotocJpeg row);

    int updateByPrimaryKey(PhotocJpeg row);

    Map<String,Object> selectByPId(String pid);
}