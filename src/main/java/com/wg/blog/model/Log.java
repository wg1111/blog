package com.wg.blog.model;

import java.util.Date;

public class Log {
    private Long id;

    private String ip;

    private Date createtime;

    private String remark;

    private String operateurl;

    private String operateby;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperateurl() {
        return operateurl;
    }

    public void setOperateurl(String operateurl) {
        this.operateurl = operateurl;
    }

    public String getOperateby() {
        return operateby;
    }

    public void setOperateby(String operateby) {
        this.operateby = operateby;
    }
}