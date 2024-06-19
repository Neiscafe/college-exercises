package org.discovery;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class TelemetryService {
    private static String uri = "mongodb+srv://guilhermeneis132:Zv9KmkAi4p9ey5tA@discoverydb.c4g2ias.mongodb.net/?retryWrites=true&w=majority&appName=DiscoveryDB";

    static MongoCollection<TelemetryEntity> getCollection(){
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
            CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
            MongoDatabase database = mongoClient.getDatabase("discovery_db").withCodecRegistry(pojoCodecRegistry);
            return database.getCollection("user_telemetry", TelemetryEntity.class);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Uma exceção ocorreu!");
            return null;
        }
    }
}
