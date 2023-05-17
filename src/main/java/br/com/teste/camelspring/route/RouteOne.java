package br.com.teste.camelspring.route;

import org.apache.camel.builder.RouteBuilder;

import br.com.teste.camelspring.process.ProcessOne;

public class RouteOne extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		from("direct:route_one")
		.process(new ProcessOne())
		.end();
		
	}

}
