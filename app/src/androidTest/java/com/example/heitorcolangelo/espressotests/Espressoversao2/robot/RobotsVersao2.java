package com.example.heitorcolangelo.espressotests.Espressoversao2.robot;

import com.example.heitorcolangelo.espressotests.R;
import com.example.heitorcolangelo.espressotests.common.ScreenRobot;

import static com.example.heitorcolangelo.espressotests.Espressoversao2.constants.ConstantsVersao2.EMAIL;
import static com.example.heitorcolangelo.espressotests.Espressoversao2.constants.ConstantsVersao2.HINT_EMAIL;
import static com.example.heitorcolangelo.espressotests.Espressoversao2.constants.ConstantsVersao2.HINT_SENHA;
import static com.example.heitorcolangelo.espressotests.Espressoversao2.constants.ConstantsVersao2.SENHA;
import static com.example.heitorcolangelo.espressotests.Espressoversao2.constants.ConstantsVersao2.TITLE_LIST_OF_USERS;
import static com.example.heitorcolangelo.espressotests.Espressoversao2.constants.ConstantsVersao2.TITLE_LOGIN;
import static com.example.heitorcolangelo.espressotests.Espressoversao2.constants.ConstantsVersao2.TXT1_POPUP;
import static com.example.heitorcolangelo.espressotests.Espressoversao2.constants.ConstantsVersao2.TXT2_POPUP;

public class RobotsVersao2 extends ScreenRobot<RobotsVersao2> {

    public static final int IMAGE_LOGIN = R.id.login_image;
    public static final int CAMPO_EMAIL = R.id.login_username;
    public static final int CAMPO_SENHA = R.id.login_password;
    public static final int BTN_LOGIN = R.id.login_button;
    public static final int VIEW_FOR_SCROLL = R.id.recycler_view;


    public RobotsVersao2 verificarElementoImage() {
        checkIsDisplayed(IMAGE_LOGIN);
        return this;
    }

    public RobotsVersao2 verificarCampoLogin() {
        checkViewHasHint(CAMPO_EMAIL, HINT_EMAIL);
        return this;
    }

    public RobotsVersao2 verificarCampoSenha() {
        checkViewHasHint(CAMPO_SENHA, HINT_SENHA);
        return this;
    }

    public RobotsVersao2 verificarBotaoLogin() {
        checkIsDisplayed(BTN_LOGIN);
        return this;
    }

    public RobotsVersao2 verificarTituloNaTela() {
        checkViewContainsText(TITLE_LOGIN);
        return this;
    }

    public RobotsVersao2 clicarNoBotaoLogin() {
         clickOnView(BTN_LOGIN);
        return this;
    }

    public RobotsVersao2 verificarPopup() {
        checkDialogWithTextIsDisplayed(TXT1_POPUP);
        checkDialogWithTextIsDisplayed(TXT2_POPUP);
        return this;
    }

    public RobotsVersao2 escreverEmail() {
        enterTextIntoView(CAMPO_EMAIL,EMAIL);
        return this;
    }

    public RobotsVersao2 escreverSenha() {
        enterTextIntoView(CAMPO_SENHA,SENHA);
        return this;
    }

    public RobotsVersao2 verificarTituloTela2() {
        checkViewContainsText(TITLE_LIST_OF_USERS);
        return this;
    }

    public RobotsVersao2 clicarEmVoltar() {
        pressBack();
        return this;
    }

    public RobotsVersao2 scrolarParaBaixo() {
        scrollViewDown(VIEW_FOR_SCROLL);
        return this;
    }
}
