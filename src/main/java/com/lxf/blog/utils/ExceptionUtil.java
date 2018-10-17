package com.lxf.blog.utils;

/**
 * @ClassName: ExceptionUtil
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-17
 * @Version: 1.0
 */

public class ExceptionUtil {
    public static String getCurrentInfo()
    {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        return "File : " + ste.getFileName() + "Method : " + ste.getMethodName() + " ; Line : " + ste.getLineNumber();
    }

    public static String getDeclaringClass()
    {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        return "DeclaringClass : " + ste.getClassName();
    }
}
