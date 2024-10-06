package com.biml.master;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.context.WebApplicationContext;
import com.biml.master.app.*;

import com.biml.master.utils.RequestUtils;

@SpringBootTest(classes= Application.class)
//@ExtendWith({SpringExtension.class,MockitoExtension.class})
@ActiveProfiles("test")
public abstract class GenericTest {

    @Autowired
    private WebApplicationContext context;

    public abstract void before() throws Exception;
    public abstract void after();
    public RequestUtils requestUtils;

    public void beforeImp()throws Exception{

    }

    public void afterImp(){
        
    }
 
}
