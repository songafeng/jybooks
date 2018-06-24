package com.fo.controller;

import com.fo.entity.booktype;
import com.fo.entity.version;
import com.fo.service.BookService;
import com.fo.service.VersionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jdd on 2018/6/24.
 */
@Controller
@RequestMapping("/version")
public class VersionController {

    @Resource(name = "VersionService")
    private VersionService versionService;

    @RequestMapping("/new")
    @ResponseBody
    public version newversion(Integer type)
    {
        version model=versionService.findByType(type);

        return model;
    }

}
