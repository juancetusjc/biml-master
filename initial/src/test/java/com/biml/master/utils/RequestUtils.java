package com.biml.master.utils;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

public record RequestUtils(MockMvc mockMvc) {

    public ResultActions listEntity(String idMaster){
        MockHttpServletRequestBuilder builder= MockMvcRequestBuilders.get("/list")
        .queryParam("idMaster",idMaster);
        return doRequest(builder);
    }

    private ResultActions doRequest(MockHttpServletRequestBuilder builder) {
        try {
            return mockMvc.perform(builder).andDo(print());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public ResultActions ping(){
        MockHttpServletRequestBuilder builder= MockMvcRequestBuilders.get("/ping");
        return doRequest(builder);
    }

}