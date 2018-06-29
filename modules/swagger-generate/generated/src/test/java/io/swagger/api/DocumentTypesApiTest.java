/**
 * OpenCPS API
 * OpenCPS là phần mềm lõi dịch vụ công trực tuyến nguồn mở đầu tiên và duy nhất tại Việt Nam tính đến thời điểm này.
 *
 * OpenAPI spec version: 2.0.1
 * Contact: opencps@lists.opencps.vn
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import io.swagger.model.DocumentTypeInputModel;
import io.swagger.model.DocumentTypeModel;
import io.swagger.model.DocumentTypeResultModel;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * API tests for DocumentTypesApi
 */
public class DocumentTypesApiTest {


    private DocumentTypesApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://virtserver.swaggerhub.com/binhthgc/opencps/1.0.0", DocumentTypesApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Create DocumentType
     *
     * Insert record DocumentType in database
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDocumentTypeTest() {
        DocumentTypeInputModel input = null;
	//DocumentTypeModel response = api.createDocumentType(input);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get all list DocumentTypes
     *
     * Get all list DocumentTypes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDocumentTypesTest() {
        String keyword = null;
        Integer start = null;
        Integer end = null;
	//DocumentTypeResultModel response = api.getAllDocumentTypes(keyword, start, end);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get DocumentType by id or code
     *
     * Get DocumentType by id or code
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocByIdTest() {
        String id = null;
	//DocumentTypeModel response = api.getDocById(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Delete DocumentType by id
     *
     * Delete DocumentType by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeDocByIdTest() {
        String id = null;
	//DocumentTypeModel response = api.removeDocById(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update DocumentType by id
     *
     * Update DocumentType by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDocByIdTest() {
        String id = null;
        DocumentTypeInputModel input = null;
	//DocumentTypeModel response = api.updateDocById(id, input);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
