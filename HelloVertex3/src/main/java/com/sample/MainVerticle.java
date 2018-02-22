package com.sample;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class MainVerticle extends AbstractVerticle {

	private final static Logger log = LoggerFactory.getLogger(MainVerticle.class);
	
	@Override
	public void start() throws Exception {
		// TODO Auto-generated method stub
		super.start();
		
		// merge test 1111
		// merge test 2222
		
		log.info("deploy start...");
		
		// config loading...
		JsonObject config = context.config();
		
		// default deploy opt
		DeploymentOptions defaultOpt = new DeploymentOptions();
		defaultOpt.setConfig(config);
		
		// worker deploy opt
		DeploymentOptions workerOpt = new DeploymentOptions();
		workerOpt.setConfig(config);
		workerOpt.setWorker(true);
		
		vertx.deployVerticle("com.sample.HelloVerticle", workerOpt.setInstances(2));
		
	}

	
	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
		
		log.info("deploy stop...");
		
	}
	
	
}
