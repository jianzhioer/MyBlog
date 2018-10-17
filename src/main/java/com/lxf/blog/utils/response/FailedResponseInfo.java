package com.lxf.blog.utils.response;

/**
 * @ClassName: FailedResponseInfo
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-17
 * @Version: 1.0
 */

public class FailedResponseInfo extends ResponseInfo {
    private String errorMsg;
    private String errorDetail;
    private Boolean isWarning = false;

    public FailedResponseInfo(String result, String errorMsg, String errorDetail) {

        super(result);
        this.errorMsg = errorMsg;
        this.errorDetail = errorDetail;
    }

    public FailedResponseInfo(String result, String errorMsg, String errorDetail, Boolean isWarning) {

        super(result);
        this.errorMsg = errorMsg;
        this.errorDetail = errorDetail;
        this.isWarning = true;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public Boolean getWarning() {
        return isWarning;
    }

    public void setWarning(Boolean warning) {
        isWarning = warning;
    }
}
