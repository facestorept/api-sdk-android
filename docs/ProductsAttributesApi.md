# ProductsAttributesApi

All URIs are relative to *https://api.facestore.local/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductsAttributes**](ProductsAttributesApi.md#addProductsAttributes) | **POST** /attributes | 
[**deleteProductAttributeById**](ProductsAttributesApi.md#deleteProductAttributeById) | **DELETE** /attributes/{id}/ | 
[**getProductAttributeById**](ProductsAttributesApi.md#getProductAttributeById) | **GET** /attributes/{id}/ | 
[**getProductsAttributes**](ProductsAttributesApi.md#getProductsAttributes) | **GET** /attributes | 
[**updateProductAttributeById**](ProductsAttributesApi.md#updateProductAttributeById) | **PUT** /attributes/{id}/ | 


<a name="addProductsAttributes"></a>
# **addProductsAttributes**
> List&lt;Attribute&gt; addProductsAttributes(attribute)



Creates a new attribute of products in the store.

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsAttributesApi;

ProductsAttributesApi apiInstance = new ProductsAttributesApi();
Attribute attribute = new Attribute(); // Attribute | Attribute to add to the store
try {
    List<Attribute> result = apiInstance.addProductsAttributes(attribute);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsAttributesApi#addProductsAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attribute** | [**Attribute**](Attribute.md)| Attribute to add to the store |

### Return type

[**List&lt;Attribute&gt;**](Attribute.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProductAttributeById"></a>
# **deleteProductAttributeById**
> deleteProductAttributeById(id)



deletes a single attribute of products based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsAttributesApi;

ProductsAttributesApi apiInstance = new ProductsAttributesApi();
Long id = 789L; // Long | ID of attribute to delete
try {
    apiInstance.deleteProductAttributeById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsAttributesApi#deleteProductAttributeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of attribute to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductAttributeById"></a>
# **getProductAttributeById**
> Attribute getProductAttributeById(id, includes)



Returns a attribute of products based on a single ID  ### Includes You can give the following values on includes parameter: &#x60;options&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsAttributesApi;

ProductsAttributesApi apiInstance = new ProductsAttributesApi();
Long id = 789L; // Long | ID of attribute to fetch
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
try {
    Attribute result = apiInstance.getProductAttributeById(id, includes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsAttributesApi#getProductAttributeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of attribute to fetch |
 **includes** | [**List&lt;String&gt;**](String.md)| Include associated objects within response | [optional]

### Return type

[**Attribute**](Attribute.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductsAttributes"></a>
# **getProductsAttributes**
> List&lt;Attribute&gt; getProductsAttributes(includes, limit, orderBy)



Returns all attributes of products from the system that the user has access to  ### Includes You can give the following values on includes parameter: &#x60;options&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsAttributesApi;

ProductsAttributesApi apiInstance = new ProductsAttributesApi();
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Specify the field to be sorted, examples:  - `?order_by=id|desc` - `?order_by=updated_at|desc,position|asc` 
try {
    List<Attribute> result = apiInstance.getProductsAttributes(includes, limit, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsAttributesApi#getProductsAttributes");
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

[**List&lt;Attribute&gt;**](Attribute.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProductAttributeById"></a>
# **updateProductAttributeById**
> Attribute updateProductAttributeById(id, productAttribute)



update a single attribute of products based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsAttributesApi;

ProductsAttributesApi apiInstance = new ProductsAttributesApi();
Long id = 789L; // Long | ID of attribute to update
Attribute productAttribute = new Attribute(); // Attribute | Attribute to add to the store
try {
    Attribute result = apiInstance.updateProductAttributeById(id, productAttribute);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsAttributesApi#updateProductAttributeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of attribute to update |
 **productAttribute** | [**Attribute**](Attribute.md)| Attribute to add to the store |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

