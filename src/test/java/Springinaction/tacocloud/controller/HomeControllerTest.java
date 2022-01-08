package Springinaction.tacocloud.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author Elshad Jabbarov
 * 14.11.2021
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest()
class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    void testHomePage() throws Exception {
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("home"))
//                .andExpect(content().string(
//                        containsString("Welcome to...")));
//    }
}
