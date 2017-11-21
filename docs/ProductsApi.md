# ProductsApi

All URIs are relative to *https://api.facestore.local/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](ProductsApi.md#addProduct) | **POST** /products | 
[**deleteProductById**](ProductsApi.md#deleteProductById) | **DELETE** /products/{id}/ | 
[**getProductById**](ProductsApi.md#getProductById) | **GET** /products/{id}/ | 
[**getProducts**](ProductsApi.md#getProducts) | **GET** /products | 
[**updateProductById**](ProductsApi.md#updateProductById) | **PUT** /products/{id}/ | 
[**updateProductById_0**](ProductsApi.md#updateProductById_0) | **PATCH** /products/{id}/ | 


<a name="addProduct"></a>
# **addProduct**
> InlineResponse2014 addProduct(product)



Creates a new product in the store.

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsApi;

ProductsApi apiInstance = new ProductsApi();
Product product = new Product(); // Product | Product to add to the store
try {
    InlineResponse2014 result = apiInstance.addProduct(product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#addProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)| Product to add to the store |

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProductById"></a>
# **deleteProductById**
> deleteProductById(id)



deletes a single product based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsApi;

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | ID of product to delete
try {
    apiInstance.deleteProductById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#deleteProductById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductById"></a>
# **getProductById**
> InlineResponse2014 getProductById(id, includes, limit)



Returns a product based on a single ID  ### Includes You can give the following values on includes parameter: &#x60;brands, categories, routes, stocks&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsApi;

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | ID of product to fetch
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
try {
    InlineResponse2014 result = apiInstance.getProductById(id, includes, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProductById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product to fetch |
 **includes** | [**List&lt;String&gt;**](String.md)| Include associated objects within response | [optional]
 **limit** | **Integer**| max records to return | [optional]

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProducts"></a>
# **getProducts**
> InlineResponse2006 getProducts(includes, limit, orderBy)



Returns all products from the system that the user has access to  ### Includes You can give the following values on includes parameter: &#x60;brands, categories, routes, stocks&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsApi;

ProductsApi apiInstance = new ProductsApi();
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Specify the field to be sorted, examples:  - `?order_by=id|desc` - `?order_by=updated_at|desc,position|asc` 
try {
    InlineResponse2006 result = apiInstance.getProducts(includes, limit, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProducts");
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

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProductById"></a>
# **updateProductById**
> updateProductById(id, tax)



update a single product based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsApi;

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | ID of product to update
Product tax = new Product(); // Product | Product to add to the store
try {
    apiInstance.updateProductById(id, tax);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#updateProductById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product to update |
 **tax** | [**Product**](Product.md)| Product to add to the store |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProductById_0"></a>
# **updateProductById_0**
> updateProductById_0(id, tax)



update a single product based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.ProductsApi;

ProductsApi apiInstance = new ProductsApi();
Long id = 789L; // Long | ID of product to update
Product tax = new Product(); // Product | Product to add to the store
try {
    apiInstance.updateProductById_0(id, tax);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#updateProductById_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of product to update |
 **tax** | [**Product**](Product.md)| Product to add to the store |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

