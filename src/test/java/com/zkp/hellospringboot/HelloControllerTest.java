package com.zkp.hellospringboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception{

        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();

    }


    @Test
    public void TestHello() throws Exception{
        mvc. perform(MockMvcRequestBuilders.get("/hello?name=zkp"));
    }
}
