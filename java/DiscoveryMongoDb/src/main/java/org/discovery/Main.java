package org.discovery;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Main {

    public static void main(String[] args) {
        TelemetryRepository repository = new TelemetryLoader().getRepository();
        repository.buscarTodos().forEach(System.out::println);
    }
//    public static void getAll(MongoCollection<TelemetryEntity> collection){
//        collection.find().projection(Projections.excludeId()).forEach(System.out::println);
//    }

//    public static void changeAllSteps(MongoCollection<Document> collection, int value) {
//        collection.updateMany(exists("steps", true), Updates.set("steps", value));
//    }
//
//    public static void findAllUserSteps(MongoCollection<Document> colletion) {
//        Bson projectionFields = Projections.fields(Projections.include("steps", "username"), Projections.excludeId());
//        var docs = colletion.find(and(exists("steps", true), gt("steps", 0))).projection(projectionFields);
//        docs.forEach((t) -> {
//            System.out.println(t.toJson());
//        });
//    }
//
//    public static void findAllUsers(MongoCollection<Document> collection) {
//        collection.find().projection(fields(include("username"), excludeId())).forEach((t) -> {
//            System.out.println(t.toJson());
//        });
//    }
//
//    public static void printEntireDb(MongoCollection<Document> collection) {
//        collection.find().projection(Projections.excludeId()).forEach((t) -> {
//            System.out.println(t.toBsonDocument());
//        });
//    }
}