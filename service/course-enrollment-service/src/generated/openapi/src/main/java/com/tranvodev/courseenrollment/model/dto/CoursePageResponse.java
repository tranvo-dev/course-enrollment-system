package com.tranvodev.courseenrollment.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tranvodev.courseenrollment.model.dto.CourseDto;
import com.tranvodev.courseenrollment.model.dto.PaginationMetaDto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CoursePageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.22.0")
public class CoursePageResponse {

  @Valid
  private List<@Valid CourseDto> data = new ArrayList<>();

  private PaginationMetaDto pagination;

  public CoursePageResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CoursePageResponse(List<@Valid CourseDto> data, PaginationMetaDto pagination) {
    this.data = data;
    this.pagination = pagination;
  }

  public CoursePageResponse data(List<@Valid CourseDto> data) {
    this.data = data;
    return this;
  }

  public CoursePageResponse addDataItem(CourseDto dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid CourseDto> getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(List<@Valid CourseDto> data) {
    this.data = data;
  }

  public CoursePageResponse pagination(PaginationMetaDto pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
   */
  @NotNull @Valid 
  @Schema(name = "pagination", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pagination")
  public PaginationMetaDto getPagination() {
    return pagination;
  }

  @JsonProperty("pagination")
  public void setPagination(PaginationMetaDto pagination) {
    this.pagination = pagination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoursePageResponse coursePageResponse = (CoursePageResponse) o;
    return Objects.equals(this.data, coursePageResponse.data) &&
        Objects.equals(this.pagination, coursePageResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoursePageResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

