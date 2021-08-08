package com.ganesh.idhelper;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class EmployeeIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "EMP";
		Integer rs = 000;
		try {
			int id = rs + 101;
			String str = Integer.toString(id);
			//String generatedId = prefix = new Integer(id).toString();
			String generatedId = prefix + str;
            return generatedId;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
