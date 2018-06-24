package com.fo.service.impl;

import com.fo.dao.BookDao;
import com.fo.entity.book;
import com.fo.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */
@Service("BookService")
public class BookServiceImpl implements BookService {

    @Resource(name = "BookDao")
    private BookDao bookDao;

    public book findById(Integer id) {

        return bookDao.findById(id);

    }

    public List<book> findByType(Integer type) {
        return bookDao.findByType(type);
    }
}
