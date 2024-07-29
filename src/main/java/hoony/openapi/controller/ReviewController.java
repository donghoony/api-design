package hoony.openapi.controller;

import hoony.openapi.api.ReviewsApi;
import hoony.openapi.model.GroupReviewResponse;
import java.util.List;
import org.springframework.http.ResponseEntity;

public class ReviewController implements ReviewsApi {

    @Override
    public ResponseEntity<List<GroupReviewResponse>> findReviews(Long groupId) {
        return null;
    }
}
