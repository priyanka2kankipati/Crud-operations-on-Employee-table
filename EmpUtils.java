package com.deloitte.empl.utils;


//all the queries to be implemented are included in this file
public class EmpUtils {
	public static String insertqry="insert into emp values(?,?,?,?,?,?,?,?)";
	public static final String GETEMPLS = "select * from emp";
	public static final String GETEMPlBYCODE = "select * from emp where empno=?";
	public static final String updateqry="update emp set ename=?, job=? where empno=?";
	public static final String deleteqry="delete from emp where empno=?";
}
