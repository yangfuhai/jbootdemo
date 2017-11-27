package io.jboot.demo.rpc;

import java.util.Random;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.demo.rpc.motan
 */
public class ArticleServiceImpl implements ArticleService {

    @Override
    public Article findArticleById(String id) {
        return new Article(id + ":" + new Random().nextInt());
    }

    @Override
    public boolean saveArticle(Article article) {
        System.out.println("saveArticle invoked , article : " + article);
        return true;
    }
}
