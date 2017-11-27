package io.jboot.demo.rpc;

import java.io.Serializable;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.demo.rpc
 */
public class Article implements Serializable {

    private String id;

    public Article() {
    }

    public Article(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Article {" +
                "id='" + id + '\'' +
                '}';
    }
}
