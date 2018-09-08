package com.jmx.microcloud.rest;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.jmx.microcloud.service.IDeptService;
import com.jmx.vo.Dept;
 
@RestController
public class DeptRest {
    
    @Autowired
    private IDeptService ideptService;
    
    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable(value="id")int id) {
	return ideptService.get(id);
    }
    
    @RequestMapping(value="/dept/add",method=RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
	return ideptService.add(dept);
    }
    
    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list() {
	return ideptService.list();
    }
}