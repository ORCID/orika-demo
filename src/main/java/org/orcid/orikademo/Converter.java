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
package org.orcid.orikademo;

import org.orcid.orikademo.formatA.FormatA;
import org.orcid.orikademo.formatB.FormatB;

public interface Converter {

    FormatA convert(FormatB source);

    FormatB convert(FormatA source);
}
