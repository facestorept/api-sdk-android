# CustomersApi

All URIs are relative to *https://api.facestore.local/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomerById**](CustomersApi.md#getCustomerById) | **GET** /customers/{id}/ | 
[**getCustomers**](CustomersApi.md#getCustomers) | **GET** /customers | 


<a name="getCustomerById"></a>
# **getCustomerById**
> List&lt;Customer&gt; getCustomerById(id, includes)



Returns all customers from the system that the user has access to  ### Includes You can give the following values on includes parameter: &#x60;orders, groups&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomersApi;

CustomersApi apiInstance = new CustomersApi();
Long id = 789L; // Long | ID of customer
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
try {
    List<Customer> result = apiInstance.getCustomerById(id, includes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of customer |
 **includes** | [**List&lt;String&gt;**](String.md)| Include associated objects within response | [optional]

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomers"></a>
# **getCustomers**
> List&lt;Customer&gt; getCustomers(includes, limit, orderBy)



Returns all customers from the system that the user has access to  ### Includes You can give the following values on includes parameter: &#x60;orders, groups&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomersApi;

CustomersApi apiInstance = new CustomersApi();
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Specify the field to be sorted, examples:  - `?order_by=id|desc` - `?order_by=updated_at|desc,position|asc` 
try {
    List<Customer> result = apiInstance.getCustomers(includes, limit, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomers");
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

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

