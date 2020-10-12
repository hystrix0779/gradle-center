package com.nlx.center.service.test;

import com.nlx.center.vo.Test;

/**
 * @author Tony.niu (hystrix0779@yeah.net)
 * @version V1.0
 * @date 2020/10/12
 **/
public interface TestService {

    /**
     * 测试
     * @param str 字符串
     * @return String
     */
    Test test(String str);
}
