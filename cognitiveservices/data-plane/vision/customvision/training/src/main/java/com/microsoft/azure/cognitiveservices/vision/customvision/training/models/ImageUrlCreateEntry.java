/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImageUrlCreateEntry model.
 */
public class ImageUrlCreateEntry {
    /**
     * The url property.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * The tagIds property.
     */
    @JsonProperty(value = "tagIds")
    private List<UUID> tagIds;

    /**
     * The regions property.
     */
    @JsonProperty(value = "regions")
    private List<Region> regions;

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the ImageUrlCreateEntry object itself.
     */
    public ImageUrlCreateEntry withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the tagIds value.
     *
     * @return the tagIds value
     */
    public List<UUID> tagIds() {
        return this.tagIds;
    }

    /**
     * Set the tagIds value.
     *
     * @param tagIds the tagIds value to set
     * @return the ImageUrlCreateEntry object itself.
     */
    public ImageUrlCreateEntry withTagIds(List<UUID> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    /**
     * Get the regions value.
     *
     * @return the regions value
     */
    public List<Region> regions() {
        return this.regions;
    }

    /**
     * Set the regions value.
     *
     * @param regions the regions value to set
     * @return the ImageUrlCreateEntry object itself.
     */
    public ImageUrlCreateEntry withRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }

}