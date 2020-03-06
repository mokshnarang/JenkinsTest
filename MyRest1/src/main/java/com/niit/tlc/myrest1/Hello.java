package com.niit.tlc.myrest1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello jersey plain";
	}
	
	@GET
	@Path("/xmlhello")
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>"+"<hello> Hello Jersey"+"</hello>";
	}
	
	@GET
	@Path("/htmlhello")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHTMLHello() {
		return "<HTML>"+"<TITLE>"+"HEllo jersey"+"</TITLE"+"<BODY><H1>"+"Hello jersey html"+"</h1></body>"+"</html>";
	}
}
