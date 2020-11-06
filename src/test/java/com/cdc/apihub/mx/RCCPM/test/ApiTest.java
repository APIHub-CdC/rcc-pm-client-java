package com.cdc.apihub.mx.RCCPM.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.cdc.apihub.mx.RCCPM.client.ApiClient;
import com.cdc.apihub.mx.RCCPM.client.ApiException;
import com.cdc.apihub.mx.RCCPM.client.ApiResponse;
import com.cdc.apihub.mx.RCCPM.client.api.RCCPMApi;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoEstados;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoPais;
import com.cdc.apihub.mx.RCCPM.client.model.Persona;
import com.cdc.apihub.mx.RCCPM.client.model.PersonaDomicilio;
import com.cdc.apihub.mx.RCCPM.client.model.PersonaPeticion;
import com.cdc.apihub.mx.RCCPM.client.model.ReporteRespuesta;
import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import okhttp3.OkHttpClient;

public class ApiTest {
    
    private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
    
    private final RCCPMApi api = new RCCPMApi();

    private ApiClient apiClient = null;

    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyAlias = "your_key_alias";
    private String keyPassword = "your_super_secure_password";
    
    private String usernameCDC = "your_username_otrorgante";
    private String passwordCDC = "your_password_otorgante"; 
    
    private String url = "the_url";
    private String xApiKey = "X_Api_Key";
    
    private SignerInterceptor interceptor;
    
    @Before()
    public void setUp() {
        interceptor = new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword);
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();
        apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void getReporteCreditoPMTest() throws ApiException {

        PersonaPeticion request = new PersonaPeticion();
        Persona persona = new Persona();
        PersonaDomicilio domicilio = new PersonaDomicilio();
        
        Integer estatusOK = 200;
        Integer estatusNoContent = 204;
        
        try {
            
            domicilio.setDireccion("AV. PASEO DE LA REFORMA 01");
            domicilio.setColoniaPoblacion("GUERRERO");
            domicilio.setDelegacionMunicipio("CUAUHTEMOC");
            domicilio.setCiudad("CIUDAD DE MÉXICO");
            domicilio.setEstado(CatalogoEstados.DF);
            domicilio.setCP("68370");
            domicilio.setPais(CatalogoPais.MX);

            persona.setRFC("EDC930121E01");
            persona.setNombre("RESTAURANTE SA DE CV");
            persona.setDomicilio(domicilio);

            request.setFolioOtorgante("1000001");
            request.setPersona(persona);
            
            ApiResponse<?> response = api.getReporteGenericCreditoPM(xApiKey, usernameCDC, passwordCDC, request);
  
            Assert.assertTrue(estatusOK.equals(response.getStatusCode()));
            
            if(estatusOK.equals(response.getStatusCode())) {
                ReporteRespuesta responseOK = (ReporteRespuesta) response.getData();
                logger.info("RCC-PM Test: "+responseOK.toString());
            }
            
        }catch (ApiException e) {
            if(!estatusNoContent.equals(e.getCode())) {
                logger.info("Error getReporteCreditoPMTest: "+e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));
        }        
    }
    
}