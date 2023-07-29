package com.rui.controller;

import com.rui.MinIOConfig;
import com.rui.grace.result.GraceJSONResult;
import com.rui.utils.MinIOUtils;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/29 9:35
 * @Version 1.0
 */
@Slf4j
@Api(tags = "FileController 文件上传测试的接口")
@RestController
public class FileController {

    @Autowired
    private MinIOConfig minIOConfig;

    @PostMapping("upload")
    public GraceJSONResult upload(MultipartFile file) throws Exception {

        String fileName = file.getOriginalFilename();

        MinIOUtils.uploadFile(minIOConfig.getBucketName(),
                fileName,
                file.getInputStream());

        String imgUrl = minIOConfig.getFileHost()
                + "/"
                + minIOConfig.getBucketName()
                + "/"
                + fileName;

        return GraceJSONResult.ok(imgUrl);
    }
}
