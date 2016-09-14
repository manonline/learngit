package com.otms.newcomer.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

// @Entity : Entity no needed, since it's already a Embeddable. Otherwise an ID field would be required;
@Embeddable
public class Client {
    
    private String clientName;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
