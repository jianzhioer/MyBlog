package com.lxf.blog.model;

/**
 * @ClassName: CommentInfo
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-25
 * @Version: 1.0
 */

public class CommentInfo {

    private String commentTime;
    private String commentID;
    private String content;
    private String mailAddress;
    private String ip;
    private String comName;

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentID() {
        return commentID;
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }
}
