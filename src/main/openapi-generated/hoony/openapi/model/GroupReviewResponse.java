package hoony.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

/**
 * GroupReviewResponse
 */
@lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.7.0")
public class GroupReviewResponse {

  private Long reviewId;

  private LocalDate createdAt = null;

  private String contentPreview;

  public GroupReviewResponse reviewId(Long reviewId) {
    this.reviewId = reviewId;
    return this;
  }

  /**
   * 리뷰 ID
   * @return reviewId
   */
  
  @Schema(name = "reviewId", example = "2435", description = "리뷰 ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reviewId")
  public Long getReviewId() {
    return reviewId;
  }

  public void setReviewId(Long reviewId) {
    this.reviewId = reviewId;
  }

  public GroupReviewResponse createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * 리뷰 생성 일자
   * @return createdAt
   */
  @Valid 
  @Schema(name = "createdAt", example = "2024-07-29", description = "리뷰 생성 일자", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public GroupReviewResponse contentPreview(String contentPreview) {
    this.contentPreview = contentPreview;
    return this;
  }

  /**
   * 리뷰 미리보기 (최대 150자)
   * @return contentPreview
   */
  
  @Schema(name = "contentPreview", example = "리뷰미 팀에서 멋쟁이 역할을 맡은 아루는~~~", description = "리뷰 미리보기 (최대 150자)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentPreview")
  public String getContentPreview() {
    return contentPreview;
  }

  public void setContentPreview(String contentPreview) {
    this.contentPreview = contentPreview;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupReviewResponse groupReviewResponse = (GroupReviewResponse) o;
    return Objects.equals(this.reviewId, groupReviewResponse.reviewId) &&
        Objects.equals(this.createdAt, groupReviewResponse.createdAt) &&
        Objects.equals(this.contentPreview, groupReviewResponse.contentPreview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewId, createdAt, contentPreview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupReviewResponse {\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    contentPreview: ").append(toIndentedString(contentPreview)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
