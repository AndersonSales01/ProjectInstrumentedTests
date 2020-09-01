package com.example.heitorcolangelo.espressotests.Espressoversao2;

import android.support.test.rule.ActivityTestRule;

import com.example.heitorcolangelo.espressotests.Espressoversao2.robot.RobotsVersao2;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class CasosDeTesteVersao2 {

    // Rule define qual tela será aberto primeiro
    //Obs: A cada cenário de teste ele execute Rule ou seja abre a tela de login toda vez para cada cenario.
    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

    @Before
    public void setup() {
    }

    @After
    public void finish() {
    }

    @Test
    public void testeNumero1() {
        new RobotsVersao2()
                .verificarBotaoLogin()
                .verificarCampoLogin()
                .verificarCampoSenha()
                .verificarElementoImage()
                .verificarTituloNaTela();
    }

    @Test
    public void testeNumero2() {
        new RobotsVersao2()
                .clicarNoBotaoLogin()
                .verificarPopup();
    }

    @Test
    public void testeNumero3() {
        new RobotsVersao2()
                .escreverEmail()
                .clicarNoBotaoLogin()
                .verificarPopup();
    }

    @Test
    public void testeNumero4() {
        new RobotsVersao2()
                .escreverSenha()
                .clicarNoBotaoLogin()
                .verificarPopup();
    }

    @Test
    public void testeNumero5() {
        new RobotsVersao2()
                .escreverEmail()
                .escreverSenha()
                .clicarNoBotaoLogin()
                .verificarTituloTela2();
    }

    @Test
    public void testeNumero6() {
        new RobotsVersao2()
                .escreverEmail()
                .escreverSenha()
                .clicarNoBotaoLogin()
                .verificarTituloTela2()
                .clicarEmVoltar()
                .verificarTituloNaTela()
                .verificarCampoLogin()
                .verificarCampoSenha()
                .verificarBotaoLogin()
                .verificarElementoImage();
    }

    @Test
    public void testeNumero7() throws InterruptedException {
        new RobotsVersao2()
                .escreverEmail()
                .escreverSenha()
                .clicarNoBotaoLogin()
                .verificarTituloTela2()
                .sleep(5)
                .scrolarParaBaixo()
                .sleep(5);
    }
}
