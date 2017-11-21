# TaxesApi

All URIs are relative to *https://api.facestore.local/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTaxes**](TaxesApi.md#addTaxes) | **POST** /taxes | 
[**deleteTaxById**](TaxesApi.md#deleteTaxById) | **DELETE** /taxes/{id}/ | 
[**getTaxById**](TaxesApi.md#getTaxById) | **GET** /taxes/{id}/ | 
[**getTaxes**](TaxesApi.md#getTaxes) | **GET** /taxes | 
[**updateTaxById**](TaxesApi.md#updateTaxById) | **PUT** /taxes/{id}/ | 
[**updateTaxById_0**](TaxesApi.md#updateTaxById_0) | **PATCH** /taxes/{id}/ | 


<a name="addTaxes"></a>
# **addTaxes**
> InlineResponse2012 addTaxes(tax)



Creates a new tax in the store.

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
Tax tax = new Tax(); // Tax | Tax to add to the store
try {
    InlineResponse2012 result = apiInstance.addTaxes(tax);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#addTaxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tax** | [**Tax**](Tax.md)| Tax to add to the store |

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTaxById"></a>
# **deleteTaxById**
> deleteTaxById(id)



deletes a single tax based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
Long id = 789L; // Long | ID of tax to delete
try {
    apiInstance.deleteTaxById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#deleteTaxById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of tax to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaxById"></a>
# **getTaxById**
> InlineResponse2012 getTaxById(id, limit)



Returns a tax based on a single ID

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
Long id = 789L; // Long | ID of tax to fetch
Integer limit = 56; // Integer | max records to return
try {
    InlineResponse2012 result = apiInstance.getTaxById(id, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#getTaxById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of tax to fetch |
 **limit** | **Integer**| max records to return | [optional]

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaxes"></a>
# **getTaxes**
> InlineResponse2002 getTaxes(includes, limit, orderBy)



Returns all taxes from the system that the user has access to

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Specify the field to be sorted, examples:  - `?order_by=id|desc` - `?order_by=updated_at|desc,position|asc` 
try {
    InlineResponse2002 result = apiInstance.getTaxes(includes, limit, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#getTaxes");
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

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaxById"></a>
# **updateTaxById**
> InlineResponse2012 updateTaxById(id, tax)



update a single tax based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
Long id = 789L; // Long | ID of tax to update
Tax tax = new Tax(); // Tax | Tax to add to the store
try {
    InlineResponse2012 result = apiInstance.updateTaxById(id, tax);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#updateTaxById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of tax to update |
 **tax** | [**Tax**](Tax.md)| Tax to add to the store |

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaxById_0"></a>
# **updateTaxById_0**
> InlineResponse2012 updateTaxById_0(id, tax)



update a single tax based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
Long id = 789L; // Long | ID of tax to update
Tax tax = new Tax(); // Tax | Tax to add to the store
try {
    InlineResponse2012 result = apiInstance.updateTaxById_0(id, tax);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#updateTaxById_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of tax to update |
 **tax** | [**Tax**](Tax.md)| Tax to add to the store |

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

