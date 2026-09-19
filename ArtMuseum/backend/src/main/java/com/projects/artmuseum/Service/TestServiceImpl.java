package com.projects.artmuseum.Service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}