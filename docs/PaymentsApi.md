# PaymentsApi

All URIs are relative to *https://api.facestore.local/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentById**](PaymentsApi.md#getPaymentById) | **GET** /payments/{id}/ | 
[**getPayments**](PaymentsApi.md#getPayments) | **GET** /payments | 


<a name="getPaymentById"></a>
# **getPaymentById**
> InlineResponse2005 getPaymentById(id)



Returns all payments from the system that the user has access to 

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsApi;

PaymentsApi apiInstance = new PaymentsApi();
Long id = 789L; // Long | ID of payment
try {
    InlineResponse2005 result = apiInstance.getPaymentById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPaymentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of payment |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayments"></a>
# **getPayments**
> InlineResponse2004 getPayments(includes, limit, orderBy)



Returns all payments from the system that the user has access to 

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentsApi;

PaymentsApi apiInstance = new PaymentsApi();
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Specify the field to be sorted, examples:  - `?order_by=id|desc` - `?order_by=updated_at|desc,position|asc` 
try {
    InlineResponse2004 result = apiInstance.getPayments(includes, limit, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includes** | [**List&lt;String&gt;**](String.md)| Include associated objects within response | [optional]
 **limit** | **Integer**| max records to return | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Specify the field to be sorted, examples:  - &#x60;?order_by&#x3D;id|desc&#x60; - &#x60;?order_by&#x3D;updated_at|desc,position|asc&#x60;  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

