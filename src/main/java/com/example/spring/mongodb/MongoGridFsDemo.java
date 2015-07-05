package com.example.spring.mongodb;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

/**
 * @author Maulik
 * 
 */
public class MongoGridFsDemo {

	static Logger logger = Logger.getLogger(MongoGridFsDemo.class);

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		MongoClient mongoClient;
		try {
			mongoClient = new MongoClient();
			DB db = mongoClient.getDB("MyMongoDb");
			boolean authenticate = db
					.authenticate("Test", "Test".toCharArray());
			logger.info(">>>>> Authenticate :" + authenticate);

			if (authenticate) {

				String newFileName = "GridFsImage";

				File imageFile = new File("src\\main\\java\\key.png");

				// create a "photo" namespace
				GridFS gfsPhoto = new GridFS(db, "photo");

				// get image file from local drive
				GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);

				// set a new filename for identify purpose
				gfsFile.setFilename(newFileName);

				// save the image file into mongoDB
				gfsFile.save();

				// print the result
				DBCursor cursor = gfsPhoto.getFileList();
				while (cursor.hasNext()) {
					System.out.println(cursor.next());
				}

				// get image file by it's filename
				GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);

				// save it into a new image file
				imageForOutput.writeTo("C:\\Users\\Maulik\\Desktop\\New.png");

				// remove the image file from mongoDB
				// gfsPhoto.remove(gfsPhoto.findOne(newFileName));

				System.out.println("Image Save Sucessfully...!!!");
			}
			mongoClient.close();
		} catch (UnknownHostException e) {
			logger.error(e.getMessage(), e);
		}
	}
}
