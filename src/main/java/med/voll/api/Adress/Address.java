package med.voll.api.Adress;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Address {
    private String street;
    private String neighborhood;
    private String zip;
    private String  city;
    private String state;
    private String number;
    private  String complement;
}
