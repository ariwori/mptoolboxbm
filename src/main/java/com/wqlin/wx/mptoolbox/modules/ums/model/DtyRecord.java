package com.wqlin.wx.mptoolbox.modules.ums.model;

import java.util.Date;

public class DtyRecord {
    private String rid;

    private String uid;

    private String dingche;

    private String dingcan;

    private Date createtime;

    private Date yudingdate;

    private String timecode;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDingche() {
        return dingche;
    }

    public void setDingche(String dingche) {
        this.dingche = dingche;
    }

    public String getDingcan() {
        return dingcan;
    }

    public void setDingcan(String dingcan) {
        this.dingcan = dingcan;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void  setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getYudingdate() {
        return yudingdate;
    }

    public void setYudingdate(Date yudingdate) {
        this.yudingdate = yudingdate;
    }

    public String getTimecode() {
        return timecode;
    }

    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }
}