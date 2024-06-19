package org.discovery;

import com.mongodb.client.result.InsertOneResult;
import com.mongodb.lang.NonNull;

import java.util.List;

public interface TelemetryDao {
    List<TelemetryEntity> buscarTodos();
    TelemetryEntity buscarPorId(String id);
    void inserir(TelemetryEntity entity);
    void alterar(TelemetryEntity entity);
    void remover(String id);
}
