package com.example.demo2.util;

import java.util.UUID;

/**
 * 生成文件名
 * @author zzl
 * @date 2019/4/13
 */
public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
