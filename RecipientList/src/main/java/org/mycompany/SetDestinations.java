package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Value;

public class SetDestinations implements Processor{
	
	@Value("${mydest}")
	String mydestinations;

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		exchange.getIn().setHeader("mydestinations", mydestinations);
		
	}
	
	

}
