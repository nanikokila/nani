package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class EmpForm {

	public static void main(String[] args) {

		Client c = Client.create();
		String url = "http://localhost:2017/RestForm/rest/emp/data";
		WebResource wr = c.resource(url);
		Form f = new Form();
		f.add("eid", 1);
		f.add("ename", "ashok");
		f.add("esal", 45000.50);
		ClientResponse cr = wr.post(ClientResponse.class,f);
		String s = cr.getEntity(String.class);
		System.out.println(s);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}

}
