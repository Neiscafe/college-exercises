package org.discovery;

import com.mongodb.client.MongoCollection;

import java.util.List;

public class TelemetryDaoImpl implements TelemetryDao{
    private final MongoCollection<TelemetryEntity> collection;

    public TelemetryDaoImpl(MongoCollection<TelemetryEntity> collection) {
        this.collection = collection;
    }

    @Override
    public List<TelemetryEntity> buscarTodos() {
        return null;
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
