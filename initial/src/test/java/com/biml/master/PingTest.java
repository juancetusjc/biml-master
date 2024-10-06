package com.biml.master;

import org.junit.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


 class PingTest extends GenericTest{

    @Test
    void ping() throws Exception{
        requestUtils.ping().andExpect(status().isOk()).andExpect(content().string("pong"));
    }


    @Override
    public void before() throws Exception {
        super.beforeImp();
    }

    @Override
    public void after() {
        super.afterImp();
    }
    
}
