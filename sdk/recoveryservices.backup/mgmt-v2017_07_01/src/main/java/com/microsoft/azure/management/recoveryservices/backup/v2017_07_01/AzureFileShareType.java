/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AzureFileShareType.
 */
public final class AzureFileShareType extends ExpandableStringEnum<AzureFileShareType> {
    /** Static value Invalid for AzureFileShareType. */
    public static final AzureFileShareType INVALID = fromString("Invalid");

    /** Static value XSMB for AzureFileShareType. */
    public static final AzureFileShareType XSMB = fromString("XSMB");

    /** Static value XSync for AzureFileShareType. */
    public static final AzureFileShareType XSYNC = fromString("XSync");

    /**
     * Creates or finds a AzureFileShareType from its string representation.
     * @param name a name to look for
     * @return the corresponding AzureFileShareType
     */
    @JsonCreator
    public static AzureFileShareType fromString(String name) {
        return fromString(name, AzureFileShareType.class);
    }

    /**
     * @return known AzureFileShareType values
     */
    public static Collection<AzureFileShareType> values() {
        return values(AzureFileShareType.class);
    }
}
