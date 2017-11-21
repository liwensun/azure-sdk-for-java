/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The contents of a shutdown notification. Webhooks can use this type to
 * deserialize the request body when they get notified of an imminent shutdown.
 */
public class ShutdownNotificationContent {
    /**
     * The URL to skip auto-shutdown.
     */
    @JsonProperty(value = "skipUrl")
    private String skipUrl;

    /**
     * The URL to delay shutdown by 60 minutes.
     */
    @JsonProperty(value = "delayUrl60")
    private String delayUrl60;

    /**
     * The URL to delay shutdown by 2 hours.
     */
    @JsonProperty(value = "delayUrl120")
    private String delayUrl120;

    /**
     * The virtual machine to be shut down.
     */
    @JsonProperty(value = "vmName")
    private String vmName;

    /**
     * The GUID for the virtual machine to be shut down.
     */
    @JsonProperty(value = "guid")
    private String guid;

    /**
     * The owner of the virtual machine.
     */
    @JsonProperty(value = "owner")
    private String owner;

    /**
     * The event for which a notification will be sent.
     */
    @JsonProperty(value = "eventType")
    private String eventType;

    /**
     * The text for the notification.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * The subscription ID for the schedule.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * The resource group name for the schedule.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /**
     * The lab for the schedule.
     */
    @JsonProperty(value = "labName")
    private String labName;

    /**
     * Get the skipUrl value.
     *
     * @return the skipUrl value
     */
    public String skipUrl() {
        return this.skipUrl;
    }

    /**
     * Set the skipUrl value.
     *
     * @param skipUrl the skipUrl value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withSkipUrl(String skipUrl) {
        this.skipUrl = skipUrl;
        return this;
    }

    /**
     * Get the delayUrl60 value.
     *
     * @return the delayUrl60 value
     */
    public String delayUrl60() {
        return this.delayUrl60;
    }

    /**
     * Set the delayUrl60 value.
     *
     * @param delayUrl60 the delayUrl60 value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withDelayUrl60(String delayUrl60) {
        this.delayUrl60 = delayUrl60;
        return this;
    }

    /**
     * Get the delayUrl120 value.
     *
     * @return the delayUrl120 value
     */
    public String delayUrl120() {
        return this.delayUrl120;
    }

    /**
     * Set the delayUrl120 value.
     *
     * @param delayUrl120 the delayUrl120 value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withDelayUrl120(String delayUrl120) {
        this.delayUrl120 = delayUrl120;
        return this;
    }

    /**
     * Get the vmName value.
     *
     * @return the vmName value
     */
    public String vmName() {
        return this.vmName;
    }

    /**
     * Set the vmName value.
     *
     * @param vmName the vmName value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withVmName(String vmName) {
        this.vmName = vmName;
        return this;
    }

    /**
     * Get the guid value.
     *
     * @return the guid value
     */
    public String guid() {
        return this.guid;
    }

    /**
     * Set the guid value.
     *
     * @param guid the guid value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get the owner value.
     *
     * @return the owner value
     */
    public String owner() {
        return this.owner;
    }

    /**
     * Set the owner value.
     *
     * @param owner the owner value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the eventType value.
     *
     * @return the eventType value
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Set the eventType value.
     *
     * @param eventType the eventType value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName value.
     *
     * @return the resourceGroupName value
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName value.
     *
     * @param resourceGroupName the resourceGroupName value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the labName value.
     *
     * @return the labName value
     */
    public String labName() {
        return this.labName;
    }

    /**
     * Set the labName value.
     *
     * @param labName the labName value to set
     * @return the ShutdownNotificationContent object itself.
     */
    public ShutdownNotificationContent withLabName(String labName) {
        this.labName = labName;
        return this;
    }

}