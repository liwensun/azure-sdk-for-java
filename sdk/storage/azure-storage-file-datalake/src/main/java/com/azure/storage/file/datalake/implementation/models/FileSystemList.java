// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The FileSystemList model.
 */
@Fluent
public final class FileSystemList {
    /*
     * The filesystems property.
     */
    @JsonProperty(value = "filesystems")
    private List<FileSystem> filesystems;

    /**
     * Get the filesystems property: The filesystems property.
     *
     * @return the filesystems value.
     */
    public List<FileSystem> getFilesystems() {
        return this.filesystems;
    }

    /**
     * Set the filesystems property: The filesystems property.
     *
     * @param filesystems the filesystems value to set.
     * @return the FileSystemList object itself.
     */
    public FileSystemList setFilesystems(List<FileSystem> filesystems) {
        this.filesystems = filesystems;
        return this;
    }
}
