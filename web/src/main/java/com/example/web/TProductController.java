package com.example.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * <p>
 * 商品 前端控制器
 * </p>
 *
 * @author clj
 * @since 2019-10-03
 */
@Controller
@RequestMapping("/t-product")
public class TProductController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() throws IOException {
        Resource resource = new ClassPathResource("");
        System.out.println(resource.getFile().getAbsolutePath());
        System.out.println("测试首页面");
        return "list";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() throws IOException {
        try {
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "2";
        }finally {
            return "3";
        }
    }
}
