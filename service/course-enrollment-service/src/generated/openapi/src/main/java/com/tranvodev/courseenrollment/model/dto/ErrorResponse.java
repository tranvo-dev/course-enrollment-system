package com.tranvodev.courseenrollment.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Problem details per RFC 9457
 */

@Schema(name = "ErrorResponse", description = "Problem details per RFC 9457")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.22.0")
public class ErrorResponse {

  private URI type = URI.create("about:blank");

  private @Nullable String title;

  private @Nullable Integer status;

  private @Nullable String detail;

  private @Nullable URI instance;

  public ErrorResponse type(URI type) {
    this.type = type;
    return this;
  }

  /**
   * URI identifying the problem type
   * @return type
   */
  @Valid 
  @Schema(name = "type", description = "URI identifying the problem type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public URI getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(URI type) {
    this.type = type;
  }

  public ErrorResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Short human-readable summary of the problem type
   * @return title
   */
  
  @Schema(name = "title", description = "Short human-readable summary of the problem type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public ErrorResponse status(@Nullable Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code
   * @return status
   */
  
  @Schema(name = "status", description = "HTTP status code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable Integer getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable Integer status) {
    this.status = status;
  }

  public ErrorResponse detail(@Nullable String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Human-readable explanation specific to this occurrence
   * @return detail
   */
  
  @Schema(name = "detail", description = "Human-readable explanation specific to this occurrence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detail")
  public @Nullable String getDetail() {
    return detail;
  }

  @JsonProperty("detail")
  public void setDetail(@Nullable String detail) {
    this.detail = detail;
  }

  public ErrorResponse instance(@Nullable URI instance) {
    this.instance = instance;
    return this;
  }

  /**
   * URI identifying the specific occurrence
   * @return instance
   */
  @Valid 
  @Schema(name = "instance", description = "URI identifying the specific occurrence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instance")
  public @Nullable URI getInstance() {
    return instance;
  }

  @JsonProperty("instance")
  public void setInstance(@Nullable URI instance) {
    this.instance = instance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.type, errorResponse.type) &&
        Objects.equals(this.title, errorResponse.title) &&
        Objects.equals(this.status, errorResponse.status) &&
        Objects.equals(this.detail, errorResponse.detail) &&
        Objects.equals(this.instance, errorResponse.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

