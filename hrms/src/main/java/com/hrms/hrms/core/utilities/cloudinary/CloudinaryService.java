package com.hrms.hrms.core.utilities.cloudinary;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.hrms.hrms.core.utilities.results.DataResult;

public interface CloudinaryService {

	DataResult<Map> upload(MultipartFile file) throws IOException;
}
