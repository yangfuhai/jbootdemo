package io.jboot.demo.model;

import io.jboot.codegen.model.JbootModelGenerator;

/**
 * Created by michael on 2017/6/13.
 */
public class ModelGen {

    public static void main(String[] args){

        String modelPackage = "io.jboot.demo";

        String dbHost = "127.0.0.1";
        String dbName = "jbootdemo";
        String dbUser = "root";
        String dbPassword = "";

        JbootModelGenerator.run(modelPackage, dbHost, dbName, dbUser, dbPassword);
    }
}
