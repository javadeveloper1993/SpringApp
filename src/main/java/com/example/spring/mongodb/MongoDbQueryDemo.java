package com.example.spring.mongodb;

import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * @author Maulik
 * 
 */
public class MongoDbQueryDemo {

	static Logger logger = Logger.getLogger(MongoDbQueryDemo.class);

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		MongoClient mongoClient;
		try {
			mongoClient = new MongoClient();
			DB db = mongoClient.getDB("MyMongoDb");
			boolean authenticate = db
					.authenticate("Test", "Test".toCharArray());
			logger.info(">>>>> Authenticate :" + authenticate);

			if (authenticate) {

				DBCollection collection = db.getCollection("student");

				BasicDBObject allQuery = new BasicDBObject();
				BasicDBObject fields = new BasicDBObject();
				fields.put("firstName", 1);
				fields.put("_id", 0);

				DBCursor cursor = collection.find(allQuery, fields);

				while (cursor.hasNext()) {
					System.out.println(cursor.next());
				}

				// System.out.println(regexQuery.toString());

				logger.info("Find Record SucessFully...!!!");
			}
			mongoClient.close();
		} catch (UnknownHostException e) {
			logger.error(e.getMessage(), e);
		}
	}
}
