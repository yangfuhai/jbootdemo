package io.jboot.demo.rpc;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.demo.rpc.motan
 */
public interface ArticleService {

    public Article findArticleById(String id);

    public boolean saveArticle(Article article);
}
