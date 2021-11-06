package com.in0c3nc10.apicards.apicards.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cards {
    
    @Id
    private String id;
    private String name;
    private String lv;
    private String archetype;
    private String type;
    private String attribute;
    private String atk;
    private String def;

    public Cards(String id, String name, String lv, String archetype, String type, String attribute, String atk,
            String def) {
        this.id = id;
        this.name = name;
        this.lv = lv;
        this.archetype = archetype;
        this.type = type;
        this.attribute = attribute;
        this.atk = atk;
        this.def = def;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLv() {
        return lv;
    }
    public void setLv(String lv) {
        this.lv = lv;
    }
    public String getArchetype() {
        return archetype;
    }
    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    public String getAtk() {
        return atk;
    }
    public void setAtk(String atk) {
        this.atk = atk;
    }
    public String getDef() {
        return def;
    }
    public void setDef(String def) {
        this.def = def;
    }
}
