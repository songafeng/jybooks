package com.fo.service;

import com.fo.entity.book;

import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */
public interface BookService{

    public book findById(Integer id);

    public List<book> findByType(Integer type);

}