package org.discovery;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.discovery.dao.TelemetryDaoImpl;
import org.discovery.entities.LocalizacaoEntity;
import org.discovery.entities.TelemetryEntity;
import org.discovery.repository.TelemetryRepository;
import org.discovery.services.TelemetryDatabaseService;

import java.util.List;
import java.util.UUID;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Main {
    static TelemetryRepository repository;

    public static void main(String[] args) {
        TelemetryDatabaseService.startClient();
        repository = createRepository();
        TelemetryDatabaseService.closeClient();
    }

    private static void updateLocalizacaoExample() {
        var query = printAndReturnQueryAntes();
        repository.updateLocalizacao(query.getFirst().getSensorId(), 100, 200);
        printAndReturnQueryDepois();
    }

    private static void insertExample() {
        printAndReturnQueryAntes();
        repository.insert(createEntity());
        printAndReturnQueryDepois();
    }

    private static void replaceExample() {
        var query = printAndReturnQueryAntes();
        var toBeReplaced = alterEntityFields(query);
        repository.replace(toBeReplaced);
        printAndReturnQueryDepois();
    }

    private static void removeExample() {
        var query = printAndReturnQueryAntes();
        repository.remove(query.getFirst().getSensorId());
        printAndReturnQueryDepois();
    }

    private static TelemetryEntity alterEntityFields(List<TelemetryEntity> query) {
        var toBeReplaced = query.getFirst();
        toBeReplaced.setPassos(9999);
        toBeReplaced.setFrequenciaCardiaca(99.99f);
        toBeReplaced.setUmidade(100.1f);
        return toBeReplaced;
    }

    private static TelemetryEntity createEntity() {
        return new TelemetryEntity(UUID.randomUUID().toString(), 20f, 60f, 1200, 84f, new LocalizacaoEntity(-27.7131, -52.4316));
    }

    private static TelemetryRepository createRepository() {
        return new TelemetryRepository(new TelemetryDaoImpl(TelemetryDatabaseService.getCollection()));
    }

    private static List<TelemetryEntity> printAndReturnQueryAntes() {
        return printAndReturnQuery("Antes:");
    }

    private static List<TelemetryEntity> printAndReturnQueryDepois() {
        return printAndReturnQuery("Depois:");
    }

    private static List<TelemetryEntity> printAndReturnQuery(String message) {
        var query = repository.query();
        System.out.println(message);
        query.forEach(System.out::println);
        return query;
    }
}