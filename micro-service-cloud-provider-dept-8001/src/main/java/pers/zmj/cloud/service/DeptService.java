package pers.zmj.cloud.service;

import pers.zmj.cloud.entity.Dept;

import java.util.List;

public interface DeptService {
    Dept get(Integer deptNo);
    List<Dept> selectAll();
}