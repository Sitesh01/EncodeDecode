package com.encodedecode.encodedecode;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Base64;

@CrossOrigin
@RestController
public class Enco {

    static class BodyData {
        private String inputText;

        public String getInputText() {
            return inputText;
        }

        public void setInputText(String inputText) {
            this.inputText = inputText;
        }
    }

    @PostMapping("/encode")
    public String encode(@RequestBody BodyData bodyData) {
        String inputText = bodyData.getInputText();
        byte[] encodedBytes = Base64.getEncoder().encode(inputText.getBytes());
        return new String(encodedBytes);
    }

    @PostMapping("decode")
    public String decode(@RequestBody BodyData bodyData) {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(bodyData.getInputText());
            return new String(decodedBytes);
        } catch (Exception e) {
            // Log the exception details
            e.printStackTrace();
            return "Error: Unable to decode input." + e.getMessage();
        }
    }

}
