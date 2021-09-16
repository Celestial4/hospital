package io.hs.surpport;

import java.util.UUID;

/**
 * @author clm
 * @Date 2021/9/3 10:03
 */
public class CommonFileNameFactory implements FileNameFactory{

    @Override
    public String getUFileName() {
        String uFileName = getUFileName(null, null);
        return uFileName;
    }

    @Override
    public String getUFileName(String prefix, String suffix) {
        String uFileName = uFileName();
        return prefix + uFileName + suffix;
    }

    @Override
    public String getUFileName(String suffix) {
        return uFileName() + suffix;
    }


    private String uFileName(){
        return UUID.randomUUID().toString();
    }
}