package org.orcid.orikademo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.orcid.orikademo.formatA.FormatA;
import org.orcid.orikademo.formatA.HobbyA;
import org.orcid.orikademo.formatB.FormatB;
import org.orcid.orikademo.formatB.InterestB;
import org.orcid.orikademo.formatB.InterestsB;

public class HardCodedConverter implements Converter {

    public FormatA convert(FormatB source) {
        if (source == null) {
            return null;
        }
        FormatA formatA = new FormatA();
        formatA.setName(source.getName());
        formatA.setNickName(source.getAlias());
        XMLGregorianCalendar sourceDate = source.getDateOfBirth();
        if (sourceDate != null) {
            formatA.setDateOfBirth(sourceDate.toGregorianCalendar().getTime());
        }
        InterestsB sourceInterests = source.getInterests();
        if (sourceInterests != null) {
            List<HobbyA> hobbies = new ArrayList<>();
            formatA.setHobbies(hobbies);
            for (InterestB sourceInterest : sourceInterests.getListOfInterests()) {
                hobbies.add(new HobbyA(sourceInterest.getId()));
            }
        }
        return formatA;
    }

    public FormatB convert(FormatA source) {
        // TODO More work needed to convert the other way!
        return null;
    }

}
