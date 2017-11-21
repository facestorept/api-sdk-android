# ShippingsApi

All URIs are relative to *https://api.facestore.local/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addShipping**](ShippingsApi.md#addShipping) | **POST** /shippings | 
[**deleteShippingById**](ShippingsApi.md#deleteShippingById) | **DELETE** /shippings/{id}/ | 
[**getShippingById**](ShippingsApi.md#getShippingById) | **GET** /shippings/{id}/ | 
[**getShippings**](ShippingsApi.md#getShippings) | **GET** /shippings | 
[**updateShippingById**](ShippingsApi.md#updateShippingById) | **PUT** /shippings/{id}/ | 
[**updateShippingById_0**](ShippingsApi.md#updateShippingById_0) | **PATCH** /shippings/{id}/ | 


<a name="addShipping"></a>
# **addShipping**
> InlineResponse2013 addShipping(shipping)



Creates a new shipping in the store.

### Example
```java
// Import classes:
//import io.swagger.client.api.ShippingsApi;

ShippingsApi apiInstance = new ShippingsApi();
Shipping shipping = new Shipping(); // Shipping | Shipping to add to the store
try {
    InlineResponse2013 result = apiInstance.addShipping(shipping);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingsApi#addShipping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipping** | [**Shipping**](Shipping.md)| Shipping to add to the store |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteShippingById"></a>
# **deleteShippingById**
> deleteShippingById(id)



deletes a single shipping based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.ShippingsApi;

ShippingsApi apiInstance = new ShippingsApi();
Long id = 789L; // Long | ID of shipping to delete
try {
    apiInstance.deleteShippingById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingsApi#deleteShippingById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of shipping to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShippingById"></a>
# **getShippingById**
> InlineResponse2013 getShippingById(id, limit)



Returns a shipping based on a single ID

### Example
```java
// Import classes:
//import io.swagger.client.api.ShippingsApi;

ShippingsApi apiInstance = new ShippingsApi();
Long id = 789L; // Long | ID of shipping to fetch
Integer limit = 56; // Integer | max records to return
try {
    InlineResponse2013 result = apiInstance.getShippingById(id, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingsApi#getShippingById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of shipping to fetch |
 **limit** | **Integer**| max records to return | [optional]

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShippings"></a>
# **getShippings**
> InlineResponse2003 getShippings(includes, limit, orderBy)



Returns all shippings from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.api.ShippingsApi;

ShippingsApi apiInstance = new ShippingsApi();
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Specify the field to be sorted, examples:  - `?order_by=id|desc` - `?order_by=updated_at|desc,position|asc` 
try {
    InlineResponse2003 result = apiInstance.getShippings(includes, limit, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingsApi#getShippings");
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

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateShippingById"></a>
# **updateShippingById**
> InlineResponse2013 updateShippingById(id, tax)



update a single shipping based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.ShippingsApi;

ShippingsApi apiInstance = new ShippingsApi();
Long id = 789L; // Long | ID of shipping to update
Shipping tax = new Shipping(); // Shipping | Shipping to update in store
try {
    InlineResponse2013 result = apiInstance.updateShippingById(id, tax);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingsApi#updateShippingById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of shipping to update |
 **tax** | [**Shipping**](Shipping.md)| Shipping to update in store |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateShippingById_0"></a>
# **updateShippingById_0**
> InlineResponse2013 updateShippingById_0(id, tax)



update a single shipping based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.ShippingsApi;

ShippingsApi apiInstance = new ShippingsApi();
Long id = 789L; // Long | ID of shipping to update
Shipping tax = new Shipping(); // Shipping | Shipping to update in store
try {
    InlineResponse2013 result = apiInstance.updateShippingById_0(id, tax);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingsApi#updateShippingById_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of shipping to update |
 **tax** | [**Shipping**](Shipping.md)| Shipping to update in store |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

