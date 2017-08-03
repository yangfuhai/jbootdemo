package io.jboot.demo;

import java.util.Arrays;

/**
 * Created by michael on 2017/6/13.
 */
public class Test {

    public static void main(String[] args) {
        String[] aaa = "aa.bb.cc".split("\\.");
        System.out.println(Arrays.toString(aaa));
    }
}
