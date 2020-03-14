package com.wg.blog.model;

public class ContentWithBLOBs extends Content {
    private String mdcontent;

    private String htmlcontent;

    public String getMdcontent() {
        return mdcontent;
    }

    public void setMdcontent(String mdcontent) {
        this.mdcontent = mdcontent;
    }

    public String getHtmlcontent() {
        return htmlcontent;
    }

    public void setHtmlcontent(String htmlcontent) {
        this.htmlcontent = htmlcontent;
    }
}