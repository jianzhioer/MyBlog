package com.lxf.blog.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ResponseInfo
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-17
 * @Version: 1.0
 */

public class ResponseInfo {
    public static final String SUCCESS = "Success";
    public static final String FAILED = "Failed";
    private String result;

    public ResponseInfo(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    /*操作成功的返回值封装*/
    public static ResponseInfo createSuccessResponse(Object data) {
        return new SuccessResponseInfo(SUCCESS, data);
    }

    public static ResponseInfo createFailedResponse(String errorMsg, String errorDetail) {
        return new FailedResponseInfo(FAILED, errorMsg, errorDetail);
    }

    public static ResponseInfo createFailedResponse(String errorMsg) {
        return createFailedResponse(errorMsg, null);
    }

    public static ResponseInfo createWarningResponse(String errorMsg, String errorDetail) {
        return new FailedResponseInfo(FAILED, errorMsg, errorDetail, true);
    }

    public static ResponseInfo createWarningResponse(String errorMsg) {
        return createWarningResponse(errorMsg, null);
    }

    public static ResponseInfo createQueryListResponse(Object rows,Integer totalRows,String pageSize,String pageNum) {
        Map<String,Object> resultMap = new HashMap<>();

        resultMap.put("rows",rows);
        resultMap.put("totalRows",totalRows);
        resultMap.put("pageSize",pageSize);
        resultMap.put("pageNum",pageNum);
        return new SuccessResponseInfo(SUCCESS, resultMap);

    }

}
