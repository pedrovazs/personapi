package one.digitalinnovation.personapi.utils;


import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final Long PHONE_ID = 1L;
    private static final String NUMBER = "(61) 9 8975-4561";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
