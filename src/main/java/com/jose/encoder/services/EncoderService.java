package com.jose.encoder.services;

import com.jose.encoder.enums.EncodingTypeEnum;
import com.jose.encoder.utils.EncodingUtils;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class EncoderService {

    /**
     * Encodes the input with the given encoding strategy
     * @param input
     * @param encodingType
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String encode(String input, EncodingTypeEnum encodingType) throws NoSuchAlgorithmException {
        return EncodingUtils.encode(input, encodingType);
    }
}

