package digital.innovation.one.personmanagerapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Homme"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
