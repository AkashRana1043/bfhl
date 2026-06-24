package com.akash.bfhl.service;

import com.akash.bfhl.dto.RequestDto;
import com.akash.bfhl.dto.ResponseDto;

public interface BfhlService {
    ResponseDto process(RequestDto request);
}