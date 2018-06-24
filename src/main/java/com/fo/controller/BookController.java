package com.fo.controller;

import com.fo.entity.book;
import com.fo.service.BookService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */

@Controller
@RequestMapping("/book")
public class BookController {

    private Logger logger = Logger.getLogger(BookController.class);

    @Resource(name = "BookService")
    private BookService bookService;

    @RequestMapping("/book")
    public String book()
    {
        return "book";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<book> list(Integer type)
    {
        logger.info("进入book/list方法");

        List<book> list=bookService.findByType(type);

        return list;
    }

}
