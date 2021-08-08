package com.ganesh.entity;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class EmployeeIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "EMP";
		Connection connection = session.connection();
		try {
			Statement statement=connection.createStatement();

	        ResultSet rs=statement.executeQuery("select count(emp_id) as Id from employee");
	        if(rs.next()) {
	        	 int id=rs.getInt(1)+101;
	             String str = Integer.toString(id);
	        	 String generatedId = prefix + str;
	             return generatedId;
	        }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	 

}
