package com.codeman.controller;

import com.codeman.entity.User;
import com.codeman.service.UserService;
import com.codeman.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
@Api(value = "测试swagger")
@RequestMapping("/test")
public class TestController {
    /*@RequestMapping("/boot/boo")
    public @ResponseBody
    String bootjosn(){
        String res="ssdjfdsljf";
        return res;
    }*/
    @Resource
    private UserService userService;

    @ApiOperation(value = "返回byId",notes = "备注") //swagger显示访问路径“/test/boot/boo”与 @ApiOperation内容，其中@Api没有显示
    @RequestMapping("/boot/boo")
    @ResponseBody
    public User testSelect() {
        System.out.println(("----- selectAll method test ------"));
        User byId = userService.getById(1);
        System.out.println(byId);
        return byId;
    }
    @ApiOperation(value = "测试2",notes = "备注2")
    @RequestMapping("/boot2/boo2")
    @ResponseBody
    public User testSelect2() {
        System.out.println(("----- selectAll method test ------"));
        User byId = userService.getById(1);
        System.out.println(byId);
        return byId;
    }
}
