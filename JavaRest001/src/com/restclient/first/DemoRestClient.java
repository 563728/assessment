package com.restclient.first;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class DemoRestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientConfig config=new ClientConfig();
		Client client= ClientBuilder.newClient(config);
		WebTarget webTarget= client.target(getCustomerURI());
		
		//String response= webTarget.path("rest").path("first").path("welcome").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
		//String response= webTarget.path("rest").path("friends").path("getAll").request().accept(MediaType.APPLICATION_JSON).get(Response.class).toString();
		String response= webTarget.path("rest").path("friends").path("delete;id=2").request().accept(MediaType.APPLICATION_JSON).delete(Response.class).toString();
		System.out.println(response);
		
		//String message= webTarget.path("rest").path("first").path("welcome").request().accept(MediaType.TEXT_PLAIN).get(String.class).toString();
		//String message= webTarget.path("rest").path("friends").path("getAll").request().accept(MediaType.APPLICATION_JSON).get(String.class).toString();
		String message= webTarget.path("rest").path("friends").path("delete;id=2").request().accept(MediaType.APPLICATION_JSON).delete(String.class).toString();
		System.out.println(message);
		
	}

	private static URI getCustomerURI()
	{
		return UriBuilder.fromUri("http://localhost:8080/JavaRest002").build() ;
	}
}