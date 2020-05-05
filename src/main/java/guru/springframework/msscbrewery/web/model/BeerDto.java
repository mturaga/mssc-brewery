package guru.springframework.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    public UUID id;
    public String beerName;
    public String beerStyle;
    public Long upc;

}
