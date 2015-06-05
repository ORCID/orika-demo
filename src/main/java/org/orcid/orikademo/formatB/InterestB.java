package org.orcid.orikademo.formatB;

import javax.xml.bind.annotation.XmlElement;

public class InterestB {

    private String id;

    public InterestB(String id) {
        this.id = id;
    }

    @XmlElement
    public String getId() {
        return id;
    }

}
