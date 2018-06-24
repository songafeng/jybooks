package com.fo.service;

import com.fo.entity.booktype;

import java.awt.print.Book;
import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */
public interface BooktypeService {

    public booktype findById(Integer id);

    public List<booktype> find();

}