package br.com.teste.camelspring.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessOne implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {

		exchange.getMessage().setBody("Teste Java");
	}

}
