package com.krzyz.mymemories.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    String storeFile(MultipartFile file) throws IOException;

    String getFile(String fileName) throws IOException;
}
