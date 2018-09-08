package com.jmx.vo;
 
import java.io.Serializable;
 
/**部门VO类
 * @author JMX
 *
 */
@SuppressWarnings("serial")
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String loc;
    
    
    public Long getDeptno() {
        return deptno;
    }
    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }
    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getLoc() {
        return loc;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
    @Override
    public String toString() {
	return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
    }
}
