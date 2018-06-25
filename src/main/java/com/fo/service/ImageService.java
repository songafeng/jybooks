package com.fo.service;

import com.fo.entity.book;
import com.fo.entity.image;

import java.util.List;

/**
 * Created by jdd on 2018/6/25.
 */
public interface ImageService {

    public image findSingleByPlace(String place);

    public List<image> findByPlace(String place);

}
