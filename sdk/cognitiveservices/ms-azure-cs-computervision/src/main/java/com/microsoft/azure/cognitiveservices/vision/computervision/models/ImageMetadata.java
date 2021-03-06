/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image metadata.
 */
public class ImageMetadata {
    /**
     * Image width.
     */
    @JsonProperty(value = "width")
    private int width;

    /**
     * Image height.
     */
    @JsonProperty(value = "height")
    private int height;

    /**
     * Image format.
     */
    @JsonProperty(value = "format")
    private String format;

    /**
     * Get the width value.
     *
     * @return the width value
     */
    public int width() {
        return this.width;
    }

    /**
     * Set the width value.
     *
     * @param width the width value to set
     * @return the ImageMetadata object itself.
     */
    public ImageMetadata withWidth(int width) {
        this.width = width;
        return this;
    }

    /**
     * Get the height value.
     *
     * @return the height value
     */
    public int height() {
        return this.height;
    }

    /**
     * Set the height value.
     *
     * @param height the height value to set
     * @return the ImageMetadata object itself.
     */
    public ImageMetadata withHeight(int height) {
        this.height = height;
        return this;
    }

    /**
     * Get the format value.
     *
     * @return the format value
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format value.
     *
     * @param format the format value to set
     * @return the ImageMetadata object itself.
     */
    public ImageMetadata withFormat(String format) {
        this.format = format;
        return this;
    }

}
