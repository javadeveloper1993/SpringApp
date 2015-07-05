package com.example.spring.mongodb;

import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * @author Maulik
 * 
 */
public class MongoDbUpdateRecordDemo {

	static Logger logger = Logger.getLogger(MongoDbUpdateRecordDemo.class);

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

				BasicDBObject queryDbObject = new BasicDBObject().append("id",
						"005");

				System.out.println(queryDbObject);

				BasicDBObject updateQueryDbObject = new BasicDBObject().append(
						"$set",
						new BasicDBObject().append("lastName", "Tiwari"));
				System.out.println(updateQueryDbObject);

				collection.update(queryDbObject, updateQueryDbObject);

				logger.info("Insert Update SucessFully...!!!");
			}
			mongoClient.close();
		} catch (UnknownHostException e) {
			logger.error(e.getMessage(), e);
		}
	}
}
