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

import com.android.volley.Cache;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.NoCache;
import com.android.volley.toolbox.RequestFuture;
import com.google.gson.JsonParseException;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import io.swagger.client.auth.Authentication;
import io.swagger.client.auth.ApiKeyAuth;
import io.swagger.client.auth.HttpBasicAuth;
import io.swagger.client.request.GetRequest;
import io.swagger.client.request.PostRequest;
import io.swagger.client.request.PutRequest;
import io.swagger.client.request.DeleteRequest;
import io.swagger.client.request.PatchRequest;

public class ApiInvoker {
  private static ApiInvoker INSTANCE;
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();

  private RequestQueue mRequestQueue;

  private Map<String, Authentication> authentications;

  private int connectionTimeout;

  /** Content type "text/plain" with UTF-8 encoding. */
  public static final ContentType TEXT_PLAIN_UTF8 = ContentType.create("text/plain", Consts.UTF_8);

  /**
   * ISO 8601 date time format.
   * @see https://en.wikipedia.org/wiki/ISO_8601
   */
  public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

  /**
   * ISO 8601 date format.
   * @see https://en.wikipedia.org/wiki/ISO_8601
   */
  public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

  static {
    // Use UTC as the default time zone.
    DATE_TIME_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
    DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
  }

  public static void setUserAgent(String userAgent) {
    INSTANCE.addDefaultHeader("User-Agent", userAgent);
  }

  public static Date parseDateTime(String str) {
    try {
      return DATE_TIME_FORMAT.parse(str);
    } catch (java.text.ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public static Date parseDate(String str) {
    try {
      return DATE_FORMAT.parse(str);
    } catch (java.text.ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public static String formatDateTime(Date datetime) {
    return DATE_TIME_FORMAT.format(datetime);
  }

  public static String formatDate(Date date) {
    return DATE_FORMAT.format(date);
  }

  public static String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof Date) {
      return formatDateTime((Date) param);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for(Object o : (Collection)param) {
        if(b.length() > 0) {
          b.append(",");
        }
        b.append(String.valueOf(o));
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }

  /*
    Format to {@code Pair} objects.
  */
  public static List<Pair> parameterToPairs(String collectionFormat, String name, Object value){
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null) return params;

    Collection valueCollection = null;
    if (value instanceof Collection) {
      valueCollection = (Collection) value;
    } else {
      params.add(new Pair(name, parameterToString(value)));
      return params;
    }

    if (valueCollection.isEmpty()){
      return params;
    }

    // get the collection format
    collectionFormat = (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat); // default: csv

    // create the params based on the collection format
    if (collectionFormat.equals("multi")) {
      for (Object item : valueCollection) {
        params.add(new Pair(name, parameterToString(item)));
      }

      return params;
    }

    String delimiter = ",";

    if (collectionFormat.equals("csv")) {
      delimiter = ",";
    } else if (collectionFormat.equals("ssv")) {
      delimiter = " ";
    } else if (collectionFormat.equals("tsv")) {
      delimiter = "\t";
    } else if (collectionFormat.equals("pipes")) {
      delimiter = "|";
    }

    StringBuilder sb = new StringBuilder() ;
    for (Object item : valueCollection) {
      sb.append(delimiter);
      sb.append(parameterToString(item));
    }

    params.add(new Pair(name, sb.substring(1)));

    return params;
  }

  public static void initializeInstance() {
    initializeInstance(null);
  }

  public static void initializeInstance(Cache cache) {
    initializeInstance(cache, null, 0, null, 30);
  }

  public static void initializeInstance(Cache cache, Network network, int threadPoolSize, ResponseDelivery delivery, int connectionTimeout) {
    INSTANCE = new ApiInvoker(cache, network, threadPoolSize, delivery, connectionTimeout);
    setUserAgent("Swagger-Codegen/1.0.0/android");

    // Setup authentications (key: authentication name, value: authentication).
    INSTANCE.authentications = new HashMap<String, Authentication>();
    INSTANCE.authentications.put("APIKeyHeader", new ApiKeyAuth("header", "APIToken"));
    // Prevent the authentications from being modified.
    INSTANCE.authentications = Collections.unmodifiableMap(INSTANCE.authentications);
  }

  private ApiInvoker(Cache cache, Network network, int threadPoolSize, ResponseDelivery delivery, int connectionTimeout) {
    if(cache == null) cache = new NoCache();
    if(network == null) {
       HttpStack stack = new HurlStack();
       network = new BasicNetwork(stack);
    }

    if(delivery == null) {
       initConnectionRequest(cache, network);
    } else {
       initConnectionRequest(cache, network, threadPoolSize, delivery);
    }
    this.connectionTimeout = connectionTimeout;
  }

  public static ApiInvoker getInstance() {
    if (INSTANCE == null) initializeInstance();
    return INSTANCE;
  }

  public void addDefaultHeader(String key, String value) {
    defaultHeaderMap.put(key, value);
  }

  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  public static Object deserialize(String json, String containerType, Class cls) throws ApiException {
    try{
      if("list".equalsIgnoreCase(containerType) || "array".equalsIgnoreCase(containerType)) {
        return JsonUtil.deserializeToList(json, cls);
      }
      else if(String.class.equals(cls)) {
        if(json != null && json.startsWith("\"") && json.endsWith("\"") && json.length() > 1)
          return json.substring(1, json.length() - 1);
        else
          return json;
      }
      else {
        return JsonUtil.deserializeToObject(json, cls);
      }
    }
    catch (JsonParseException e) {
      throw new ApiException(500, e.getMessage());
    }
  }

  public static String serialize(Object obj) throws ApiException {
    try {
      if (obj != null)
        return JsonUtil.serialize(obj);
      else
        return null;
    }
    catch (Exception e) {
      throw new ApiException(500, e.getMessage());
    }
  }

  /**
   * Get authentications (key: authentication name, value: authentication).
   */
  public Map<String, Authentication> getAuthentications() {
    return authentications;
  }

  /**
   * Get authentication for the given name.
   *
   * @param authName The authentication name
   * @return The authentication, null if not found
   */
  public Authentication getAuthentication(String authName) {
    return authentications.get(authName);
  }

  /**
   * Helper method to set username for the first HTTP basic authentication.
   */
  public void setUsername(String username) {
    for (Authentication auth : authentications.values()) {
       if (auth instanceof HttpBasicAuth) {
           ((HttpBasicAuth) auth).setUsername(username);
           return;
       }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set password for the first HTTP basic authentication.
   */
  public void setPassword(String password) {
    for (Authentication auth : authentications.values()) {
       if (auth instanceof HttpBasicAuth) {
          ((HttpBasicAuth) auth).setPassword(password);
          return;
       }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set API key value for the first API key authentication.
   */
  public void setApiKey(String apiKey) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKey(apiKey);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set API key prefix for the first API key authentication.
   */
  public void setApiKeyPrefix(String apiKeyPrefix) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  public void setConnectionTimeout(int connectionTimeout){
    this.connectionTimeout = connectionTimeout;
  }

  public int getConnectionTimeout() {
    return connectionTimeout;
  }

  /**
   * Update query and header parameters based on authentication settings.
   *
   * @param authNames The authentications to apply
   */
  private void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams) {
    for (String authName : authNames) {
      Authentication auth = authentications.get(authName);
      if (auth == null) throw new RuntimeException("Authentication undefined: " + authName);
        auth.applyToParams(queryParams, headerParams);
    }
  }

  public String invokeAPI(String host, String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType, String[] authNames) throws ApiException, InterruptedException, ExecutionException, TimeoutException {
    try {
      RequestFuture<String> future = RequestFuture.newFuture();
      Request request = createRequest(host, path, method, queryParams, body, headerParams, formParams, contentType, authNames, future, future);
      if(request != null) {
         mRequestQueue.add(request);
         return future.get(connectionTimeout, TimeUnit.SECONDS);
      } else {
        return "no data";
      }
    } catch (UnsupportedEncodingException ex) {
      throw new ApiException(0, "UnsupportedEncodingException");
    }
  }

  public void invokeAPI(String host, String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType, String[] authNames, Response.Listener<String> stringRequest, Response.ErrorListener errorListener) throws ApiException {
    try {
      Request request = createRequest(host, path, method, queryParams, body, headerParams, formParams, contentType, authNames, stringRequest, errorListener);
      if (request != null) {
        mRequestQueue.add(request);
      }
    } catch (UnsupportedEncodingException ex) {
      throw new ApiException(0, "UnsupportedEncodingException");
    }
  }

  public Request<String> createRequest(String host, String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType, String[] authNames, Response.Listener<String> stringRequest, Response.ErrorListener errorListener) throws ApiException, UnsupportedEncodingException {
    StringBuilder b = new StringBuilder();
    b.append("?");

    updateParamsForAuth(authNames, queryParams, headerParams);

    if (queryParams != null){
      for (Pair queryParam : queryParams){
        if (!queryParam.getName().isEmpty()) {
          b.append(escapeString(queryParam.getName()));
          b.append("=");
          b.append(escapeString(queryParam.getValue()));
          b.append("&");
        }
      }
    }

    String querystring = b.substring(0, b.length() - 1);
    String url = host + path + querystring;

    HashMap<String, String> headers = new HashMap<String, String>();

    for(String key : headerParams.keySet()) {
      headers.put(key, headerParams.get(key));
    }

    for(String key : defaultHeaderMap.keySet()) {
      if(!headerParams.containsKey(key)) {
        headers.put(key, defaultHeaderMap.get(key));
      }
    }
    headers.put("Accept", "application/json");

    // URL encoded string from form parameters
    String formParamStr = null;

    // for form data
    if ("application/x-www-form-urlencoded".equals(contentType)) {
      StringBuilder formParamBuilder = new StringBuilder();

      // encode the form params
      for (String key : formParams.keySet()) {
        String value = formParams.get(key);
        if (value != null && !"".equals(value.trim())) {
          if (formParamBuilder.length() > 0) {
            formParamBuilder.append("&");
          }
          try {
            formParamBuilder.append(URLEncoder.encode(key, "utf8")).append("=").append(URLEncoder.encode(value, "utf8"));
          }
          catch (Exception e) {
            // move on to next
          }
        }
      }
      formParamStr = formParamBuilder.toString();
    }
    Request request = null;

    if ("GET".equals(method)) {
      request = new GetRequest(url, headers, null, stringRequest, errorListener);
    }
    else if ("POST".equals(method)) {
       request = null;
       if (formParamStr != null) {
          request = new PostRequest(url, headers, contentType, new StringEntity(formParamStr, "UTF-8"), stringRequest, errorListener);
       } else if (body != null) {
          if (body instanceof HttpEntity) {
          request = new PostRequest(url, headers, null, (HttpEntity) body, stringRequest, errorListener);
          } else {
             request = new PostRequest(url, headers, contentType, new StringEntity(serialize(body), "UTF-8"), stringRequest, errorListener);
          }
       } else {
         request = new PostRequest(url, headers, null, null, stringRequest, errorListener);
       }
    }
    else if ("PUT".equals(method)) {
       request = null;
       if (formParamStr != null) {
          request = new PutRequest(url, headers, contentType, new StringEntity(formParamStr, "UTF-8"), stringRequest, errorListener);
       } else if (body != null) {
          if (body instanceof HttpEntity) {
             request = new PutRequest(url, headers, null, (HttpEntity) body, stringRequest, errorListener);
          } else {
             request = new PutRequest(url, headers, contentType, new StringEntity(serialize(body), "UTF-8"), stringRequest, errorListener);
          }
       } else {
          request = new PutRequest(url, headers, null, null, stringRequest, errorListener);
       }
    }
    else if ("DELETE".equals(method)) {
       request = null;
          if (formParamStr != null) {
           request = new DeleteRequest(url, headers, contentType, new StringEntity(formParamStr, "UTF-8"), stringRequest, errorListener);
          } else if (body != null) {
          if (body instanceof HttpEntity) {
             request = new DeleteRequest(url, headers, null, (HttpEntity) body, stringRequest, errorListener);
          } else {
             request = new DeleteRequest(url, headers, contentType, new StringEntity(serialize(body), "UTF-8"), stringRequest, errorListener);
          }
       } else {
          request = new DeleteRequest(url, headers, null, null, stringRequest, errorListener);
       }
    }
    else if ("PATCH".equals(method)) {
       request = null;
          if (formParamStr != null) {
             request = new PatchRequest(url, headers, contentType, new StringEntity(formParamStr, "UTF-8"), stringRequest, errorListener);
          } else if (body != null) {
             if (body instanceof HttpEntity) {
                request = new PatchRequest(url, headers, null, (HttpEntity) body, stringRequest, errorListener);
             } else {
                request = new PatchRequest(url, headers, contentType, new StringEntity(serialize(body), "UTF-8"), stringRequest, errorListener);
             }
          } else {
             request = new PatchRequest(url, headers, null, null, stringRequest, errorListener);
          }
    }

    if (request != null) {
        request.setRetryPolicy(new DefaultRetryPolicy((int)TimeUnit.SECONDS.toMillis(this.connectionTimeout), DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
    }

    return request;
  }

  private void initConnectionRequest(Cache cache, Network network) {
    mRequestQueue = new RequestQueue(cache, network);
    mRequestQueue.start();
  }

  private void initConnectionRequest(Cache cache, Network network, int threadPoolSize, ResponseDelivery delivery) {
    mRequestQueue = new RequestQueue(cache, network, threadPoolSize, delivery);
    mRequestQueue.start();
  }

  public void stopQueue() {
    mRequestQueue.stop();
  }
}
