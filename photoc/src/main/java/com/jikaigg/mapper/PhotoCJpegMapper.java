package com.jikaigg.mapper;

import com.jikaigg.domain.PhotoCJpegDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PhotoCJpegMapper {
    Integer insert(PhotoCJpegDto photo);
}
