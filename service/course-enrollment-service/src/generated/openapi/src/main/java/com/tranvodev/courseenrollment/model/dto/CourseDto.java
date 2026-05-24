package com.tranvodev.courseenrollment.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tranvodev.courseenrollment.model.dto.CourseStatusDto;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CourseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.22.0")
public class CourseDto {

  private Long id;

  private String code;

  private String title;

  private @Nullable String description;

  private Integer credits;

  private @Nullable Integer capacity;

  private @Nullable Integer enrolledCount;

  private CourseStatusDto status;

  public CourseDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CourseDto(Long id, String code, String title, Integer credits, CourseStatusDto status) {
    this.id = id;
    this.code = code;
    this.title = title;
    this.credits = credits;
    this.status = status;
  }

  public CourseDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  public CourseDto code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @NotNull 
  @Schema(name = "code", example = "CS101", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(String code) {
    this.code = code;
  }

  public CourseDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @NotNull 
  @Schema(name = "title", example = "Introduction to Computer Science", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  public CourseDto description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public CourseDto credits(Integer credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * minimum: 1
   * @return credits
   */
  @NotNull @Min(value = 1) 
  @Schema(name = "credits", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("credits")
  public Integer getCredits() {
    return credits;
  }

  @JsonProperty("credits")
  public void setCredits(Integer credits) {
    this.credits = credits;
  }

  public CourseDto capacity(@Nullable Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * minimum: 1
   * @return capacity
   */
  @Min(value = 1) 
  @Schema(name = "capacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capacity")
  public @Nullable Integer getCapacity() {
    return capacity;
  }

  @JsonProperty("capacity")
  public void setCapacity(@Nullable Integer capacity) {
    this.capacity = capacity;
  }

  public CourseDto enrolledCount(@Nullable Integer enrolledCount) {
    this.enrolledCount = enrolledCount;
    return this;
  }

  /**
   * Get enrolledCount
   * minimum: 0
   * @return enrolledCount
   */
  @Min(value = 0) 
  @Schema(name = "enrolledCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enrolledCount")
  public @Nullable Integer getEnrolledCount() {
    return enrolledCount;
  }

  @JsonProperty("enrolledCount")
  public void setEnrolledCount(@Nullable Integer enrolledCount) {
    this.enrolledCount = enrolledCount;
  }

  public CourseDto status(CourseStatusDto status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public CourseStatusDto getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(CourseStatusDto status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseDto courseDto = (CourseDto) o;
    return Objects.equals(this.id, courseDto.id) &&
        Objects.equals(this.code, courseDto.code) &&
        Objects.equals(this.title, courseDto.title) &&
        Objects.equals(this.description, courseDto.description) &&
        Objects.equals(this.credits, courseDto.credits) &&
        Objects.equals(this.capacity, courseDto.capacity) &&
        Objects.equals(this.enrolledCount, courseDto.enrolledCount) &&
        Objects.equals(this.status, courseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, title, description, credits, capacity, enrolledCount, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    enrolledCount: ").append(toIndentedString(enrolledCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

