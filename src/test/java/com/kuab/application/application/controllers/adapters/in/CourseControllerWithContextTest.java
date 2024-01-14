package com.kuab.application.application.controllers.adapters.in;

import com.kuab.application.application.adapters.course.controller.CourseController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@AutoConfigureJsonTesters
@WebMvcTest(CourseController.class)
public class CourseControllerWithContextTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void test() throws Exception {

        MockHttpServletResponse response = mvc
                .perform(get("/"))
                .andReturn()
                .getResponse();

        assertThat(response.getContentAsString()).isEqualTo("Olá");
    }

}
