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

package io.swagger.client.model;

import io.swagger.client.model.I18nProduct;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Product {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("sku")
  private String sku = null;
  @SerializedName("manual")
  private String manual = null;
  @SerializedName("url_video")
  private String urlVideo = null;
  public enum List&lt;VisibilityEnum&gt; {
     facebook,  mobile,  webstore,  none,  all, 
  };
  @SerializedName("visibility")
  private List<VisibilityEnum> visibility = null;
  @SerializedName("in_homepage")
  private Boolean inHomepage = null;
  @SerializedName("is_prefered")
  private Boolean isPrefered = null;
  @SerializedName("is_digital")
  private Boolean isDigital = null;
  @SerializedName("url_digital")
  private String urlDigital = null;
  @SerializedName("is_new")
  private Boolean isNew = null;
  @SerializedName("i18n")
  private I18nProduct i18n = null;
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("updated_at")
  private Date updatedAt = null;
  @SerializedName("expires_at")
  private Date expiresAt = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getManual() {
    return manual;
  }
  public void setManual(String manual) {
    this.manual = manual;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrlVideo() {
    return urlVideo;
  }
  public void setUrlVideo(String urlVideo) {
    this.urlVideo = urlVideo;
  }

  /**
   * channels that resource are showed
   **/
  @ApiModelProperty(value = "channels that resource are showed")
  public List<VisibilityEnum> getVisibility() {
    return visibility;
  }
  public void setVisibility(List<VisibilityEnum> visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getInHomepage() {
    return inHomepage;
  }
  public void setInHomepage(Boolean inHomepage) {
    this.inHomepage = inHomepage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsPrefered() {
    return isPrefered;
  }
  public void setIsPrefered(Boolean isPrefered) {
    this.isPrefered = isPrefered;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsDigital() {
    return isDigital;
  }
  public void setIsDigital(Boolean isDigital) {
    this.isDigital = isDigital;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrlDigital() {
    return urlDigital;
  }
  public void setUrlDigital(String urlDigital) {
    this.urlDigital = urlDigital;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsNew() {
    return isNew;
  }
  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public I18nProduct getI18n() {
    return i18n;
  }
  public void setI18n(I18nProduct i18n) {
    this.i18n = i18n;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Date expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return (this.id == null ? product.id == null : this.id.equals(product.id)) &&
        (this.sku == null ? product.sku == null : this.sku.equals(product.sku)) &&
        (this.manual == null ? product.manual == null : this.manual.equals(product.manual)) &&
        (this.urlVideo == null ? product.urlVideo == null : this.urlVideo.equals(product.urlVideo)) &&
        (this.visibility == null ? product.visibility == null : this.visibility.equals(product.visibility)) &&
        (this.inHomepage == null ? product.inHomepage == null : this.inHomepage.equals(product.inHomepage)) &&
        (this.isPrefered == null ? product.isPrefered == null : this.isPrefered.equals(product.isPrefered)) &&
        (this.isDigital == null ? product.isDigital == null : this.isDigital.equals(product.isDigital)) &&
        (this.urlDigital == null ? product.urlDigital == null : this.urlDigital.equals(product.urlDigital)) &&
        (this.isNew == null ? product.isNew == null : this.isNew.equals(product.isNew)) &&
        (this.i18n == null ? product.i18n == null : this.i18n.equals(product.i18n)) &&
        (this.active == null ? product.active == null : this.active.equals(product.active)) &&
        (this.createdAt == null ? product.createdAt == null : this.createdAt.equals(product.createdAt)) &&
        (this.updatedAt == null ? product.updatedAt == null : this.updatedAt.equals(product.updatedAt)) &&
        (this.expiresAt == null ? product.expiresAt == null : this.expiresAt.equals(product.expiresAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    result = 31 * result + (this.manual == null ? 0: this.manual.hashCode());
    result = 31 * result + (this.urlVideo == null ? 0: this.urlVideo.hashCode());
    result = 31 * result + (this.visibility == null ? 0: this.visibility.hashCode());
    result = 31 * result + (this.inHomepage == null ? 0: this.inHomepage.hashCode());
    result = 31 * result + (this.isPrefered == null ? 0: this.isPrefered.hashCode());
    result = 31 * result + (this.isDigital == null ? 0: this.isDigital.hashCode());
    result = 31 * result + (this.urlDigital == null ? 0: this.urlDigital.hashCode());
    result = 31 * result + (this.isNew == null ? 0: this.isNew.hashCode());
    result = 31 * result + (this.i18n == null ? 0: this.i18n.hashCode());
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  manual: ").append(manual).append("\n");
    sb.append("  urlVideo: ").append(urlVideo).append("\n");
    sb.append("  visibility: ").append(visibility).append("\n");
    sb.append("  inHomepage: ").append(inHomepage).append("\n");
    sb.append("  isPrefered: ").append(isPrefered).append("\n");
    sb.append("  isDigital: ").append(isDigital).append("\n");
    sb.append("  urlDigital: ").append(urlDigital).append("\n");
    sb.append("  isNew: ").append(isNew).append("\n");
    sb.append("  i18n: ").append(i18n).append("\n");
    sb.append("  active: ").append(active).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
