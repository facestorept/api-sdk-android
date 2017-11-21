# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.BrandsApi;

public class BrandsApiExample {

    public static void main(String[] args) {
        BrandsApi apiInstance = new BrandsApi();
        Brand brand = new Brand(); // Brand | Brand to add to the store
        try {
            InlineResponse201 result = apiInstance.addBrands(brand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#addBrands");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.facestore.local/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrandsApi* | [**addBrands**](docs/BrandsApi.md#addBrands) | **POST** /brands | 
*BrandsApi* | [**deleteBrandById**](docs/BrandsApi.md#deleteBrandById) | **DELETE** /brands/{id}/ | 
*BrandsApi* | [**getBrandById**](docs/BrandsApi.md#getBrandById) | **GET** /brands/{id}/ | 
*BrandsApi* | [**getBrands**](docs/BrandsApi.md#getBrands) | **GET** /brands | 
*BrandsApi* | [**updateCategoryById**](docs/BrandsApi.md#updateCategoryById) | **PUT** /brands/{id}/ | 
*BrandsApi* | [**updateCategoryById_0**](docs/BrandsApi.md#updateCategoryById_0) | **PATCH** /brands/{id}/ | 
*CategoriesApi* | [**addCategories**](docs/CategoriesApi.md#addCategories) | **POST** /categories | 
*CategoriesApi* | [**deleteCategoryById**](docs/CategoriesApi.md#deleteCategoryById) | **DELETE** /categories/{id}/ | 
*CategoriesApi* | [**getCategories**](docs/CategoriesApi.md#getCategories) | **GET** /categories | 
*CategoriesApi* | [**getCategoryById**](docs/CategoriesApi.md#getCategoryById) | **GET** /categories/{id}/ | 
*CategoriesApi* | [**updateCategoryById**](docs/CategoriesApi.md#updateCategoryById) | **PUT** /categories/{id}/ | 
*CustomersApi* | [**getCustomerById**](docs/CustomersApi.md#getCustomerById) | **GET** /customers/{id}/ | 
*CustomersApi* | [**getCustomers**](docs/CustomersApi.md#getCustomers) | **GET** /customers | 
*OrdersApi* | [**getOrderById**](docs/OrdersApi.md#getOrderById) | **GET** /orders/{id}/ | 
*OrdersApi* | [**getOrders**](docs/OrdersApi.md#getOrders) | **GET** /orders | 
*PaymentsApi* | [**getPaymentById**](docs/PaymentsApi.md#getPaymentById) | **GET** /payments/{id}/ | 
*PaymentsApi* | [**getPayments**](docs/PaymentsApi.md#getPayments) | **GET** /payments | 
*ProductsApi* | [**addProduct**](docs/ProductsApi.md#addProduct) | **POST** /products | 
*ProductsApi* | [**deleteProductById**](docs/ProductsApi.md#deleteProductById) | **DELETE** /products/{id}/ | 
*ProductsApi* | [**getProductById**](docs/ProductsApi.md#getProductById) | **GET** /products/{id}/ | 
*ProductsApi* | [**getProducts**](docs/ProductsApi.md#getProducts) | **GET** /products | 
*ProductsApi* | [**updateProductById**](docs/ProductsApi.md#updateProductById) | **PUT** /products/{id}/ | 
*ProductsApi* | [**updateProductById_0**](docs/ProductsApi.md#updateProductById_0) | **PATCH** /products/{id}/ | 
*ProductsAttributesApi* | [**addProductsAttributes**](docs/ProductsAttributesApi.md#addProductsAttributes) | **POST** /attributes | 
*ProductsAttributesApi* | [**deleteProductAttributeById**](docs/ProductsAttributesApi.md#deleteProductAttributeById) | **DELETE** /attributes/{id}/ | 
*ProductsAttributesApi* | [**getProductAttributeById**](docs/ProductsAttributesApi.md#getProductAttributeById) | **GET** /attributes/{id}/ | 
*ProductsAttributesApi* | [**getProductsAttributes**](docs/ProductsAttributesApi.md#getProductsAttributes) | **GET** /attributes | 
*ProductsAttributesApi* | [**updateProductAttributeById**](docs/ProductsAttributesApi.md#updateProductAttributeById) | **PUT** /attributes/{id}/ | 
*ShippingsApi* | [**addShipping**](docs/ShippingsApi.md#addShipping) | **POST** /shippings | 
*ShippingsApi* | [**deleteShippingById**](docs/ShippingsApi.md#deleteShippingById) | **DELETE** /shippings/{id}/ | 
*ShippingsApi* | [**getShippingById**](docs/ShippingsApi.md#getShippingById) | **GET** /shippings/{id}/ | 
*ShippingsApi* | [**getShippings**](docs/ShippingsApi.md#getShippings) | **GET** /shippings | 
*ShippingsApi* | [**updateShippingById**](docs/ShippingsApi.md#updateShippingById) | **PUT** /shippings/{id}/ | 
*ShippingsApi* | [**updateShippingById_0**](docs/ShippingsApi.md#updateShippingById_0) | **PATCH** /shippings/{id}/ | 
*TaxesApi* | [**addTaxes**](docs/TaxesApi.md#addTaxes) | **POST** /taxes | 
*TaxesApi* | [**deleteTaxById**](docs/TaxesApi.md#deleteTaxById) | **DELETE** /taxes/{id}/ | 
*TaxesApi* | [**getTaxById**](docs/TaxesApi.md#getTaxById) | **GET** /taxes/{id}/ | 
*TaxesApi* | [**getTaxes**](docs/TaxesApi.md#getTaxes) | **GET** /taxes | 
*TaxesApi* | [**updateTaxById**](docs/TaxesApi.md#updateTaxById) | **PUT** /taxes/{id}/ | 
*TaxesApi* | [**updateTaxById_0**](docs/TaxesApi.md#updateTaxById_0) | **PATCH** /taxes/{id}/ | 


## Documentation for Models

 - [Attribute](docs/Attribute.md)
 - [AttributeOptions](docs/AttributeOptions.md)
 - [Brand](docs/Brand.md)
 - [Category](docs/Category.md)
 - [Customer](docs/Customer.md)
 - [DefaultResponse](docs/DefaultResponse.md)
 - [I18n](docs/I18n.md)
 - [I18nProduct](docs/I18nProduct.md)
 - [I18nProductSeo](docs/I18nProductSeo.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2001Meta](docs/InlineResponse2001Meta.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse2011](docs/InlineResponse2011.md)
 - [InlineResponse2012](docs/InlineResponse2012.md)
 - [InlineResponse2013](docs/InlineResponse2013.md)
 - [InlineResponse2014](docs/InlineResponse2014.md)
 - [MetaPartialResponse](docs/MetaPartialResponse.md)
 - [NotFoundResponse](docs/NotFoundResponse.md)
 - [Options](docs/Options.md)
 - [Order](docs/Order.md)
 - [Payment](docs/Payment.md)
 - [Product](docs/Product.md)
 - [Shipping](docs/Shipping.md)
 - [Tax](docs/Tax.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APIKeyHeader

- **Type**: API key
- **API key parameter name**: APIToken
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

apihelp@facestore.pt

