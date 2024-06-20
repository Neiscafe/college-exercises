package org.discovery;

public class TelemetryLoader {
    private TelemetryDao getDao(){
        return new TelemetryDaoImpl(TelemetryServiceBuilder.getTelemetryCollection());
    }

    public TelemetryRepository getRepository(){
        return new TelemetryRepository(getDao());
    }
}
