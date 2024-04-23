/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
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
    
    //Constructor instill with String collect for choosing Collection file within the Database
    public Database_Manager(){}
    public Database_Manager(String collect){
        collection = Database.getCollection(collect);
    }
    // Get Collection from database
    public void EnterCollection(String Collection){
        collection = Database.getCollection(Collection);
    }
    
    // Append JSON Documents as either Complex/ArrayList/List or Singular data Types
    public void setAppendMany(String key, List list){
        document.append(key, list);
    }
    public void setAppendSingle(String key, Object value){
        document.append(key, value);
    }
    
    //Update Document:
    public boolean updateDocument(String orgKey, Object orgValue, String setKey, Object newValue){
        try{
            Document found = (Document) collection.find(new Document(orgKey, orgValue)).first();
        
            if(found != null){
                Bson updatedValue = new Document(setKey, newValue);
                Bson updatedOperation = new Document("$set", updatedValue);
                collection.updateOne(found, updatedOperation);
                System.out.println("Update Implimented");
                return true;
            } else {
                System.out.println("Update Unimpliented");
                return false;
            }
        } catch(Error e){
            System.out.println("Update Unimpliented , System Error : " + e);
            return false;
        }
       
    }
    
    public ArrayList getDocument(String orgKey, Object orgValue){
        
        Document found = (Document) collection.find(new Document(orgKey, orgValue)).first();
        ArrayList<String> components = new ArrayList<String>();
        
        
        if(found != null){
            
        }
        
        
        return null;
    }
    
    // Having to Get Data From chose Directory
    public boolean printAggregates(String orgKey, Object value, String id){
        try{
            
            Block<Document> printBlock = document->System.out.println(document.toJson());
            
            collection.aggregate(Arrays.asList(
                    Aggregates.match(Filters.eq(orgKey, value)),
                    Aggregates.group(id, Accumulators.sum("count", 1))
            )).forEach(printBlock);
            
            System.out.print("collections Aggregated");
            
            return true;
        } catch (Exception e){
            System.out.println("System Error : " + e);
            return false;
        }
        
    }
    
    
    //Testing Purposes Only
    public static void main(String[] args){
        try{
            MongoClient localClient = new MongoClient("localhost", 27017);
            MongoDatabase localDatabase = localClient.getDatabase("GrailNRuin");
            MongoCollection loacalCol = localDatabase.getCollection("test");

            Document docs1 = new Document("name", "Grave");
            docs1.append("Sex", "Male");
            docs1.append("Age", "34");

            Document docs2 = new Document("name", "Yap");
            docs2.append("Sex", "Male");
            docs2.append("Age", "10");

            Document docs3 = new Document("name", "Pata");
            docs3.append("Sex", "Male");
            docs3.append("Age", "100");

            ArrayList<Document> arrayDocs = new ArrayList<Document>();
            arrayDocs.add(docs1);
            arrayDocs.add(docs2);
            arrayDocs.add(docs3);
            
            loacalCol.insertMany(arrayDocs);
            
            System.out.println("Initialized");
        }catch (Exception e){
            System.out.println("System Error :" + e);
        }
    }
    
}
