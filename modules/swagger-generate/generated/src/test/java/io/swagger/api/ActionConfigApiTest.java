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

import io.swagger.model.ActionConfigItem;
import io.swagger.model.ActionConfigItemResult;
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
 * API tests for ActionConfigApi
 */
public class ActionConfigApiTest {


    private ActionConfigApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://virtserver.swaggerhub.com/binhthgc/opencps/1.0.0", ActionConfigApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Thêm định nghĩa thao tác xử lý hồ sơ
     *
     * Thêm định nghĩa thao tác xử lý hồ sơ
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addActionConfigTest() {
        ActionConfigItem body = null;
	//ActionConfigItem response = api.addActionConfig(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Xoá định nghĩa thao tác xử lý hồ sơ
     *
     * Xoá định nghĩa thao tác xử lý hồ sơ
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteActionConfigTest() {
        String id = null;
	//api.deleteActionConfig(id);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Lấy danh sách các định nghĩa thao tác theo id Hoặc actionCode
     *
     * Lấy danh sách các định nghĩa thao tác theo actionCode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionConfigByCodeTest() {
        String id = null;
	//ActionConfigItem response = api.getActionConfigByCode(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Lấy danh sách các định nghĩa thao tác
     *
     * Lấy danh sách các định nghĩa thao tác
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionConfigsElasticsearchTest() {
        String q = null;
	//ActionConfigItemResult response = api.getActionConfigsElasticsearch(q);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Cập nhật định nghĩa thao tác xử lý hồ sơ
     *
     * Cập nhật định nghĩa thao tác xử lý hồ sơ
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateActionConfigTest() {
        String id = null;
        ActionConfigItem body = null;
	//ActionConfigItem response = api.updateActionConfig(id, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
