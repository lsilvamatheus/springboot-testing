package com.lsilva.matheus.springboottesting;

import com.lsilva.matheus.springboottesting.controller.HelloWorldController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = HelloWorldController.class)
class SpringbootTestingApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@BeforeAll
	public static void setup() {

	}

	@Test
	void testHelloWorld() throws Exception {
		this.mockMvc
				.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World"));
	}

}
