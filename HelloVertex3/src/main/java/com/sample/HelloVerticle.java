package com.sample;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class HelloVerticle extends AbstractVerticle {

	private final static Logger log = LoggerFactory.getLogger(HelloVerticle.class);
	
	@Override
	public void start() throws Exception {
		// TODO Auto-generated method stub
		super.start();
		
		log.info("HelloVerticle start...");
		
		vertx.createHttpServer()
		.requestHandler(r -> {
			r.response().end("<h1>Hello</h1>");
		})
		.listen(8080);
		
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
		
		log.info("HelloVerticle stop...");
		
	}
	
	
}
