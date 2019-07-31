package com.xiao.Controller;/**
 * Created by 小飞 on 2019/7/31.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 小飞
 * @Auther: 小飞
 * @Date: 2019/7/31 22:17
 * @Description:
 */

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
