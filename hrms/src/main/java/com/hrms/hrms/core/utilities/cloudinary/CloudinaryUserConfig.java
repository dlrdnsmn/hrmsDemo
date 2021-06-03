package com.hrms.hrms.core.utilities.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;

public class CloudinaryUserConfig {
    @Bean(name = {"getCloudinaryUser", "Cloudinary"})
    public Cloudinary getCloudinaryUser(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dsdbhbftk",
                "api_key", "859349378973498",
                "api_secret", "PWchSE9txMwnIWOzg5nKTmLEsMU"));
    }
}