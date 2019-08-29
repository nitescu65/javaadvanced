package com.sda.marius.advanced;

import org.apache.commons.lang3.StringUtils;

public class MavenMain {
    public static void main(String[] args) {
        String name ="  ";
        System.out.println(name.isEmpty());
        boolean isBlank;
        if (StringUtils.isBlank(name)) isBlank = true;
        else isBlank = false;
        System.out.println(isBlank);
    }
}
