package com.wg.blog.controller;

import com.wg.blog.model.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@Api(tags = "登录相关接口")
public class LoginController {
    @ApiOperation("登录接口")
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录！");
    }
}
