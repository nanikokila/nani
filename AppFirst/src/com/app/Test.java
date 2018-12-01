package com.app;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args)  {

		/*Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Ramya");
		emp.setEmpSal(9.9);
		emp.setPassword("ashokreddy");*/
		
		String msg = "{\"empId\":90,\"empName\":\"ashok\",\"empSal\":8.5,\"password\":\"ramya\"}";
		try
		{
			ObjectMapper om = new ObjectMapper();
			//String json = om.writeValueAsString(msg);
			Employee emp = om.readValue(msg, Employee.class);
			System.out.println(emp);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
