package org.discovery;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Projections;

import java.util.ArrayList;
import java.util.List;

public class TelemetryDaoImpl implements TelemetryDao {
    private final MongoCollection<TelemetryEntity> collection;

    public TelemetryDaoImpl(MongoCollection<TelemetryEntity> collection) {
        if(collection==null){
            System.out.println("Null collection exception: /n");
        }
        this.collection = collection;
    }

    @Override
    public List<TelemetryEntity> buscarTodos() {
        ArrayList<TelemetryEntity> list = new ArrayList<>();
        collection.find().projection(Projections.excludeId()).forEach(list::add);
        return list;
    }

    @Override
    public TelemetryEntity buscarPorId(String id) {
        return null;
    }

    @Override
    public void inserir(TelemetryEntity entity) {

    }

    @Override
    public void alterar(TelemetryEntity entity) {

    }

    @Override
    public void remover(String id) {

    }
}
