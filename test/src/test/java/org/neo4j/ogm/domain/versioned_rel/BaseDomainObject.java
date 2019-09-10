package org.neo4j.ogm.domain.versioned_rel;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Transient;
import org.neo4j.ogm.annotation.Version;

public abstract class BaseDomainObject {

    public String _identifier;

    @Transient
    public String ref;

    private Long id;

    @Id
    @GeneratedValue(strategy = UivUuidStrategy.class)
    private String uuid;

    @Version
    private Long optlock;

    public String get_identifier() {
        return _identifier;
    }

    public void set_identifier(String _identifier) {
        this._identifier = _identifier;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getOptlock() {
        return optlock;
    }

    public void setOptlock(Long optlock) {
        this.optlock = optlock;
    }
}
