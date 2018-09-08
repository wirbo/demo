package com.jmx.microcloud.service.impl;
 
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.jmx.microcloud.dao.IDeptDao;
import com.jmx.microcloud.service.IDeptService;
import com.jmx.vo.Dept;
 
@Service
public class DeptServiceImpl extends SqlSessionDaoSupport implements IDeptService {
	
    @Resource  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {  
        super.setSqlSessionFactory(sqlSessionFactory);  
    } 
    @Autowired
    private IDeptDao ideptdao;
 
    @Override
    public Dept get(int id) {
	// TODO 自动生成的方法存根
	return ideptdao.findById(id);
    }
 
    @Override
    public boolean add(Dept dept) {
	// TODO 自动生成的方法存根
	return ideptdao.doCreate(dept);
    }
 
    @Override
    public List<Dept> list() {
	// TODO 自动生成的方法存根
	return ideptdao.findAll();
    }
}