package cn.mace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-13 11:35
 */
@Controller
@RequestMapping("/cesium")
public class PageController {

    @RequestMapping("/{index}")
    public String index(@PathVariable String index){
        return "page/"+index;
    }

}
