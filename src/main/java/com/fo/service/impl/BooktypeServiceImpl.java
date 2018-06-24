package com.fo.service.impl;

import com.fo.dao.BookDao;
import com.fo.dao.BooktypeDao;
import com.fo.entity.booktype;
import com.fo.service.BookService;
import com.fo.service.BooktypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.print.Book;
import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */
@Service("BooktypeService")
public class BooktypeServiceImpl implements BooktypeService {

    @Resource(name = "BooktypeDao")
    private BooktypeDao booktypeDao;


    public booktype findById(Integer id){return booktypeDao.findById(id);};

    public List<booktype> find(){return booktypeDao.find();};
}
