package io.hs.surpport;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @author clm
 * @Date 2021/9/3 10:14
 */
@Component
public class FileProcessUtil {
    @Autowired
    FilePathConfig config;
    @Autowired
    FileNameFactory fileNameFactory;

    public File getRealFile(String fileName) {
        File file = new File(config.getBaseUrl());
        if (!file.exists()) {
            file.mkdir();
        }
        String suffix = getSuffix(fileName);
        String realName = generateFileName(suffix);
        return new File(file, realName);
    }

    private String getSuffix(@NotNull String fileName) {
        return fileName.substring(fileName.indexOf("."));
    }

    private String generateFileName(String suffix){
        return fileNameFactory.getUFileName(suffix);
    }
}