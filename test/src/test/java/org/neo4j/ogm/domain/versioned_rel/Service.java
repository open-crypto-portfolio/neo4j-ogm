package org.neo4j.ogm.domain.versioned_rel;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(
    label = "Service"
)
public class Service extends BaseDomainObject {

    public String name;


    @Relationship(
        type = "special",
        direction = "OUTGOING"
    )
    protected UsedBy template;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsedBy getTemplate() {
        return template;
    }

    public void setTemplate(UsedBy template) {
        this.template = template;
    }
}
