# CategoriesApi

All URIs are relative to *https://api.facestore.local/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCategories**](CategoriesApi.md#addCategories) | **POST** /categories | 
[**deleteCategoryById**](CategoriesApi.md#deleteCategoryById) | **DELETE** /categories/{id}/ | 
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /categories | 
[**getCategoryById**](CategoriesApi.md#getCategoryById) | **GET** /categories/{id}/ | 
[**updateCategoryById**](CategoriesApi.md#updateCategoryById) | **PUT** /categories/{id}/ | 


<a name="addCategories"></a>
# **addCategories**
> InlineResponse2011 addCategories(category)



Creates a new category in the store.

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
Category category = new Category(); // Category | Category to add to the store
try {
    InlineResponse2011 result = apiInstance.addCategories(category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#addCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | [**Category**](Category.md)| Category to add to the store |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCategoryById"></a>
# **deleteCategoryById**
> deleteCategoryById(id)



deletes a single category based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
Long id = 789L; // Long | ID of category to delete
try {
    apiInstance.deleteCategoryById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#deleteCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of category to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCategories"></a>
# **getCategories**
> InlineResponse2001 getCategories(includes, limit, orderBy)



Returns all categories from the system that the user has access to  ### Includes You can give the following values on includes parameter: &#x60;routes, products&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Specify the field to be sorted, examples:  - `?order_by=id|desc` - `?order_by=updated_at|desc,position|asc` 
try {
    InlineResponse2001 result = apiInstance.getCategories(includes, limit, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategories");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCategoryById"></a>
# **getCategoryById**
> InlineResponse2011 getCategoryById(id, includes, limit)



Returns a category based on a single ID  ### Includes You can give the following values on includes parameter: &#x60;routes, products&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
Long id = 789L; // Long | ID of category to fetch
List<String> includes = Arrays.asList("includes_example"); // List<String> | Include associated objects within response
Integer limit = 56; // Integer | max records to return
try {
    InlineResponse2011 result = apiInstance.getCategoryById(id, includes, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of category to fetch |
 **includes** | [**List&lt;String&gt;**](String.md)| Include associated objects within response | [optional]
 **limit** | **Integer**| max records to return | [optional]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCategoryById"></a>
# **updateCategoryById**
> updateCategoryById(id, category)



update a single category based on the ID supplied

### Example
```java
// Import classes:
//import io.swagger.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
Long id = 789L; // Long | ID of category to update
Object category = null; // Object | Category to update in store
try {
    apiInstance.updateCategoryById(id, category);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#updateCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of category to update |
 **category** | **Object**| Category to update in store |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

