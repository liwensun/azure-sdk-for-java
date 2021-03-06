/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2017_10_01.Subnets;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2017_10_01.Subnet;

class SubnetsImpl extends WrapperImpl<SubnetsInner> implements Subnets {
    private final NetworkManager manager;

    SubnetsImpl(NetworkManager manager) {
        super(manager.inner().subnets());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public SubnetImpl define(String name) {
        return wrapModel(name);
    }

    private SubnetImpl wrapModel(SubnetInner inner) {
        return  new SubnetImpl(inner, manager());
    }

    private SubnetImpl wrapModel(String name) {
        return new SubnetImpl(name, this.manager());
    }

    @Override
    public Observable<Subnet> listAsync(final String resourceGroupName, final String virtualNetworkName) {
        SubnetsInner client = this.inner();
        return client.listAsync(resourceGroupName, virtualNetworkName)
        .flatMapIterable(new Func1<Page<SubnetInner>, Iterable<SubnetInner>>() {
            @Override
            public Iterable<SubnetInner> call(Page<SubnetInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SubnetInner, Subnet>() {
            @Override
            public Subnet call(SubnetInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Subnet> getAsync(String resourceGroupName, String virtualNetworkName, String subnetName) {
        SubnetsInner client = this.inner();
        return client.getAsync(resourceGroupName, virtualNetworkName, subnetName)
        .map(new Func1<SubnetInner, Subnet>() {
            @Override
            public Subnet call(SubnetInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String virtualNetworkName, String subnetName) {
        SubnetsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, virtualNetworkName, subnetName).toCompletable();
    }

}
