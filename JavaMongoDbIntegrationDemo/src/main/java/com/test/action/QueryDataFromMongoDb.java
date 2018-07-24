package com.test.action;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class QueryDataFromMongoDb {

	public static void main(String[] args) {
	    //test	
		MongoClient mongoDbClient = new MongoClient("localhost", 27017);
		MongoDatabase db = mongoDbClient.getDatabase("myTestDb");
		
		MongoCollection<Document> collections = db.getCollection("Department");
		FindIterable<Document> iterable = collections.find();
		Document document = iterable.first();
	    System.out.println(document);
	}

}
