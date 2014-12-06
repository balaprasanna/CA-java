package iss.precision.laps.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class department {


		@Id
		private String DepartmentID;
		private String Name;
		private String ManagerID;
		private String ParentDepartmentID;
		
		
		
		public String getDepartmentID() {
			return DepartmentID;
		}
		public void setDepartmentID(String departmentID) {
			DepartmentID = departmentID;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getManagerID() {
			return ManagerID;
		}
		public void setManagerID(String managerID) {
			ManagerID = managerID;
		}
		public String getParentDepartmentID() {
			return ParentDepartmentID;
		}
		public void setParentDepartmentID(String parentDepartmentID) {
			ParentDepartmentID = parentDepartmentID;
		}

	}