# BrandsApi

All URIs are relative to *https://api.facestore.local/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBrands**](BrandsApi.md#addBrands) | **POST** /brands | 
[**deleteBrandById**](BrandsApi.md#deleteBrandById) | **DELETE** /brands/{id}/ | 
[**getBrandById**](BrandsApi.md#getBrandById) | **GET** /brands/{id}/ | 
[**getBrands**](BrandsApi.md#getBrands) | **GET** /brands | 
[**updateCategoryById**](BrandsApi.md#updateCategoryById) | **PUT** /brands/{id}/ | 
[**updateCategoryById_0**](BrandsApi.md#updateCategoryById_0) | **PATCH** /brands/{id}/ | 


<a name="addBrands"></a>
# **addBrands**
> InlineResponse201 addBrands(brand)



Creates a new brand in the store.

### Example
```java
// Import classes:
//import io.swagger.client.api.BrandsApi;

BrandsApi apiInstance = new BrandsApi();
Brand brand = new Brand(); // Brand | Brand to add to the store
try {
    InlineResponse201 result = apiInstance.addBrands(brand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandsApi#addBrands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | [**Brand**](Brand.md)| Brand to add to the store |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBrandById"></a>
# **deleteBrandById**
> deleteBrandById(id)



Deletes a single brand based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.BrandsApi;

BrandsApi apiInstance = new BrandsApi();
Long id = 789L; // Long | ID of brand to delete
try {
    apiInstance.deleteBrandById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandsApi#deleteBrandById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of brand to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBrandById"></a>
# **getBrandById**
> InlineResponse201 getBrandById(id, includes, limit)



Returns a brand based on a single ID  ### Includes You can give the following values on includea parameter: &#x60;routes, products&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.BrandsApi;

BrandsApi apiInstance = new BrandsApi();
Long id = 789L; // Long | ID of brand to fetch
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
try {
    InlineResponse201 result = apiInstance.getBrandById(id, includes, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandsApi#getBrandById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of brand to fetch |
 **includes** | [**List&lt;String&gt;**](String.md)| Include associated objects within response | [optional]
 **limit** | **Integer**| max records to return | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBrands"></a>
# **getBrands**
> InlineResponse200 getBrands(includes, limit, orderBy)



Returns all brands from the system that the user has access to  ### Includes You can give the following values on includes parameter: &#x60;routes, products&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.BrandsApi;

BrandsApi apiInstance = new BrandsApi();
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Specify the field to be sorted, examples:  - `?order_by=id|desc` - `?order_by=updated_at|desc,position|asc` 
try {
    InlineResponse200 result = apiInstance.getBrands(includes, limit, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandsApi#getBrands");
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

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCategoryById"></a>
# **updateCategoryById**
> updateCategoryById(id, brand)



Update a single brand based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.BrandsApi;

BrandsApi apiInstance = new BrandsApi();
Long id = 789L; // Long | ID of brand to update
Object brand = null; // Object | Brand to update in store
try {
    apiInstance.updateCategoryById(id, brand);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandsApi#updateCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of brand to update |
 **brand** | **Object**| Brand to update in store |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCategoryById_0"></a>
# **updateCategoryById_0**
> updateCategoryById_0(id, brand)



Update a single brand based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.BrandsApi;

BrandsApi apiInstance = new BrandsApi();
Long id = 789L; // Long | ID of brand to update
Object brand = null; // Object | Brand to update in store
try {
    apiInstance.updateCategoryById_0(id, brand);
} catch (ApiException e) {
    System.err.println("Exception when calling BrandsApi#updateCategoryById_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of brand to update |
 **brand** | **Object**| Brand to update in store |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

