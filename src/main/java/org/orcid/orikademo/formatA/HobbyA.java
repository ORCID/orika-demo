/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2015 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
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
