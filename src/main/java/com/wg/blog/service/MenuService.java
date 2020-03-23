package com.wg.blog.service;

import com.wg.blog.mapper.MenuMapper;
import com.wg.blog.model.Menu;
import com.wg.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;
    public List<Menu> getMenusByUserId() {
        return menuMapper.getMenusByUserId(((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
