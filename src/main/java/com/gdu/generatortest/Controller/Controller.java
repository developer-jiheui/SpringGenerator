package com.gdu.generatortest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = {"/", "/main.do"}, method = RequestMethod.GET)
    public String welcome() {
        // 뷰리졸버 prefix : /WEB-INF/views/
        // 뷰리졸버 suffix : .jsp
        // 실제리턴        : /WEB-INF/views/index.jsp
        return "index";
    }
}
