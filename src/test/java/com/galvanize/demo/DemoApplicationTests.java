package com.galvanize.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(HelloController.class)
public class DemoApplicationTests {

	@Autowired
	MockMvc mvc;

	@Test
	void contextLoads() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/math/pi");
		this.mvc.perform(request).andExpect(content().string("3.141592653589793"));
	}

}
