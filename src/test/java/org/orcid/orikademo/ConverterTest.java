package org.orcid.orikademo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.orcid.orikademo.formatA.FormatA;
import org.orcid.orikademo.formatA.HobbyA;
import org.orcid.orikademo.formatB.FormatB;
import org.orcid.orikademo.formatB.InterestB;
import org.orcid.orikademo.formatB.InterestsB;

public class ConverterTest {

    private FormatA testA;
    private FormatB testB;

    @Before
    public void setUpTestData() throws DatatypeConfigurationException {
        // Set up some dummy data representing the same object in different
        // formats
        testA = new FormatA();
        testA.setName("Will Simpson");
        testA.setNickName("Bill");
        Calendar dateOfBirthA = new GregorianCalendar();
        dateOfBirthA.set(Calendar.DATE, 3);
        dateOfBirthA.set(Calendar.MONTH, Calendar.JUNE);
        dateOfBirthA.set(Calendar.YEAR, 1976);
        dateOfBirthA.set(Calendar.HOUR_OF_DAY, 0);
        dateOfBirthA.set(Calendar.MINUTE, 0);
        dateOfBirthA.set(Calendar.SECOND, 0);
        dateOfBirthA.set(Calendar.MILLISECOND, 0);
        testA.setDateOfBirth(dateOfBirthA.getTime());
        List<HobbyA> hobbies = new ArrayList<>();
        hobbies.add(new HobbyA("Tennis"));
        hobbies.add(new HobbyA("Gardening"));
        testA.setHobbies(hobbies);

        testB = new FormatB();
        testB.setName("Will Simpson");
        testB.setAlias("Bill");
        XMLGregorianCalendar dateOfBirthB = DatatypeFactory.newInstance().newXMLGregorianCalendar("1976-06-03");
        testB.setDateOfBirth(dateOfBirthB);
        InterestsB interests = new InterestsB();
        testB.setInterests(interests);
        interests.addInterest(new InterestB("Tennis"));
        interests.addInterest(new InterestB("Gardening"));
    }

    @Test
    public void testHardCodedConverter() {
        HardCodedConverter converter = new HardCodedConverter();

        System.out.println("Starting with:");
        System.out.println(testB);
        FormatA resultA = converter.convert(testB);
        System.out.println("Got:");
        System.out.println(resultA);

        assertEquals(testA.toString(), resultA.toString());
    }
    
    @Test
    public void testOrikaConverter() {
        OrikaConverter converter = new OrikaConverter();

        System.out.println("Starting with:");
        System.out.println(testB);
        FormatA resultA = converter.convert(testB);
        System.out.println("Got:");
        System.out.println(resultA);

        assertEquals(testA.toString(), resultA.toString());
    }
    
}
