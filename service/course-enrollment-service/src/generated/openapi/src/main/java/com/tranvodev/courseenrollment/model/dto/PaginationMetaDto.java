package com.tranvodev.courseenrollment.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PaginationMetaDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.22.0")
public class PaginationMetaDto {

  private Integer page;

  private Integer size;

  private Long totalElements;

  private Integer totalPages;

  private @Nullable Boolean hasNext;

  private @Nullable Boolean hasPrevious;

  public PaginationMetaDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaginationMetaDto(Integer page, Integer size, Long totalElements, Integer totalPages) {
    this.page = page;
    this.size = size;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
  }

  public PaginationMetaDto page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Current zero-based page index
   * @return page
   */
  @NotNull 
  @Schema(name = "page", description = "Current zero-based page index", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  @JsonProperty("page")
  public void setPage(Integer page) {
    this.page = page;
  }

  public PaginationMetaDto size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Page size requested
   * @return size
   */
  @NotNull 
  @Schema(name = "size", description = "Page size requested", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  @JsonProperty("size")
  public void setSize(Integer size) {
    this.size = size;
  }

  public PaginationMetaDto totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Total number of courses
   * @return totalElements
   */
  @NotNull 
  @Schema(name = "totalElements", description = "Total number of courses", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }

  @JsonProperty("totalElements")
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PaginationMetaDto totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Total number of pages
   * @return totalPages
   */
  @NotNull 
  @Schema(name = "totalPages", description = "Total number of pages", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  @JsonProperty("totalPages")
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public PaginationMetaDto hasNext(@Nullable Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

  /**
   * Get hasNext
   * @return hasNext
   */
  
  @Schema(name = "hasNext", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasNext")
  public @Nullable Boolean getHasNext() {
    return hasNext;
  }

  @JsonProperty("hasNext")
  public void setHasNext(@Nullable Boolean hasNext) {
    this.hasNext = hasNext;
  }

  public PaginationMetaDto hasPrevious(@Nullable Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
    return this;
  }

  /**
   * Get hasPrevious
   * @return hasPrevious
   */
  
  @Schema(name = "hasPrevious", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasPrevious")
  public @Nullable Boolean getHasPrevious() {
    return hasPrevious;
  }

  @JsonProperty("hasPrevious")
  public void setHasPrevious(@Nullable Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationMetaDto paginationMetaDto = (PaginationMetaDto) o;
    return Objects.equals(this.page, paginationMetaDto.page) &&
        Objects.equals(this.size, paginationMetaDto.size) &&
        Objects.equals(this.totalElements, paginationMetaDto.totalElements) &&
        Objects.equals(this.totalPages, paginationMetaDto.totalPages) &&
        Objects.equals(this.hasNext, paginationMetaDto.hasNext) &&
        Objects.equals(this.hasPrevious, paginationMetaDto.hasPrevious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, size, totalElements, totalPages, hasNext, hasPrevious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationMetaDto {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
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

