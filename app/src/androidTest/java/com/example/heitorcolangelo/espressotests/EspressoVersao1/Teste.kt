package com.example.heitorcolangelo.espressotests.EspressoVersao1

import android.support.test.rule.ActivityTestRule
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity
import org.junit.Rule

class Teste {

    @Rule
    var mActivityRule: ActivityTestRule<LoginActivity> = ActivityTestRule<LoginActivity>(LoginActivity::class, false, true)
  //  @Rule var activityTestRule = ActivityTestRule(LoginActivity::class.java)
}