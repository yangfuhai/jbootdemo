/**
 * Copyright (c) 2015-2017, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.demo.rpc.motan.redirect;

import io.jboot.Jboot;
import io.jboot.core.rpc.annotation.JbootrpcService;
import io.jboot.demo.rpc.Article;
import io.jboot.demo.rpc.ArticleService;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;


@RequestMapping("/motanRedirectRpc")
public class MotanRedirectRpcController extends JbootController {


    /**
     * 请先启动 MotanRedirectRpcService 后，再启动
     *
     * @param args
     */
    public static void main(String[] args) {


        //RPC配置
        Jboot.setBootArg("jboot.rpc.type", "motan");
        Jboot.setBootArg("jboot.rpc.callMode", "redirect");//直连模式，默认为注册中心
        Jboot.setBootArg("jboot.rpc.directUrl", "localhost:8002");//直连模式的url地址

        Jboot.run(args);
    }


    @JbootrpcService
    ArticleService service;

    public void index() {
        Article article = service.findArticleById("id");
        renderText(article.toString());
    }

}
