package com.test.action;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertDataIntoMongoDb {

	public static void main(String[] args){  
		try{  
		//---------- Connecting DataBase -------------------------//  
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );  
		//---------- Creating DataBase ---------------------------//  
		MongoDatabase db = mongoClient.getDatabase("myTestDb");  
		//---------- Creating Collection -------------------------//  
		MongoCollection<Document> table = db.getCollection("Department");  
		//---------- Creating Document ---------------------------//    
		Document doc = new Document("departmentId", 1010);  
		doc.append("deptName","geography");  
		//----------- Inserting Data ------------------------------//  
		table.insertOne(doc); 
		}catch(Exception e){  
		System.out.println(e);  
		}  
	}
}
