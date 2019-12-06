package com.jose.encoder.utils;

import com.jose.encoder.enums.EncodingTypeEnum;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncodingUtils {
    /**
     * Encodes the input using the encoding type
     * @param input
     * @param encodingType
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String encode(String input, EncodingTypeEnum encodingType) throws NoSuchAlgorithmException {
        if(encodingType.name().equals("BCRYPT")){
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            return encoder.encode(input);
        }else {
            MessageDigest digest = MessageDigest.getInstance(encodingType.toString());
            byte[] encodedHash = digest.digest(
                    input.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : encodedHash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        }
    }
}
