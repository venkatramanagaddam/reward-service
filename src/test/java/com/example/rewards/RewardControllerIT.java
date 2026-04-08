
package com.example.rewards;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RewardControllerIT {

  @Autowired
  MockMvc mockMvc;

  @Test
  void testGet() throws Exception {
    mockMvc.perform(get("/api/rewards/1"))
        .andExpect(status().isOk());
  }
}
