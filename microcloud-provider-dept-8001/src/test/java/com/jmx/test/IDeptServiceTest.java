package com.jmx.test;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
 
import com.jmx.microcloud.Dept_8001_StartSpringCloudApplication;
import com.jmx.microcloud.service.IDeptService;
import com.jmx.vo.Dept;
 
@SpringBootTest(classes = Dept_8001_StartSpringCloudApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class IDeptServiceTest {
    
    @Autowired
    private  IDeptService ideptService;
 
	@Test
	public void testGet() {
		System.out.println(ideptService.get(1));
	}
 
	@Test
	public void testAdd() {
		Dept dept = new Dept() ;
		dept.setDname("测试部-" + System.currentTimeMillis());
		System.out.println(ideptService.add(dept)); 
	}
 
	@Test
	public void testList() {
		System.out.println(ideptService.list());
	}
 
}