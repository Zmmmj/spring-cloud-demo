package pers.zmj.cloud.service.impl;

import org.springframework.stereotype.Service;
import pers.zmj.cloud.service.DeptHystrixService;

/**
 * Hystrix 服务降级
 * 解耦回退逻辑
 */
@Service
public class DeptHystrixFallBackServiceImpl implements DeptHystrixService {
    @Override
    public String deptInfo_Ok(Integer id) {
        return "--------------------系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }

    @Override
    public String deptInfo_Timeout(Integer id) {
        return "--------------------系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }
}
