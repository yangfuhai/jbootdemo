# jboot

jboot is a similar springboot project base on jfinal and undertow,we have using in product environment.


jboot : https://github.com/yangfuhai/jboot


步骤：
* 1、使用resources下的jbootdemo.sql建立数据库和建表.
* 2、运行Starter的main方法

或者
* 1、或者使用maven编译：mvn package appassembler:assemble
* 2、进入到target/app/bin目录下，执行 ./jboot

部署：
直接拷贝 target/app目录到服务器，然后执行 ./boot