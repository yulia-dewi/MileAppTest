<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>login with wrong username and wrong password</description>
   <name>POST login failed - blank username</name>
   <tag></tag>
   <elementGuidId>60cbe424-335c-41ef-b74f-db0cbf86f5b2</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;org_name\&quot;: \&quot;testonboard\&quot;,\n  \&quot;task\&quot;: false,\n  \&quot;locations\&quot;: false,\n  \&quot;permissions\&quot;: false,\n  \&quot;organization_data\&quot;: false,\n  \&quot;permissions-new\&quot;: false,\n  \&quot;user\&quot;: {\n    \&quot;email\&quot;: \&quot;\&quot;,\n    \&quot;password\&quot;: \&quot;ab12788\&quot;,\n    \&quot;fcmToken\&quot;: null\n  }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>8a3a4964-0c27-4742-ac15-48572bfeca2d</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://apidev.mile.app/v1/login</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

assertThat(response.getStatusCode()).isEqualTo(400)

WS.verifyElementPropertyValue(response, 'status', false)
WS.verifyElementPropertyValue(response, 'message', &quot;The user.email field is required.&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
