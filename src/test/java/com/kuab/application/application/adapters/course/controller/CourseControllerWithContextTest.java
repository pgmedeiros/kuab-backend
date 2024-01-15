package com.kuab.application.application.adapters.course.controller;

import com.kuab.application.application.adapters.course.controller.CourseController;
import com.kuab.application.application.adapters.course.repository.JpaCourseRepository;
import com.kuab.application.domain.course.ports.in.CoursePort;
import com.kuab.application.domain.course.ports.out.CourseDatabasePort;
import com.kuab.application.domain.course.services.CourseService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@AutoConfigureDataJpa
@WebMvcTest(CourseController.class)
public class CourseControllerWithContextTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CourseService service;
    @Test
    void test() throws Exception {

        MockHttpServletResponse response = mvc
                .perform(get("/"))
                .andReturn()
                .getResponse();

        assertThat(response.getContentAsString()).isEqualTo("[]");
    }

}
