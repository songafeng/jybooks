package com.fo.dao;

import com.fo.entity.image;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jdd on 2018/6/25.
 */
@Repository("ImageDao")
public interface ImageDao {

    public image findSingleByPlace(String place);

    public List<image> findByPlace(String place);

}
