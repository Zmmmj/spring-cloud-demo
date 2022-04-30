package pers.zmj.cloud.service.impl;

import org.springframework.stereotype.Service;
import pers.zmj.cloud.entity.Dept;
import pers.zmj.cloud.mapper.DeptMapper;
import pers.zmj.cloud.service.DeptService;

import javax.annotation.Resource;
import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Resource(name = "deptMapper")
    private DeptMapper deptMapper;
    @Override
    public Dept get(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }
    @Override
    public List<Dept> selectAll() {
        return deptMapper.GetAll();
    }
}
