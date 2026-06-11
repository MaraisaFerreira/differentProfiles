package maraisaferreira.com.git.DifferentProfiles.dto.response;

import lombok.Builder;
import maraisaferreira.com.git.DifferentProfiles.entities.enums.ProductCategories;

@Builder
public record ProductResponseDto(
        Long id,
        String name,
        Double price,
        Integer quantity,
        ProductCategories category
) {
}
