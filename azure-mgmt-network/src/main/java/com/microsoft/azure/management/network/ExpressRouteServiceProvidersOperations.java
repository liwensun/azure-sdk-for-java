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

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.network.models.ExpressRouteServiceProvider;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in ExpressRouteServiceProvidersOperations.
 */
public interface ExpressRouteServiceProvidersOperations {
    /**
     * The interface defining all the services for ExpressRouteServiceProvidersOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExpressRouteServiceProvidersService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/expressRouteServiceProviders")
        Call<ResponseBody> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The List ExpressRouteServiceProvider opertion retrieves all the available ExpressRouteServiceProviders.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ExpressRouteServiceProvider&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteServiceProvider>> list() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteServiceProvider opertion retrieves all the available ExpressRouteServiceProviders.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(final ServiceCallback<PageImpl<ExpressRouteServiceProvider>> serviceCallback);

    /**
     * The List ExpressRouteServiceProvider opertion retrieves all the available ExpressRouteServiceProviders.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ExpressRouteServiceProvider&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteServiceProvider>> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteServiceProvider opertion retrieves all the available ExpressRouteServiceProviders.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<ExpressRouteServiceProvider>> serviceCallback);

}
