package com.wg.blog.controller;

import com.wg.blog.model.Menu;
import com.wg.blog.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/config")
@Api(tags = "系统配置相关接口")
public class SystemConfigController {
    @Autowired
    private MenuService menuService;

    @ApiOperation("根据用户id获取菜单项的接口")
    @GetMapping("/menu")
    public List<Menu> getMenusByUserId(){
        return menuService.getMenusByUserId();
    }
}
