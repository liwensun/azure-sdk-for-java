/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.CustomHeaderInterceptor;
import com.microsoft.azure.management.network.models.DnsNameAvailabilityResult;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.UUID;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the NetworkManagementClient class.
 */
public final class NetworkManagementClientImpl extends AzureServiceClient implements NetworkManagementClient {
    /** The Retrofit service to perform REST calls. */
    private NetworkManagementClientService service;
    /** The URI used as the base for all cloud service requests. */
    private final String baseUri;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets Azure subscription credentials. */
    private ServiceClientCredentials credentials;

    /**
     * Gets Gets Azure subscription credentials.
     *
     * @return the credentials value.
     */
    public ServiceClientCredentials getCredentials() {
        return this.credentials;
    }

    /** Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    public void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean getGenerateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     */
    public void setGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
    }

    /**
     * Gets the ApplicationGatewaysOperations object to access its operations.
     * @return the applicationGateways value.
     */
    public ApplicationGatewaysOperations getApplicationGateways() {
        return new ApplicationGatewaysOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ExpressRouteCircuitAuthorizationsOperations object to access its operations.
     * @return the expressRouteCircuitAuthorizations value.
     */
    public ExpressRouteCircuitAuthorizationsOperations getExpressRouteCircuitAuthorizations() {
        return new ExpressRouteCircuitAuthorizationsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ExpressRouteCircuitPeeringsOperations object to access its operations.
     * @return the expressRouteCircuitPeerings value.
     */
    public ExpressRouteCircuitPeeringsOperations getExpressRouteCircuitPeerings() {
        return new ExpressRouteCircuitPeeringsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ExpressRouteCircuitsOperations object to access its operations.
     * @return the expressRouteCircuits value.
     */
    public ExpressRouteCircuitsOperations getExpressRouteCircuits() {
        return new ExpressRouteCircuitsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ExpressRouteServiceProvidersOperations object to access its operations.
     * @return the expressRouteServiceProviders value.
     */
    public ExpressRouteServiceProvidersOperations getExpressRouteServiceProviders() {
        return new ExpressRouteServiceProvidersOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the LoadBalancersOperations object to access its operations.
     * @return the loadBalancers value.
     */
    public LoadBalancersOperations getLoadBalancers() {
        return new LoadBalancersOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the LocalNetworkGatewaysOperations object to access its operations.
     * @return the localNetworkGateways value.
     */
    public LocalNetworkGatewaysOperations getLocalNetworkGateways() {
        return new LocalNetworkGatewaysOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the NetworkInterfacesOperations object to access its operations.
     * @return the networkInterfaces value.
     */
    public NetworkInterfacesOperations getNetworkInterfaces() {
        return new NetworkInterfacesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the NetworkSecurityGroupsOperations object to access its operations.
     * @return the networkSecurityGroups value.
     */
    public NetworkSecurityGroupsOperations getNetworkSecurityGroups() {
        return new NetworkSecurityGroupsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the PublicIPAddressesOperations object to access its operations.
     * @return the publicIPAddresses value.
     */
    public PublicIPAddressesOperations getPublicIPAddresses() {
        return new PublicIPAddressesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the RouteTablesOperations object to access its operations.
     * @return the routeTables value.
     */
    public RouteTablesOperations getRouteTables() {
        return new RouteTablesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the RoutesOperations object to access its operations.
     * @return the routes value.
     */
    public RoutesOperations getRoutes() {
        return new RoutesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the SecurityRulesOperations object to access its operations.
     * @return the securityRules value.
     */
    public SecurityRulesOperations getSecurityRules() {
        return new SecurityRulesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the SubnetsOperations object to access its operations.
     * @return the subnets value.
     */
    public SubnetsOperations getSubnets() {
        return new SubnetsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the UsagesOperations object to access its operations.
     * @return the usages value.
     */
    public UsagesOperations getUsages() {
        return new UsagesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the VirtualNetworkGatewayConnectionsOperations object to access its operations.
     * @return the virtualNetworkGatewayConnections value.
     */
    public VirtualNetworkGatewayConnectionsOperations getVirtualNetworkGatewayConnections() {
        return new VirtualNetworkGatewayConnectionsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the VirtualNetworkGatewaysOperations object to access its operations.
     * @return the virtualNetworkGateways value.
     */
    public VirtualNetworkGatewaysOperations getVirtualNetworkGateways() {
        return new VirtualNetworkGatewaysOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the VirtualNetworksOperations object to access its operations.
     * @return the virtualNetworks value.
     */
    public VirtualNetworksOperations getVirtualNetworks() {
        return new VirtualNetworksOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     */
    public NetworkManagementClientImpl() {
        this("https://management.azure.com");
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param baseUri the base URI of the host
     */
    public NetworkManagementClientImpl(String baseUri) {
        this(baseUri, null);
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public NetworkManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     */
    public NetworkManagementClientImpl(String baseUri, ServiceClientCredentials credentials) {
        super();
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public NetworkManagementClientImpl(String baseUri, ServiceClientCredentials credentials, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    private void initialize() {
        this.apiVersion = "2015-06-15";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.getClientInterceptors().add(new CustomHeaderInterceptor("x-ms-client-request-id", UUID.randomUUID().toString()));
        if (this.credentials != null) {
            this.credentials.applyCredentialsFilter(this.client);
        }
        this.azureClient = new AzureClient(client, retrofitBuilder);
        this.azureClient.setCredentials(this.credentials);
        this.retrofitBuilder.baseUrl(baseUri);
        service = this.retrofitBuilder.build().create(NetworkManagementClientService.class);
    }

    /**
     * Checks whether a domain name in the cloudapp.net zone is available for use.
     *
     * @param location The location of the domain name
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression: ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DnsNameAvailabilityResult object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DnsNameAvailabilityResult> checkDnsNameAvailability(String location, String domainNameLabel) throws CloudException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null.");
        }
        if (this.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.checkDnsNameAvailability(location, this.getSubscriptionId(), domainNameLabel, this.getApiVersion(), this.getAcceptLanguage());
        return checkDnsNameAvailabilityDelegate(call.execute(), null);
    }

    /**
     * Checks whether a domain name in the cloudapp.net zone is available for use.
     *
     * @param location The location of the domain name
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression: ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> checkDnsNameAvailabilityAsync(String location, String domainNameLabel, final ServiceCallback<DnsNameAvailabilityResult> serviceCallback) {
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (this.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.checkDnsNameAvailability(location, this.getSubscriptionId(), domainNameLabel, this.getApiVersion(), this.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<DnsNameAvailabilityResult>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(checkDnsNameAvailabilityDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<DnsNameAvailabilityResult> checkDnsNameAvailabilityDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DnsNameAvailabilityResult, CloudException>()
                .register(200, new TypeToken<DnsNameAvailabilityResult>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

}
