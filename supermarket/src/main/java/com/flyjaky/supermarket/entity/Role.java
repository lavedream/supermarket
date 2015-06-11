package com.flyjaky.supermarket.entity;

import java.util.Date;

public class Role {
    private Long rid;

    private String rorleName;

    private Date createdAt;

    private Date updatedAt;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRorleName() {
        return rorleName;
    }

    public void setRorleName(String rorleName) {
        this.rorleName = rorleName == null ? null : rorleName.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}