package com.fo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jdd on 2018/6/23.
 */
public class version implements Serializable {
    private Integer id;
    private Integer client_type;
    private Integer version;
    private Date create_time;
    private Integer status;

    public version() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClient_type() {
        return client_type;
    }

    public void setClient_type(Integer client_type) {
        this.client_type = client_type;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
