package com.nlx.center.service.test.impl;

import com.nlx.center.service.test.TestService;
import com.nlx.center.vo.Test;
import org.springframework.stereotype.Service;

/**
 * @author Tony.niu (hystrix0779@yeah.net)
 * @version V1.0
 * @date 2020/10/12
 **/
@Service
public class TestServiceImpl implements TestService {


    @Override
    public Test test(String str) {
        Test test=new Test();
        test.setName(str);
        return test;
    }
}
