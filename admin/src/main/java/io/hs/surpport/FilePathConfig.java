package io.hs.surpport;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author clm
 * @Date 2021/9/3 10:21
 */
public class FilePathConfig {

    @Value("${my.baseurl}")
    private String baseUrl;

    public FilePathConfig() {
    }

    public FilePathConfig(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}