package io.hs.surpport;

/**
 * @author clm
 * @Date 2021/9/3 10:02
 */
public interface FileNameFactory {
    String getUFileName();

    String getUFileName(String prefix, String suffix);

    String getUFileName(String suffix);
}