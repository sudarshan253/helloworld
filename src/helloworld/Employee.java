package helloworld;

public class Employee {
	
	private Integer eno;
	private String ename;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee(Integer eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	

}
