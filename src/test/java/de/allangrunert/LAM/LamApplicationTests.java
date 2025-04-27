package de.allangrunert.LAM;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class LamApplicationTests {

	@Autowired
	de.allangrunert.lam.controller.LectureController lectureController;

	@Autowired
	MockMvc mvc;
	

	/*
	@Test	
	void contextLoads() {
		assertNotNull(lectureController);		
	}*/

	// Integration test for the /api/lectures endpoint

	/*
	@Test
	void testLectures() throws Exception {
		ResultActions result = mvc.perform(
			MockMvcRequestBuilders.get("/api/lectures"))
			// .with(csrf()) // Uncomment if CSRF protection is enabled
			// .with(user(TEST_USER_ID))
			// .with(anonymous())
			// .content
			// .contentType(MediaType.APPLICATION_JSON)
			.andExpect(status().isOk());

		String content = result.andReturn().getResponse().getContentAsString();
		assertNotNull(content);
		assertTrue(content.contains("["));
		assertTrue(content.contains("]"));
	}*/

}
