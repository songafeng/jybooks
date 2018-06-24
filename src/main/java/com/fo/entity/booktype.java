package com.fo.entity;

import java.io.Serializable;

/**
 * Created by jdd on 2018/6/23.
 */
public class booktype implements Serializable {
    private Integer id;
    private String type;
    private Integer sort;
    private String remark;

    public booktype() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
