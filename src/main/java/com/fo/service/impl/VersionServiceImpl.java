package com.fo.service.impl;

import com.fo.dao.BooktypeDao;
import com.fo.dao.VersionDao;
import com.fo.entity.booktype;
import com.fo.entity.version;
import com.fo.service.BooktypeService;
import com.fo.service.VersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */
@Service("VersionService")
public class VersionServiceImpl implements VersionService {

    @Resource(name = "VersionDao")
    private VersionDao versionDao;

    public version findByType(Integer type){return versionDao.findByType(type);};

}
