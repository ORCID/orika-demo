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

import java.util.ArrayList;
import java.util.List;

public class InterestsB {

    private List<InterestB> listOfInterests = new ArrayList<>();

    public List<InterestB> getListOfInterests() {
        return listOfInterests;
    }

    public void setListOfInterests(List<InterestB> listOfInterests) {
        this.listOfInterests = listOfInterests;
    }

    public void addInterest(InterestB interest) {
        listOfInterests.add(interest);
    }

}
