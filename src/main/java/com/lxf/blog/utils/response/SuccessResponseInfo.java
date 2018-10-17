package com.lxf.blog.utils.response;

/**
 * @ClassName: SuccessResponseInfo
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-17
 * @Version: 1.0
 */

public class SuccessResponseInfo extends ResponseInfo{
    private Object data;

    public SuccessResponseInfo(String result, Object data) {
        super(result);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
