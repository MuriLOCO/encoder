package com.jose.encoder.web;

import com.jose.encoder.enums.EncodingTypeEnum;
import com.jose.encoder.services.EncoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;

@RestController
public class EncoderController {

    @Autowired
    private EncoderService encoderService;

    @RequestMapping(value = "/encode", method = RequestMethod.POST)
    public String encodePassword(@RequestParam String input,
                                 @RequestParam EncodingTypeEnum encodingType) throws NoSuchAlgorithmException {
        return encoderService.encode(input, encodingType);
    }
}
