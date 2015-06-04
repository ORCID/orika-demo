package org.orcid.orikademo;

import org.orcid.orikademo.formatA.FormatA;
import org.orcid.orikademo.formatB.FormatB;

public interface Converter {

    FormatA convert(FormatB source);

    FormatB convert(FormatA source);
}
