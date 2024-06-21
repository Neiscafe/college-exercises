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

public class TelemetryServiceBuilder {
    private static String uri = "mongodb+srv://guilhermeneis132:Zv9KmkAi4p9ey5tA@discoverydb.c4g2ias.mongodb.net/?retryWrites=true&w=majority&appName=DiscoveryDB";
    private static MongoClient mongoClient = null;
    private static MongoDatabase database = null;

    public static MongoCollection<TelemetryEntity> getTelemetryCollection() {
        mongoClient = MongoClients.create(uri);
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
        database = mongoClient.getDatabase("discovery_db").withCodecRegistry(pojoCodecRegistry);
        return getCollection();
    }

    private static MongoCollection<TelemetryEntity> getCollection() {
        return database.getCollection("user_telemetry", TelemetryEntity.class);
    }
}

