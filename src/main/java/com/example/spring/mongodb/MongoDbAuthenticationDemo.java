package com.example.spring.mongodb;

import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * @author Maulik
 * 
 */
public class MongoDbAuthenticationDemo {

	static Logger logger = Logger.getLogger(MongoDbAuthenticationDemo.class);

	public static void main(String[] args) {

		MongoClient mongoClient;
		try {
			mongoClient = new MongoClient();
			logger.info(mongoClient.getConnectPoint());

			DB db = mongoClient.getDB("MyMongoDb");
			// WriteResult addUser = db.addUser("Test", "Test".toCharArray());
			// logger.info(addUser);

			boolean authenticate = db
					.authenticate("Test", "Test".toCharArray());
			logger.info("Authenticate :" + authenticate);

			logger.info(db.getCollectionNames());

			mongoClient.close();

		} catch (UnknownHostException e) {
			logger.error(e.getMessage(), e);
		}

	}

}
