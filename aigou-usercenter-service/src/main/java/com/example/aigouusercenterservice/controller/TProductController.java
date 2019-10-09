package com.example.aigouusercenterservice.controller;


import com.example.aigouusercenterservice.entity.TProduct;
import com.example.aigouusercenterservice.service.ITProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品 前端控制器
 * </p>
 *
 * @author clj
 * @since 2019-10-03
 */
@Api(tags = "商品")
//@RestController
@Controller
@RequestMapping("/mdns.service/t-product")
public class TProductController {
    @Autowired
    private ITProductService iTProductService;
    @ApiOperation(value="查询所有商品", notes="查询所有商品")
    @RequestMapping(value={""}, method= RequestMethod.GET)
    @ResponseBody
    public List<TProduct> getAll() {
        List<TProduct> list = iTProductService.list();
        return list;
    }
    @ApiOperation(value="test所有商品", notes="test所有商品")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody

    public String test() {
        return "hh";
    }
    @ApiOperation(value="test所有商品", notes="test所有商品")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index()
    {
        System.out.println("测试首页面");
        return "index";
    }
}
