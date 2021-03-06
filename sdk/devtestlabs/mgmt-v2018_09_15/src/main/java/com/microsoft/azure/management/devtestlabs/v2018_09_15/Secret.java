/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.SecretInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.DevTestLabsManager;
import java.util.Map;

/**
 * Type representing Secret.
 */
public interface Secret extends HasInner<SecretInner>, Indexable, Refreshable<Secret>, Updatable<Secret.Update>, HasManager<DevTestLabsManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * @return the value value.
     */
    String value();

    /**
     * The entirety of the Secret definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithUser, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Secret definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Secret definition.
         */
        interface Blank extends WithUser {
        }

        /**
         * The stage of the secret definition allowing to specify User.
         */
        interface WithUser {
           /**
            * Specifies resourceGroupName, labName, userName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @param userName The name of the user profile
            * @return the next definition stage
            */
            WithCreate withExistingUser(String resourceGroupName, String labName, String userName);
        }

        /**
         * The stage of the secret definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the secret definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the secret definition allowing to specify Value.
         */
        interface WithValue {
            /**
             * Specifies value.
             * @param value The value of the secret for secret creation
             * @return the next definition stage
             */
            WithCreate withValue(String value);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Secret>, DefinitionStages.WithLocation, DefinitionStages.WithTags, DefinitionStages.WithValue {
        }
    }
    /**
     * The template for a Secret update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Secret>, UpdateStages.WithTags, UpdateStages.WithValue {
    }

    /**
     * Grouping of Secret update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the secret update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the secret update allowing to specify Value.
         */
        interface WithValue {
            /**
             * Specifies value.
             * @param value The value of the secret for secret creation
             * @return the next update stage
             */
            Update withValue(String value);
        }

    }
}
