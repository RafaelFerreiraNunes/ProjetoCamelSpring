package br.com.teste.camelspring.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class TesteRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		restConfiguration()
		.component("servlet")
		.port(8090)
		.host("localhost")
		.bindingMode(RestBindingMode.json);
		
		rest()
		.get("/hello-world")
		.produces(MediaType.APPLICATION_JSON_VALUE)
		.to("direct:route_one");
		
		
	}

}
