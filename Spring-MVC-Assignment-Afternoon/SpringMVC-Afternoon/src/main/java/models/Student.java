package models;

public class Student 
{
	private int id;
	private String fname;
	private String lname;
	private String deptname;
	
	
	public Student(int id, String fname, String lname, String deptname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.deptname = deptname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
	
}
