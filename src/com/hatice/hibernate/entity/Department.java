package com.hatice.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department {
	@Id
	@SequenceGenerator(name="my_seq",sequenceName="DEPARTMENT_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="my_seq")
	@Column(name="department_id")
	private Integer departmentId;
	@Column(name="department_name")
	private String departmentName;
	@Column(name="manager_id", nullable=true)
	private Integer managerId;
	@Column(name="location_id")
	private Integer locationId;
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public Department(String departmentName, Integer managerId) {
		super();
		this.departmentName = departmentName;
		this.managerId = managerId;
		
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + ", locationId=" + locationId + "]";
	}
	
	public Department() {
		System.out.println("Constructor, default");
		
	}
	
	
	

}
