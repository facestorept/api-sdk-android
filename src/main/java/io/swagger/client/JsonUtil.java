/**
 * Facestore API
 * This is a reference to Facestore API.  # Introduction This API is documented in **OpenAPI format** and provided by [facestore.pt](http://facestore.pt) team.  # About the API Through the Facestore API your applications can retrieve and manage Facestore platform content in your store. The base address of the API is `https://api.facestore.pt`. There are several endpoints at that address, each with its own unique path. All endpoints are private and you need the permissions to access them. To get an API Token you have to be client of Facestore and access your personal account to request it (see the next topic).  # Get API Token To consume the Facestore API is take the unique token to identify your requests. You can do that accessing the store manager admin and doing the following steps: 1. Go to ``configurations > API`` section. 2. Copy the unique token.  # Requests The API is based on REST principles: data resources are accessed via standard HTTPS requests in UTF-8 format to an API endpoint. Where possible, the API strives to use appropriate HTTP verbs for each action: | VERB     | DESCRIPTION                                            | | -------- |:-------------:                                         | | GET      | Used for retrieving resources.                         | | POST     | Used for creating resources.                           | | PUT      | Used for changing/replacing resources or collections.  | | PATCH    | Used for changing/replacing partial resources.         | | DELETE   | Used for deleting resources.                           |  # Responses Response Status Codes The API uses the following response status codes, as defined in the RFC 2616 and RFC 6585:  | STATUS CODE | DESCRIPTION                                                                                                                                                                                                                       | |:-----------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:| | 200         | OK - The request has succeeded. The client can read the result of the request in the body and the headers of the response.                                                                                                        | | 201         | Created - The request has been fulfilled and resulted in a new resource being created.                                                                                                                                            | | 202         | Accepted - The request has been accepted for processing, but the processing has not been completed.                                                                                                                               | | 204         | No Content - The request has succeeded but returns no message body.                                                                                                                                                               | | 304         | Not Modified. See Conditional requests.                                                                                                                                                                                           | | 400         | Bad Request - The request could not be understood by the server due to malformed syntax. The message body will contain more information; see Error Details.                                                                       | | 401         | Unauthorized - The request requires user authentication or, if the request included authorization credentials, authorization has been refused for those credentials.                                                              | | 403         | Forbidden - The server understood the request, but is refusing to fulfill it.                                                                                                                                                     | | 404         | Not Found - The requested resource could not be found. This error can be due to a temporary or permanent condition.                                                                                                               | | 429         | Too Many Requests - Rate limiting has been applied.                                                                                                                                                                               | | 500         | Internal Server Error. You should never receive this error because our clever coders catch them all ... but if you are unlucky enough to get one, please report it to us through a comment at the bottom of this page.            | | 502         | Bad Gateway - The server was acting as a gateway or proxy and received an invalid response from the upstream server.                                                                                                              | | 503         | Service Unavailable - The server is currently unable to handle the request due to a temporary condition which will be alleviated after some delay. You can choose to resend the request again.                                    |  # Rate limiting To make the API fast for everybody, rate limits apply.  Rate limiting is applied on an application basis (based on client id), regardless of how many users are using it.  If you get status code 429, it means that you have sent too many requests. If this happens, have a look in the Retry-After header, where you will see a number displayed. This is the amount of seconds that you need to wait, before you can retry sending your requests.  You can check the returned HTTP headers of any API request to see your current rate limit status:  ``` curl -i https://api.facestore.pt/v1/sample HTTP/1.1 200 OK Date: Mon, 01 Dec 2016 17:27:06 GMT Status: 200 OK X-RateLimit-Limit: 60 X-RateLimit-Remaining: 56 X-RateLimit-Reset: 1372700873 ```  The headers tell you everything you need to know about your current rate limit status:  | HEADER NAME           | DESCRIPTION                                                                     | |:---------------------:|:-------------------------------------------------------------------------------:| | X-RateLimit-Limit   | The maximum number of requests that the consumer is permitted to make per hour. | | X-RateLimit-Remaining | The number of requests remaining in the current rate limit window.              | | X-RateLimit-Reset   | The time at which the current rate limit window resets in UTC epoch seconds.    |  # Timestamps Timestamps are returned in ISO 8601 format as Coordinated Universal Time (UTC) with zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is imprecise (for example, the date/time of an product is created), an additional field will show the precision; see for example, created_at in an product object.  # Error Details The API uses the following format to describe unsuccessful responses, return information about the error as an error JSON object containing the following information::  | KEY         | VALUE TYPE   | VALUE DESCRIPTION | |:-----------:|:------------:|:-----------------:| | status_code | integer    | The HTTP status code (also returned in the response header; see Response Status Codes for more information). | | message     | string     | A short description of the cause of the error. | 
 *
 * OpenAPI spec version: 0.1.4
 * Contact: apihelp@facestore.pt
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Attribute".equalsIgnoreCase(className)) {
      return new TypeToken<List<Attribute>>(){}.getType();
    }
    
    if ("AttributeOptions".equalsIgnoreCase(className)) {
      return new TypeToken<List<AttributeOptions>>(){}.getType();
    }
    
    if ("Brand".equalsIgnoreCase(className)) {
      return new TypeToken<List<Brand>>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<List<Category>>(){}.getType();
    }
    
    if ("Customer".equalsIgnoreCase(className)) {
      return new TypeToken<List<Customer>>(){}.getType();
    }
    
    if ("DefaultResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DefaultResponse>>(){}.getType();
    }
    
    if ("I18n".equalsIgnoreCase(className)) {
      return new TypeToken<List<I18n>>(){}.getType();
    }
    
    if ("I18nProduct".equalsIgnoreCase(className)) {
      return new TypeToken<List<I18nProduct>>(){}.getType();
    }
    
    if ("I18nProductSeo".equalsIgnoreCase(className)) {
      return new TypeToken<List<I18nProductSeo>>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse200>>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2001>>(){}.getType();
    }
    
    if ("InlineResponse2001Meta".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2001Meta>>(){}.getType();
    }
    
    if ("InlineResponse2002".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2002>>(){}.getType();
    }
    
    if ("InlineResponse2003".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2003>>(){}.getType();
    }
    
    if ("InlineResponse2004".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2004>>(){}.getType();
    }
    
    if ("InlineResponse2005".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2005>>(){}.getType();
    }
    
    if ("InlineResponse2006".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2006>>(){}.getType();
    }
    
    if ("InlineResponse201".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse201>>(){}.getType();
    }
    
    if ("InlineResponse2011".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2011>>(){}.getType();
    }
    
    if ("InlineResponse2012".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2012>>(){}.getType();
    }
    
    if ("InlineResponse2013".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2013>>(){}.getType();
    }
    
    if ("InlineResponse2014".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2014>>(){}.getType();
    }
    
    if ("MetaPartialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MetaPartialResponse>>(){}.getType();
    }
    
    if ("NotFoundResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotFoundResponse>>(){}.getType();
    }
    
    if ("Options".equalsIgnoreCase(className)) {
      return new TypeToken<List<Options>>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<List<Order>>(){}.getType();
    }
    
    if ("Payment".equalsIgnoreCase(className)) {
      return new TypeToken<List<Payment>>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<List<Product>>(){}.getType();
    }
    
    if ("Shipping".equalsIgnoreCase(className)) {
      return new TypeToken<List<Shipping>>(){}.getType();
    }
    
    if ("Tax".equalsIgnoreCase(className)) {
      return new TypeToken<List<Tax>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Attribute".equalsIgnoreCase(className)) {
      return new TypeToken<Attribute>(){}.getType();
    }
    
    if ("AttributeOptions".equalsIgnoreCase(className)) {
      return new TypeToken<AttributeOptions>(){}.getType();
    }
    
    if ("Brand".equalsIgnoreCase(className)) {
      return new TypeToken<Brand>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<Category>(){}.getType();
    }
    
    if ("Customer".equalsIgnoreCase(className)) {
      return new TypeToken<Customer>(){}.getType();
    }
    
    if ("DefaultResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DefaultResponse>(){}.getType();
    }
    
    if ("I18n".equalsIgnoreCase(className)) {
      return new TypeToken<I18n>(){}.getType();
    }
    
    if ("I18nProduct".equalsIgnoreCase(className)) {
      return new TypeToken<I18nProduct>(){}.getType();
    }
    
    if ("I18nProductSeo".equalsIgnoreCase(className)) {
      return new TypeToken<I18nProductSeo>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse200>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2001>(){}.getType();
    }
    
    if ("InlineResponse2001Meta".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2001Meta>(){}.getType();
    }
    
    if ("InlineResponse2002".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2002>(){}.getType();
    }
    
    if ("InlineResponse2003".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2003>(){}.getType();
    }
    
    if ("InlineResponse2004".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2004>(){}.getType();
    }
    
    if ("InlineResponse2005".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2005>(){}.getType();
    }
    
    if ("InlineResponse2006".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2006>(){}.getType();
    }
    
    if ("InlineResponse201".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse201>(){}.getType();
    }
    
    if ("InlineResponse2011".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2011>(){}.getType();
    }
    
    if ("InlineResponse2012".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2012>(){}.getType();
    }
    
    if ("InlineResponse2013".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2013>(){}.getType();
    }
    
    if ("InlineResponse2014".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2014>(){}.getType();
    }
    
    if ("MetaPartialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MetaPartialResponse>(){}.getType();
    }
    
    if ("NotFoundResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotFoundResponse>(){}.getType();
    }
    
    if ("Options".equalsIgnoreCase(className)) {
      return new TypeToken<Options>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<Order>(){}.getType();
    }
    
    if ("Payment".equalsIgnoreCase(className)) {
      return new TypeToken<Payment>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<Product>(){}.getType();
    }
    
    if ("Shipping".equalsIgnoreCase(className)) {
      return new TypeToken<Shipping>(){}.getType();
    }
    
    if ("Tax".equalsIgnoreCase(className)) {
      return new TypeToken<Tax>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
