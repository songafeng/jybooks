package com.fo.service;

import com.fo.entity.booktype;
import com.fo.entity.version;

import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */
public interface VersionService {

    public version findByType(Integer type);


}