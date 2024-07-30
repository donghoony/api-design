package hoony.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PreviewKeywordResponse
 */
@lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.7.0")
public class PreviewKeywordResponse {

  private Long keywordId;

  private String keywordName;

  public PreviewKeywordResponse keywordId(Long keywordId) {
    this.keywordId = keywordId;
    return this;
  }

  /**
   * 키워드 ID
   * @return keywordId
   */
  
  @Schema(name = "keywordId", example = "2435", description = "키워드 ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywordId")
  public Long getKeywordId() {
    return keywordId;
  }

  public void setKeywordId(Long keywordId) {
    this.keywordId = keywordId;
  }

  public PreviewKeywordResponse keywordName(String keywordName) {
    this.keywordName = keywordName;
    return this;
  }

  /**
   * 키워드 이름
   * @return keywordName
   */
  
  @Schema(name = "keywordName", example = "의견을 잘 조율해요", description = "키워드 이름", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywordName")
  public String getKeywordName() {
    return keywordName;
  }

  public void setKeywordName(String keywordName) {
    this.keywordName = keywordName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewKeywordResponse previewKeywordResponse = (PreviewKeywordResponse) o;
    return Objects.equals(this.keywordId, previewKeywordResponse.keywordId) &&
        Objects.equals(this.keywordName, previewKeywordResponse.keywordName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordId, keywordName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewKeywordResponse {\n");
    sb.append("    keywordId: ").append(toIndentedString(keywordId)).append("\n");
    sb.append("    keywordName: ").append(toIndentedString(keywordName)).append("\n");
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

