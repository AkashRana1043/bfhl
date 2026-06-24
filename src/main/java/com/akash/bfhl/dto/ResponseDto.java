package com.akash.bfhl.dto;

import lombok.Data;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class ResponseDto {

    @JsonProperty("is_success")
    private boolean success;


    private String user_id;
    private String email;
    private String roll_number;

    private List<String> odd_numbers;
    private List<String> even_numbers;
    private List<String> alphabets;
    private List<String> special_characters;

    private String sum;
    private String concat_string;
}