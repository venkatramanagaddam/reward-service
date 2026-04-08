
package com.example.rewards;

import com.example.rewards.util.RewardUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RewardUtilTest {

  @Test void test120() { assertEquals(90, RewardUtil.calculate(120)); }
  @Test void test75() { assertEquals(25, RewardUtil.calculate(75)); }
}
