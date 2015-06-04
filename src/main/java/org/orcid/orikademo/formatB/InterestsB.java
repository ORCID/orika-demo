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
