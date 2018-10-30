package com.lxf.blog.model;

/**
 * @ClassName: LabelType
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-30
 * @Version: 1.0
 */

public enum LabelType {

    //
    STUDY("1","学习"),

    //
    LIFE("2","生活"),

    //
    SHARE("3","分享"),

    //
    BANK("4","题库");

    private String num;
    private String msg;

    LabelType(String num, String msg) {
        this.msg = msg;
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
