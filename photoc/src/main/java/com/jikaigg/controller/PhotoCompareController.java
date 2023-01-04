package com.jikaigg.controller;

import com.jikaigg.domain.PhotoResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PhotoCompareController {

    @PostMapping("/print")
    public PhotoResult printPhotoInf(@RequestParam("photoPath") String photoPath){
        log.info("即将搜索并处理{}文件夹(包含子文件夹)中的图片数据",photoPath);
        return new PhotoResult().success(null);
    }
}
