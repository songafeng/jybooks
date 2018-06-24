package com.fo.dao;

import com.fo.entity.booktype;
import com.fo.entity.version;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jdd on 2018/6/23.
 */
@Repository("VersionDao")
public interface VersionDao {

    public version findByType(Integer type);

}
