/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.TriggerInner;

/**
 * Trigger details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("FileEvent")
@JsonFlatten
public class FileEventTrigger extends TriggerInner {
    /**
     * File event source details.
     */
    @JsonProperty(value = "properties.sourceInfo", required = true)
    private FileSourceInfo sourceInfo;

    /**
     * Role sink info.
     */
    @JsonProperty(value = "properties.sinkInfo", required = true)
    private RoleSinkInfo sinkInfo;

    /**
     * A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain
     * specific IoT modules in the device, the tag can be the name or the image
     * URL of the module.
     */
    @JsonProperty(value = "properties.customContextTag")
    private String customContextTag;

    /**
     * Get file event source details.
     *
     * @return the sourceInfo value
     */
    public FileSourceInfo sourceInfo() {
        return this.sourceInfo;
    }

    /**
     * Set file event source details.
     *
     * @param sourceInfo the sourceInfo value to set
     * @return the FileEventTrigger object itself.
     */
    public FileEventTrigger withSourceInfo(FileSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * Get role sink info.
     *
     * @return the sinkInfo value
     */
    public RoleSinkInfo sinkInfo() {
        return this.sinkInfo;
    }

    /**
     * Set role sink info.
     *
     * @param sinkInfo the sinkInfo value to set
     * @return the FileEventTrigger object itself.
     */
    public FileEventTrigger withSinkInfo(RoleSinkInfo sinkInfo) {
        this.sinkInfo = sinkInfo;
        return this;
    }

    /**
     * Get a custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of the module.
     *
     * @return the customContextTag value
     */
    public String customContextTag() {
        return this.customContextTag;
    }

    /**
     * Set a custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of the module.
     *
     * @param customContextTag the customContextTag value to set
     * @return the FileEventTrigger object itself.
     */
    public FileEventTrigger withCustomContextTag(String customContextTag) {
        this.customContextTag = customContextTag;
        return this;
    }

}