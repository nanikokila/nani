package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class QP {

	public static void main(String[] args) {

		//create one empty client 
				Client c = Client.create();
				//define one url
				String URL = "http://localhost:2017/FirstApp/rest/ramya/ashok";
				//add url to client object
				WebResource wr = c.resource(URL);
				wr = wr.queryParam("sid", "1");
				wr = wr.queryParam("sname", "ashok");
				wr = wr.queryParam("sfee", "5.0");
				//cal get/post method on webResource object
				ClientResponse cr = wr.get(ClientResponse.class);
				//read entity from ClientResponse.
				String s = cr.getEntity(String.class);
				//print msg
				System.out.println(s);
				System.out.println(cr.getStatus());
				System.out.println(cr.getStatusInfo());
	}

}
