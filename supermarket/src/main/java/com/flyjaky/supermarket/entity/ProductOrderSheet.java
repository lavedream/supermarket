package com.flyjaky.supermarket.entity;

import java.util.Date;

public class ProductOrderSheet {
    private Long osid;

    private Date created_at;

    private Date updated_at;

    private Long oid;

    private Long pid;

    public Long getOsid() {
        return osid;
    }

    public void setOsid(Long osid) {
        this.osid = osid;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}