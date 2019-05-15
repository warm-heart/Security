package com.security.example.utils;

import java.util.UUID;

/**
 * @author wangqianlong
 * @create 2019-05-05 18:03
 */

public class UUIDUtils {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(uuid);

    }
}
