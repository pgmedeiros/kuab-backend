package com.kuab.application.application.adapters.course.controller;

import com.kuab.application.domain.course.services.GetCourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@AutoConfigureDataJpa
@WebMvcTest(GetCourseController.class)
public class GetCourseControllerWithContextTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private GetCourseService service;
    @Test
    void test() throws Exception {

        MockHttpServletResponse response = mvc
                .perform(get("/"))
                .andReturn()
                .getResponse();

        assertThat(response.getContentAsString()).isEqualTo("[]");
    }

}
