package com.nlx.center.web.controller.test;

import com.common.base.model.vo.ResponseVo;
import com.nlx.center.service.test.TestService;
import com.nlx.center.vo.Test;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Tony.niu (hystrix0779@yeah.net)
 * @version V1.0
 * @date 2020/10/10
 **/
@Api(value = "API - TestController", tags = "测试")
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    TestService testService;

    @ApiOperation("获取共享仪器")
    @GetMapping("/test")
    public ResponseVo<Test> test(@RequestParam String str){
        return ResponseVo.success(testService.test(str));
    }
}
