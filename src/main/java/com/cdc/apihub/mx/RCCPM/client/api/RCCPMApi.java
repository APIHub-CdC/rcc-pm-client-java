package com.cdc.apihub.mx.RCCPM.client.api;

import com.cdc.apihub.mx.RCCPM.client.ApiClient;
import com.cdc.apihub.mx.RCCPM.client.ApiException;
import com.cdc.apihub.mx.RCCPM.client.ApiResponse;
import com.cdc.apihub.mx.RCCPM.client.Configuration;
import com.cdc.apihub.mx.RCCPM.client.Pair;
import com.cdc.apihub.mx.RCCPM.client.ProgressRequestBody;
import com.cdc.apihub.mx.RCCPM.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.cdc.apihub.mx.RCCPM.client.model.PersonaPeticion;
import com.cdc.apihub.mx.RCCPM.client.model.ReporteRespuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RCCPMApi {
    private ApiClient apiClient;
    public RCCPMApi() {
        this(Configuration.getDefaultApiClient());
    }
    public RCCPMApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call getReporteCreditoPMCall(String xApiKey, String username, String password, PersonaPeticion body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    private okhttp3.Call getReporteCreditoPMValidateBeforeCall(String xApiKey, String username, String password, PersonaPeticion body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getReporteCreditoPM(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getReporteCreditoPM(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getReporteCreditoPM(Async)");
        }
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getReporteCreditoPM(Async)");
        }
        
        okhttp3.Call call = getReporteCreditoPMCall(xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;
    }
    
    public ReporteRespuesta getReporteCreditoPM(String xApiKey, String username, String password, PersonaPeticion body) throws ApiException {
        ApiResponse<ReporteRespuesta> resp = getReporteCreditoPMWithHttpInfo(xApiKey, username, password, body);
        return resp.getData();
    }
    
    public ApiResponse<?> getReporteGenericCreditoPM(String xApiKey, String username, String password, PersonaPeticion body) throws ApiException {
        ApiResponse<?> resp = getReporteCreditoPMWithHttpInfo(xApiKey, username, password, body);
        return resp;
    }    
    
    public ApiResponse<ReporteRespuesta> getReporteCreditoPMWithHttpInfo(String xApiKey, String username, String password, PersonaPeticion body) throws ApiException {
        okhttp3.Call call = getReporteCreditoPMValidateBeforeCall(xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ReporteRespuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
