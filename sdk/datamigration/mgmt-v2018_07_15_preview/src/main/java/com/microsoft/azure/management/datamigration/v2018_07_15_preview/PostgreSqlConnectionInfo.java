/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information for connecting to PostgreSQL server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("PostgreSqlConnectionInfo")
public class PostgreSqlConnectionInfo extends ConnectionInfo {
    /**
     * Name of the server.
     */
    @JsonProperty(value = "serverName", required = true)
    private String serverName;

    /**
     * Name of the database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * Port for Server.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /**
     * Get name of the server.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set name of the server.
     *
     * @param serverName the serverName value to set
     * @return the PostgreSqlConnectionInfo object itself.
     */
    public PostgreSqlConnectionInfo withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set name of the database.
     *
     * @param databaseName the databaseName value to set
     * @return the PostgreSqlConnectionInfo object itself.
     */
    public PostgreSqlConnectionInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get port for Server.
     *
     * @return the port value
     */
    public int port() {
        return this.port;
    }

    /**
     * Set port for Server.
     *
     * @param port the port value to set
     * @return the PostgreSqlConnectionInfo object itself.
     */
    public PostgreSqlConnectionInfo withPort(int port) {
        this.port = port;
        return this;
    }

}
