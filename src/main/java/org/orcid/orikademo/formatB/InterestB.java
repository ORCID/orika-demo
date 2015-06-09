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
