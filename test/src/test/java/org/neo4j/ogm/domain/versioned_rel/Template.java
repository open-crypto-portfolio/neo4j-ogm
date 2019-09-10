package org.neo4j.ogm.domain.versioned_rel;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity(label = "Template")
public class Template extends BaseDomainObject {

    public String name;

    @JsonProperty("service")
    @Relationship(
        type = "special",
        direction = "INCOMING"
    )
    protected Set<UsedBy> service = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UsedBy> getService() {
        return service;
    }

    public void setService(Set<UsedBy> service) {
        this.service = service;
    }
}
