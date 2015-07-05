package com.example.spring.mongodb;

import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * @author Maulik
 * 
 */
public class MongoDbInsertRecordDemo {

	static Logger logger = Logger.getLogger(MongoDbInsertRecordDemo.class);

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		MongoClient mongoClient;
		try {
			mongoClient = new MongoClient();
			DB db = mongoClient.getDB("MyMongoDb");
			boolean authenticate = db
					.authenticate("Test", "Test".toCharArray());
			logger.info("Authenticate :" + authenticate);

			if (authenticate) {

				DBCollection collection = db.getCollection("student");

				BasicDBObject basicDBObject = new BasicDBObject();
				basicDBObject.put("id", "008");
				basicDBObject.put("firstName", "Mitesh");
				basicDBObject.put("lastName", "Dhabhi");
				BasicDBObject addressDBObject = new BasicDBObject();
				addressDBObject.put("city", "Baroda");
				addressDBObject.put("state", "Gujarat");
				addressDBObject.put("country", "India");
				basicDBObject.put("address", addressDBObject);
				collection.insert(basicDBObject);

				BasicDBObjectBuilder basicDBObjectBuilder = BasicDBObjectBuilder
						.start().add("id", "009").add("firstName", "Amit")
						.add("lastName", "Agraval");
				BasicDBObjectBuilder addressBuilder = BasicDBObjectBuilder
						.start().add("city", "Rajkot").add("state", "Gujarat")
						.add("country", "India");
				basicDBObjectBuilder.add("address", addressBuilder.get());
				collection.insert(basicDBObjectBuilder.get());

				logger.info("Insert Record SucessFully...!!!");
			}
			mongoClient.close();
		} catch (UnknownHostException e) {
			logger.error(e.getMessage(), e);
		}
	}
}
