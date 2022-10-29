package com.unireg.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unireg.persistence.domain.Student;

//	import static org.assertj.core.api.Assertions.assertThat;
//	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
//	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
//	import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//	import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//	import java.util.ArrayList;
//	import java.util.Arrays;
//	import java.util.List;
//
//	import org.junit.jupiter.api.Test;
//	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//	import org.springframework.boot.test.context.SpringBootTest;
//	import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//	import org.springframework.http.HttpMethod;
//	import org.springframework.http.MediaType;
//	import org.springframework.test.context.jdbc.Sql;
//	import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
//	import org.springframework.test.web.servlet.MockMvc;
//
//	import com.fasterxml.jackson.core.JsonProcessingException;
//	import com.fasterxml.jackson.databind.ObjectMapper;
//	import com.qa.demo.persistence.domain.Person;
//import com.unireg.persistence.domain.Student;
//
//	@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//	@AutoConfigureMockMvc
//	@Sql(scripts = "classpath:person-data.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
/*public class StudentControllerTest {
//
		@Autowired
		private MockMvc mockMVC;

		@Autowired
		private ObjectMapper mapper;

		private final Student TEST_STUDENT = new Student();

		private final Student TEST_SAVED_STUDENT = new Student();

		@Test
		public void testCreate() throws JsonProcessingException, Exception {
			String resultString = this.mockMVC
					.perform(post("/student/create").contentType(MediaType.APPLICATION_JSON)
							.content(this.mapper.writeValueAsString(TEST_STUDENT)))
					.andExpect(status().isCreated()).andReturn().getRequest().getContentAsString();

			Student result = this.mapper.readValue(resultString, Student.class);
			assertThat(result).isEqualTo(TEST_STUDENT);
		}

		@Test
		public void testReadOne() throws Exception {
			this.mockMVC.perform(get("/student/read/1")).andExpect(status().isOk())
					.andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_STUDENT)));

		}

		@Test
		public void testZZZ() throws Exception {
			final List<Person> STUDENT = new ArrayList<>();
			STUDENT.add(TEST_SAVED_STUDENT);

			final String resultString = this.mockMVC
					.perform(request(HttpMethod.GET, "/student/readAll").accept(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

			List<Student> results = Arrays.asList(mapper.readValue(resultString, Student[].class));
			assertThat(results).contains(this.TEST_STUDENT).hasSize(3);
		}

		@Test
		public void testUpdate() throws Exception {
			final Student newStudent = new Student(null, 26, "Chris Perrins");
			String resultString = this.mockMVC
					.perform(put("/student/update/3").contentType(MediaType.APPLICATION_JSON)
							.content(this.mapper.writeValueAsString(newStudent)))
					.andExpect(status().isAccepted()).andReturn().getRequest().getContentAsString();

			Student result = this.mapper.readValue(resultString, Student.class);
			assertThat(result).isEqualTo(newStudent);
		}

//		@Test
//		public void testDelete() throws Exception {
//			this.mockMVC.perform(delete("/student/delete/2")).andExpect(status().isNoContent());
		}
	}
*/


		