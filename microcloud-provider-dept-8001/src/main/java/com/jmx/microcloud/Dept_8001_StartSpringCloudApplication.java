package com.jmx.microcloud;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
 
/**程序主类
 * @author JMX
 *
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.jmx.microcloud.dao")
public class Dept_8001_StartSpringCloudApplication {
    public static void main(String[] args) {
	SpringApplication.run(Dept_8001_StartSpringCloudApplication.class, args);
    }
 
}