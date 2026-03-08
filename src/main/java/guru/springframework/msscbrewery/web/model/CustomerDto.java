package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
public class CustomerDto {
    private UUID id;
    @NotNull
    @Size(min = 3, max = 100)
    @NotBlank
    private String name;
}
