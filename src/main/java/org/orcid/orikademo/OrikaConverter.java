package org.orcid.orikademo;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

import org.orcid.orikademo.formatA.FormatA;
import org.orcid.orikademo.formatA.HobbyA;
import org.orcid.orikademo.formatB.FormatB;
import org.orcid.orikademo.formatB.InterestB;

public class OrikaConverter implements Converter {

    private MapperFacade mapperFacade;

    {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        ClassMapBuilder<FormatA, FormatB> classMap = mapperFactory.classMap(FormatA.class, FormatB.class);
        classMap.field("nickName", "alias");
        classMap.field("hobbies", "interests.listOfInterests");
        classMap.byDefault().register();
        mapperFactory.classMap(HobbyA.class, InterestB.class).field("title", "id").register();
        mapperFacade = mapperFactory.getMapperFacade();
    }

    public FormatA convert(FormatB source) {
        return mapperFacade.map(source, FormatA.class);
    }

    public FormatB convert(FormatA source) {
        return mapperFacade.map(source, FormatB.class);
    }

}
