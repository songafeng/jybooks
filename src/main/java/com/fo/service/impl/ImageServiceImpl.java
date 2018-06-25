package com.fo.service.impl;

import com.fo.dao.ImageDao;
import com.fo.dao.VersionDao;
import com.fo.entity.image;
import com.fo.service.ImageService;
import com.fo.service.VersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jdd on 2018/6/25.
 */
@Service("ImageService")
public class ImageServiceImpl implements ImageService {

    @Resource(name = "ImageDao")
    private ImageDao imageDao;

    @Override
    public image findSingleByPlace(String place) {
        return imageDao.findSingleByPlace(place);
    }

    @Override
    public List<image> findByPlace(String place) {
        return imageDao.findByPlace(place);
    }

}
