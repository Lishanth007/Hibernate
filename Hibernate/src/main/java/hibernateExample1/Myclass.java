package hibernateExample1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SchoolStudents")
public class Myclass {

	@Id

	@GeneratedValue
	@Column(name = "studentId")
	private int sid;
	@Column(name = "studentName")
	private String sname;
	@Column(name = "studentClass")
	private int sclass;
	@Column(name = "studentSubjects")
	private int ssubjects;

	public Myclass(int sid, String sname, int sclass, int ssubjects) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sclass = sclass;
		this.ssubjects = ssubjects;
	}

	public Myclass() {
	}

	@Override
	public String toString() {
		return "Myclass [sid=" + sid + ", sname=" + sname + ", sclass=" + sclass + ", ssubjects=" + ssubjects + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSclass() {
		return sclass;
	}

	public void setSclass(int sclass) {
		this.sclass = sclass;
	}

	public int getSsubjects() {
		return ssubjects;
	}

	public void setSsubjects(int ssubjects) {
		this.ssubjects = ssubjects;
	}
}