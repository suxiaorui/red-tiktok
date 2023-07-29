package com.rui;

import com.rui.utils.MinIOUtils;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/7/29 9:31
 * @Version 1.0
 */
@Configuration
@Data
public class MinIOConfig {

    @Value("${minio.endpoint}")
    private String endpoint;
    @Value("${minio.fileHost}")
    private String fileHost;
    @Value("${minio.bucketName}")
    private String bucketName;
    @Value("${minio.accessKey}")
    private String accessKey;
    @Value("${minio.secretKey}")
    private String secretKey;

    @Value("${minio.imgSize}")
    private Integer imgSize;
    @Value("${minio.fileSize}")
    private Integer fileSize;

    @Bean
    public MinIOUtils creatMinioClient() {
        return new MinIOUtils(endpoint, bucketName, accessKey, secretKey, imgSize, fileSize);
    }
}

