package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class HP {

	public static void main(String[] args) {

		//create one empty client 
				Client c = Client.create();
				String URL = "http://localhost:2017/FirstApp/rest/naveen/naresh";
				WebResource wr = c.resource(URL);
				ClientResponse cr = wr.header("user", "admin")
						.header("password", "sathya")
						.post(ClientResponse.class);
				String s = cr.getEntity(String.class);
				System.out.println(s);
	}

}
