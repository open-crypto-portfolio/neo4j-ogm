package org.neo4j.ogm.domain.versioned_rel;

import java.util.UUID;

import org.neo4j.ogm.id.IdStrategy;

public class UivUuidStrategy implements IdStrategy {

    @Override
    public Object generateId(Object entity) {
        return UUID.randomUUID().toString();
    }
}
