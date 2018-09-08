package com.jmx.microcloud.dao;
 
import java.util.List;
 
import org.apache.ibatis.annotations.Mapper;
 
import com.jmx.vo.Dept;
@Mapper
public interface IDeptDao{
    public boolean doCreate(Dept vo);
    public Dept findById(int id);
    public List<Dept>findAll(); 
}