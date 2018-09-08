package com.jmx.microcloud.service;
 
import java.util.List;
import com.jmx.vo.Dept;


public interface IDeptService {
    public Dept get(int id);
    public boolean add(Dept dept);
    public List<Dept>list();
 
}