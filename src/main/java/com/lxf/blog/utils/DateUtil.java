package com.lxf.blog.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: DateUtil
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-17
 * @Version: 1.0
 */

public class DateUtil {
    private static Logger logger = LoggerFactory.getLogger(DateUtil.class);

    /**
     * 标准时间
     */
    private static SimpleDateFormat standerFmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 精确到小时的时间
     */
    private static SimpleDateFormat hourFmt = new SimpleDateFormat("yyyy-MM-dd HH");

    private static final long millsecsPerDay = 1000 * 60 * 60 * 24L;
    private static final long millsecsPerSec = 1000;

    /**
     * 获取现在标准的时间字符串表示，用于数据库中存储时间
     * @return 时间的字符串表示: yyyy-MM-dd HH:mm:ss
     */
    public static String getTimeNow() {
        return standerFmt.format(new Date());
    }

    /**
     * 获取指定日期的标准时间字符串表示，用于数据库中存储时间
     * @param date  指定的日期
     * @return 时间的字符串表示: yyyy-MM-dd HH:mm:ss
     */
    public static String getTime(Date date) {
        return standerFmt.format(date);
    }

    public static long getTimes() {
        return new Date().getTime()/1000;
    }


    /**
     * 获取精确到小时的时间的字符串表示
     * @param date  指定的日期
     * @return 时间的字符串表示: yyyy-MM-dd HH
     */
    public static String getTimeAtHour(Date date) {
        return hourFmt.format(date);
    }

    /**
     * 获取指定时间的小时表示
     * @param date  指定的日期
     * @return 时间的字符串表示: HH:00
     */
    public static String getHourOfTime(Date date) {
        SimpleDateFormat fmt = new SimpleDateFormat("HH:00");
        return fmt.format(date);
    }

    /**
     * 从标准时间的字符串解析出时间
     * @param standerFmtTime 标准时间的字符串表示
     * @return  日期
     * @throws ParseException 解析异常
     */
    public static Date fromString(String standerFmtTime) throws ParseException {
        return standerFmt.parse(standerFmtTime);
    }

    /**
     * 将时间转换为标准字符串
     */
    public static String intoString(Date date){
        if (date == null)return null;
        return standerFmt.format(date);
    }

    /**
     * 两个日期之间的天数间隔
     * @param fromDay   开始
     * @param toDay     结束
     * @return          相差天数
     */
    public static int countDay(Date fromDay, Date toDay) {
        if (null == toDay) {
            toDay = new Date();
        }
        return (int)(Math.abs(toDay.getTime() - fromDay.getTime()) / millsecsPerDay);
    }

    /**
     * 两个日期之间的秒间隔
     * @param fromDay   开始
     * @param toDay     结束
     * @return  相差秒数
     */
    public static long countSec(Date fromDay, Date toDay) {
        if (null == toDay) {
            toDay = new Date();
        }
        return Math.abs(toDay.getTime() - fromDay.getTime()) / millsecsPerSec;
    }

    /**
     * 获取指定日期的一周内的星期数，无论时区中的设置第一天是周一还是周日，
     * 最后的输出都是周日，一，二，三，四，五，六分别对应0,1,2,3,4,5,6
     * 区别于DAY_OF_WEEK(返回一周中的第几天，并非是下标)
     *
     * @param date 指定日期
     * @return 星期几
     */
    public static int getDayIndexOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        boolean isFirstSunday = (calendar.getFirstDayOfWeek() == Calendar.SUNDAY);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (isFirstSunday) {
            /* 如果第一天是周日，则直接减一即可 */
            dayOfWeek -= 1;
        } else {
            /* 如果第一天是周一，则将周日调为0即可 */
            if (dayOfWeek == 7){
                dayOfWeek = 0;
            }
        }

        return dayOfWeek;
    }


    /**
     * 日期格式字符串转换成时间戳
     * @param date 字符串日期
     * @param format 如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String date2TimeStamp(String date_str){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return String.valueOf(sdf.parse(date_str).getTime()/1000);
        } catch (Exception e) {
//             e.printStackTrace();
            logger.info(ExceptionUtil.getCurrentInfo() , e);

        }
        return "";
    }
    /**
     * 日期格式字符串转换成时间戳
     * @param date 字符串日期
     * @param format 如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String date2TimeHMS(String date_str){
        try {
            return String.valueOf(standerFmt.parse(date_str).getTime()/1000);
        } catch (Exception e) {
//             e.printStackTrace();
            logger.info(ExceptionUtil.getCurrentInfo() , e);

        }
        return "";
    }

    /**
     * 将秒数转换为日时分秒，
     * @param second
     * @return
     */
    public static String secondToTime(long second){
        long temp=0;
        if ((second/1000)==0){
            temp=second;
        }
        second=second/1000;
        long year= second / 31536000;
        second = second % 31536000;
        long month = second / 2592000;
        second = second % 2592000;
        long days = second / 86400;
        second = second % 86400;
        long hours = second / 3600;
        second = second % 3600;
        long minutes = second /60;
        second = second % 60;
        if (year>0){
            return  year + "年" + month + "月" + days + "天" + hours + "小时" + minutes + "分" + second + "秒";
        }else if (month>0){
            return  month + "月" + days + "天" + hours + "小时" + minutes + "分" + second + "秒";
        }else if(days>0){
            return days + "天" + hours + "小时" + minutes + "分" + second + "秒";
        }else if (hours>0){
            return hours + "小时" + minutes + "分" + second + "秒";
        }else if (minutes>0){
            return  minutes + "分" + second + "秒";
        }else if (second>0){
            return  second + "秒";
        }else{
            return  temp + "毫秒";
        }
    }
    public static String msecondToTime(Integer temp){
        long second=0;
        second=Long.valueOf(String.valueOf(temp));
        long year= second / 31536000;
        second = second % 31536000;
        long month = second / 2592000;
        second = second % 2592000;
        long days = second / 86400;
        second = second % 86400;
        long hours = second / 3600;
        second = second % 3600;
        long minutes = second /60;
        second = second % 60;
        if (year>0){
            return  year + "年" + month + "月" + days + "天" + hours + "小时" + minutes + "分" + second + "秒";
        }else if (month>0){
            return  month + "月" + days + "天" + hours + "小时" + minutes + "分" + second + "秒";
        }else if(days>0){
            return days + "天" + hours + "小时" + minutes + "分" + second + "秒";
        }else if (hours>0){
            return hours + "小时" + minutes + "分" + second + "秒";
        }else if (minutes>0){
            return  minutes + "分" + second + "秒";
        }else if (second>0){
            return  second + "秒";
        }else{
            return  0 + "秒";
        }
    }

    //当前时间的前一个星期 开始时间
    public static long  getAboveWeekTime(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, -6);
        long timeInMillis = c.getTimeInMillis();
        return timeInMillis;
    }
    //当天日期前一个月
    public static long  getAboveMouthTime(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);    //得到前一个月
        long timeInMillis = c.getTimeInMillis();
        return timeInMillis;
    }
    //当前时间的前一年开始
    public static long  getAboveYearTime(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, -1);    //得到前一年
        long timeInMillis = c.getTimeInMillis();
        return timeInMillis;
    }
}
