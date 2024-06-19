package org.discovery;

import java.util.List;

public class TelemetryRepository {
    private final TelemetryDao dao;

    public TelemetryRepository(TelemetryDao dao) {
        this.dao = dao;
    }

    List<TelemetryEntity> buscarTodos() {
        return dao.buscarTodos();
    }

    TelemetryEntity buscarPorId(String id) {
        return dao.buscarPorId(id);
    }

    void inserir(TelemetryEntity entity) {
        dao.inserir(entity);
    }

    void alterar(TelemetryEntity entity) {
        dao.alterar(entity);
    }

    void remover(String id) {
        dao.remover(id);
    }
}
