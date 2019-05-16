/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.VnetGatewayInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.AppServiceManager;

/**
 * Type representing VnetGateway.
 */
public interface VnetGateway extends HasInner<VnetGatewayInner>, Indexable, Refreshable<VnetGateway>, Updatable<VnetGateway.Update>, HasManager<AppServiceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vnetName value.
     */
    String vnetName();

    /**
     * @return the vpnPackageUri value.
     */
    String vpnPackageUri();

    /**
     * The entirety of the VnetGateway definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualNetworkConnection, DefinitionStages.WithVpnPackageUri, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VnetGateway definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VnetGateway definition.
         */
        interface Blank extends WithVirtualNetworkConnection {
        }

        /**
         * The stage of the vnetgateway definition allowing to specify VirtualNetworkConnection.
         */
        interface WithVirtualNetworkConnection {
           /**
            * Specifies resourceGroupName, name, vnetName, slot.
            */
            WithVpnPackageUri withExistingVirtualNetworkConnection(String resourceGroupName, String name, String vnetName, String slot);
        }

        /**
         * The stage of the vnetgateway definition allowing to specify VpnPackageUri.
         */
        interface WithVpnPackageUri {
           /**
            * Specifies vpnPackageUri.
            */
            WithCreate withVpnPackageUri(String vpnPackageUri);
        }

        /**
         * The stage of the vnetgateway definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the vnetgateway definition allowing to specify VnetName.
         */
        interface WithVnetName {
            /**
             * Specifies vnetName.
             */
            WithCreate withVnetName(String vnetName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VnetGateway>, DefinitionStages.WithKind, DefinitionStages.WithVnetName {
        }
    }
    /**
     * The template for a VnetGateway update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VnetGateway>, UpdateStages.WithKind, UpdateStages.WithVnetName {
    }

    /**
     * Grouping of VnetGateway update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vnetgateway update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the vnetgateway update allowing to specify VnetName.
         */
        interface WithVnetName {
            /**
             * Specifies vnetName.
             */
            Update withVnetName(String vnetName);
        }

    }
}