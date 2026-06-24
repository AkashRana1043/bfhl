package com.akash.bfhl.service;

import com.akash.bfhl.dto.RequestDto;
import com.akash.bfhl.dto.ResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public ResponseDto process(RequestDto request) {

        List<String> odd = new ArrayList<>();
        List<String> even = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> special = new ArrayList<>();

        long sum = 0;

        StringBuilder allLetters = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {

                long num = Long.parseLong(item);

                sum += num;

                if (num % 2 == 0)
                    even.add(item);
                else
                    odd.add(item);

            } else if (item.matches("[a-zA-Z]+")) {

                alphabets.add(item.toUpperCase());

                allLetters.append(item);

            } else {

                special.add(item);
            }
        }

        ResponseDto response = new ResponseDto();

        response.setSuccess(true);

        response.setUser_id("akash_deep_singh_rana_24062026");
        response.setEmail("akash1043.be23@chitkarauniversity.edu.in");
        response.setRoll_number("2311981043");

        response.setOdd_numbers(odd);
        response.setEven_numbers(even);
        response.setAlphabets(alphabets);
        response.setSpecial_characters(special);

        response.setSum(String.valueOf(sum));
        response.setConcat_string(buildConcat(allLetters.toString()));

        return response;
    }

    private String buildConcat(String input) {

        String reversed =
                new StringBuilder(input)
                        .reverse()
                        .toString();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {

            char c = reversed.charAt(i);

            if (i % 2 == 0)
                result.append(Character.toUpperCase(c));
            else
                result.append(Character.toLowerCase(c));
        }

        return result.toString();
    }
}