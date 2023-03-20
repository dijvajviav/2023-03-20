package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 이건 컴퓨터도 이해하는 주석임 즉 스프링부트한테 알려주는 거야 이게 컨트롤러라고
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index(){
          return "안녕하세요.";  //return "index"; // src/main/resources/templates/index/html 을 실행하겠다는 소리야!!!!! @Re~~이거없으면!!
    }
}
