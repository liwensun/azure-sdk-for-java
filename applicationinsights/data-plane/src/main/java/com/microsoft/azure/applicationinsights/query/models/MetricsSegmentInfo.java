/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import java.util.Map;
import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A metric segment.
 */
public class MetricsSegmentInfo {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Start time of the metric segment (only when an interval was specified).
     */
    @JsonProperty(value = "start")
    private DateTime start;

    /**
     * Start time of the metric segment (only when an interval was specified).
     */
    @JsonProperty(value = "end")
    private DateTime end;

    /**
     * Segmented metric data (if further segmented).
     */
    @JsonProperty(value = "segments")
    private List<MetricsSegmentInfo> segments;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the MetricsSegmentInfo object itself.
     */
    public MetricsSegmentInfo withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get start time of the metric segment (only when an interval was specified).
     *
     * @return the start value
     */
    public DateTime start() {
        return this.start;
    }

    /**
     * Set start time of the metric segment (only when an interval was specified).
     *
     * @param start the start value to set
     * @return the MetricsSegmentInfo object itself.
     */
    public MetricsSegmentInfo withStart(DateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get start time of the metric segment (only when an interval was specified).
     *
     * @return the end value
     */
    public DateTime end() {
        return this.end;
    }

    /**
     * Set start time of the metric segment (only when an interval was specified).
     *
     * @param end the end value to set
     * @return the MetricsSegmentInfo object itself.
     */
    public MetricsSegmentInfo withEnd(DateTime end) {
        this.end = end;
        return this;
    }

    /**
     * Get segmented metric data (if further segmented).
     *
     * @return the segments value
     */
    public List<MetricsSegmentInfo> segments() {
        return this.segments;
    }

    /**
     * Set segmented metric data (if further segmented).
     *
     * @param segments the segments value to set
     * @return the MetricsSegmentInfo object itself.
     */
    public MetricsSegmentInfo withSegments(List<MetricsSegmentInfo> segments) {
        this.segments = segments;
        return this;
    }

}