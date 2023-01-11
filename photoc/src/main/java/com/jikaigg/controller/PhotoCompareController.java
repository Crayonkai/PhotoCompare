package com.jikaigg.controller;

import com.jikaigg.domain.PhotoResult;
import com.jikaigg.service.PhotoCompareService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PhotoCompareController {
    @Autowired
    private PhotoCompareService photoCompareService;

    @PostMapping("/print")
    public PhotoResult printPhotoInf(@RequestParam("photoPath") String photoPath) {
        log.info("即将搜索并处理{}文件夹(包含子文件夹)中的图片数据", photoPath);
        String message = photoCompareService.savePhotoBefore(photoPath);
        return new PhotoResult().success(message);
    }


    @PostMapping("/queryOne")
    public PhotoResult queryOnePhoto(@RequestParam("pid") String pid) {
        log.info("获取pid为 {} 的图片", pid);
        String message = photoCompareService.getByPId(pid);
        return new PhotoResult().success(message);
    }


}
