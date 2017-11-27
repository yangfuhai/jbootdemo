package io.jboot.demo.http;

import io.jboot.Jboot;
import io.jboot.utils.StringUtils;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.demo.aop
 */
@RequestMapping("/http")
public class HttpController extends JbootController {


    public static void main(String[] args) {
        Jboot.run(args);
    }


    public void index() {
        String url = getPara("url");
        if (StringUtils.isBlank(url)) {
            renderText("please set url value");
            return;
        }

        String html = Jboot.httpGet(url);
        renderHtml(html);

    }
}
