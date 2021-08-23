package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
