package com.fo.dao;

import com.fo.entity.book;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */
@Repository("BookDao")
public interface BookDao {

    public book findById(Integer id);

    public List<book> findByType(Integer type);
}
