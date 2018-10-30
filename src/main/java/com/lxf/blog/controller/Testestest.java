package com.lxf.blog.controller;

import com.lxf.blog.service.TestService;
import com.lxf.blog.utils.response.ResponseInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * @ClassName: Testestest
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-22
 * @Version: 1.0
 */
@Controller
@RequestMapping("/test")
public class Testestest {
    /*@Resource
    private ArticleDao articleDao;*/

    @Resource
    private TestService testService;

    @RequestMapping(value="/adsInstanceList",method= RequestMethod.GET)
    @ResponseBody
    public ResponseInfo getAdsInstanceList(){


        try{
           // boolean articleEntity = testService.update("1234");
            return ResponseInfo.createSuccessResponse(testService.testQueryList("2"));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseInfo.createFailedResponse("失败");
        }
    }
}
