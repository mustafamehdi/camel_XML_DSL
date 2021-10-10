package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class myprocessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		exchange.getIn().setHeader("Myprocessor", "this heaer is set in processor");

	}

}
