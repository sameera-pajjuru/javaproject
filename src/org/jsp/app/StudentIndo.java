package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: StudentIndo
 *
 */
@Entity
@NamedQuery(name="st", query = "update StudentIndo s set s.studentStream=:ss  where s.studentId=:xy")
public class StudentIndo implements Serializable {

	
	private String studentName;   
	@Id
	private int studentId;
	private String studentStream;
	private static final long serialVersionUID = 1L;

	public StudentIndo() {
		super();
	}   
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}   
	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}   
	public String getStudentStream() {
		return this.studentStream;
	}

	public void setStudentStream(String studentStream) {
		this.studentStream = studentStream;
	}
   
}
