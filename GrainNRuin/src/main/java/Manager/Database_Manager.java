/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;
import org.bson.conversions.Bson;
/**
 *
 * @author Engilo Grave
 */

public class Database_Manager {
    // Establish Connection to the Server
    private String uri = "mongodb+srv://jonelgie_Grave:GraveDeath123@grailnruin.eias6eg.mongodb.net/";
    private MongoClientURI clientURI = new MongoClientURI(uri);
    
    // Directory to the Collection Host of Database GrailNRuin
    private MongoClient ClientHost = new MongoClient(clientURI);
    private MongoDatabase Database  = ClientHost.getDatabase("GrailNRuin");
    private MongoCollection collection;
    
    // JSON Documintation for complex files
    private Document document = new Document();
    
    //Hashmmap
    private HashMap<String, String> obj;
    
    //Constructor instill with String collect for choosing Collection file within the Database
    public Database_Manager(){}
    public Database_Manager(String collect){
        collection = Database.getCollection(collect);
    }
    //Set new Collection
    public boolean setCollection(String name){
        collection = Database.getCollection(name);
        return collection != null;
    }
    
    // Append JSON Documents as either Complex/ArrayList/List or Singular data Types
    public void setAppendMany(String key, List list){
        this.document.append(key, list);
    }
    public void setAppendSingle(String key, Object value){
        this.document.append(key, value);
    }
    public void setAppendMapString(String key, HashMap<String, String> obj){
        Document temp = new Document();
        for(Map.Entry<String, String> entry : obj.entrySet()){
                temp.put(entry.getKey(), entry.getValue());
            }
        this.document.append(key, temp);
    }
    public void setAppendMapInteger(String key, HashMap<String, Integer> obj){
        Document temp = new Document();
        for(Map.Entry<String, Integer> entry : obj.entrySet()){
                temp.put(entry.getKey(), entry.getValue());
            }
        this.document.append(key, temp);
    }
    public void setAppendMapFloat(String key, HashMap<String, Float> obj){
        Document temp = new Document();
        for(Map.Entry<String, Float> entry : obj.entrySet()){
                temp.put(entry.getKey(), entry.getValue());
            }
        this.document.append(key, temp);
    }
    // Commiting to the Database
    public void Insert(){
        this.collection.insertOne(this.document);
    }
    public void insertNewObject(String key, Object value, String newKey, Object newValue){
        Document query = new Document(key, value);
        Document found = new Document("$set", new Document(newKey, newValue));
        collection.updateOne(query, found);
    }
    // UPDATER
    public void updateDocument(String key, Object value, String setKey, Object changeValueTo){
        Document query = new Document(key, value);
        Document update = new Document("$set", new Document(setKey, changeValueTo));
        collection.updateOne(query, update);
    }
    public void updateDocument(Document doc, String setKey, Object changeValueTo){
        Document update = new Document("$set", new Document(setKey, changeValueTo));
        collection.updateOne(doc,update);
    }
    // Print Document ... NEEDS MORE TESTING
    public Document getDocument(String key, Object value){
        Document query = new Document(key, value);
        Document found = new Document();
        MongoCursor<Document> cursor = collection.find(query).iterator();
        
        while (cursor.hasNext()){
            Document result = cursor.next();
            found = result;
        }
        cursor.close();
        return found;
    }
    
    public ArrayList getListDocument(String key, Object value){
        ArrayList<Document> results = new ArrayList<>();
        Document query = new Document(key, value);
        
        try(MongoCursor<Document> cursor = collection.find(query).iterator()){
            while(cursor.hasNext()){
                results.add(cursor.next());
            }
        }
        
        return results;
    }
    
    public void printDocument(String key, Object value){
        Document query = new Document(key, value);
        MongoCursor<Document> cursor = collection.find(query).iterator();
        
        while(cursor.hasNext()){
            Document result = cursor.next();
            System.out.print(result.toJson());
        }
        
        cursor.close();
    }
    // if Exist ... NEEDS MORE TETSING
    public boolean Exist(String key, Object value){
        Document query = new Document(key,value);
        Document found = new Document();
        MongoCursor<Document> cursor = collection.find(query).iterator();
        
        while(cursor.hasNext()){
            cursor.next();
            return true;
        }
        return false;
    }
    
    public int getCount(){
        return Math.toIntExact(collection.countDocuments());
    }
    
    //Testing Purposes Only
    public static void main(String[] args){
        try{
            MongoClient localClient = new MongoClient("localhost", 27017);
            MongoDatabase localDatabase = localClient.getDatabase("GrailNRuin");
            MongoCollection loacalCol = localDatabase.getCollection("test");

            Document docs1 = new Document("name", "Grave");
            docs1.append("Status", "active");
            docs1.append("Sex", "Male");
            docs1.append("Age", "34");

            Document docs2 = new Document("name", "Yap");
            docs2.append("Status", "active");
            docs2.append("Sex", "Male");
            docs2.append("Age", "10");

            Document docs3 = new Document("name", "Pata");
            docs3.append("Status", "active");
            docs3.append("Sex", "Male");
            docs3.append("Age", "100");

            ArrayList<Document> arrayDocs = new ArrayList<>();
            arrayDocs.add(docs1);
            arrayDocs.add(docs2);
            arrayDocs.add(docs3);
            
            loacalCol.insertMany(arrayDocs);
            
            System.out.println("Initialized");
            
            HashMap<String, Object> obj = new HashMap<>();
            HashMap<String, Integer> Stats = new HashMap<>();
            obj.put("name", "Grave");
            Stats.put("Strength", 10);
            Stats.put("Magic", 10);
            Stats.put("Agility", 10);
            
            Document doc4 = new Document();
            for(Map.Entry<String, Integer> entry : Stats.entrySet()){
                doc4.put(entry.getKey(), entry.getValue());
            }
            
            Document doc5 = new Document("name", "Grave")
                    .append("Stats", doc4);
            
            loacalCol.insertOne(doc5);
            System.out.println("Inserted HashMap");
            
            Document query = new Document("Status", "active");
            MongoCursor<Document> cursor = loacalCol.find(query).iterator();

            while(cursor.hasNext()){
                Document result = cursor.next();
                String name = result.getString("name");
                System.out.println("Name: " + name);
            }
            
            cursor.close();
            
            System.out.println(Math.toIntExact(loacalCol.countDocuments()));
            
            
        }catch (Exception e){
            System.out.println("System Error :" + e);
        }
    }
    
}
