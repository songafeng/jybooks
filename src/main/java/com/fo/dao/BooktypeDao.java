package com.fo.dao;

import com.fo.entity.booktype;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */
@Repository("BooktypeDao")
public interface BooktypeDao {

    public booktype findById(Integer id);

    public List<booktype> find();
}
