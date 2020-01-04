package com.deloitte.empl.dao;

import java.util.List;

import com.deloitte.empl.beans.Emp;

//DAO interface defines what functions are to be performed in the application
public interface EmpDao {
	void openConnection();
	void close();
	
	int addEmp(Emp emp); 
	List<Emp> getEmpls();
	Emp getEmpByCode(int empcode);
	int updateQuery(int empno1,String ename1, String job1);
	void deleteQuery(int empno1);
}

