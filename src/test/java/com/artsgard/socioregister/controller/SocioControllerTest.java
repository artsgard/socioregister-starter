package com.artsgard.socioregister.controller;

import com.artsgard.socioregister.controller.SocioController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

/**
 *
 * @author WillemDragstra
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(SocioController.class)
public class SocioControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void testSinglePageController() throws Exception {
        MvcResult result = mockMvc
                .perform(get("/socio/starter"))
                .andExpect(content().contentType(MediaType.TEXT_PLAIN + ";charset=UTF-8"))
                .andExpect(status().isOk()).andReturn();
        String content = result.getResponse().getContentAsString();
       
        assertThat("Socio Starter").isEqualTo(content);
    }
}
