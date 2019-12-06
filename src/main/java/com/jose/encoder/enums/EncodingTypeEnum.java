package com.jose.encoder.enums;

public enum EncodingTypeEnum {
    MD5("MD5"), BCRYPT("BCRYPT"), SHA1("SHA-1"), SHA2("SHA-256");

    private final String value;

    EncodingTypeEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }
}
