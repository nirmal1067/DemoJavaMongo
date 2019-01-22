package org.mysample.mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        
        DB db = mongoClient.getDB("QuoteDB");
        
       MongoDatabase mDB =  mongoClient.getDatabase("QuoteDB");
       
       DBCollection dbCollection = db.getCollection("Quotes");
        
       System.out.println(dbCollection.count());
        
        
    }
}
