package org.orcid.orikademo.formatA;

import javax.xml.bind.annotation.XmlElement;

public class HobbyA {

    private String title;

    public HobbyA() {
    }

    public HobbyA(String title) {
        this.title = title;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }

}
