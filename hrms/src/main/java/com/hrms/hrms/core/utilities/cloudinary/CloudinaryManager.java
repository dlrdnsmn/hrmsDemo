package com.hrms.hrms.core.utilities.cloudinary;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.ErrorDataResult;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryManager implements CloudinaryService {

    private final Cloudinary cloudinary;

    @Autowired
    public CloudinaryManager() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CloudinaryUserConfig.class);
        this.cloudinary = (Cloudinary) context.getBean("getCloudinaryUser");
    }

    
    public DataResult<Map> upload(MultipartFile file) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
        return new SuccessDataResult<Map>(uploadResult);
    }
}