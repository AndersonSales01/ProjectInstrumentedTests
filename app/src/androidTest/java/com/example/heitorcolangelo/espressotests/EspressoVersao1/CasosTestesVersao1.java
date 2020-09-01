package com.example.heitorcolangelo.espressotests.EspressoVersao1;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import com.example.heitorcolangelo.espressotests.R;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isDialog;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

// Observações: Testes instrumentado é testar uma tela especifica, já os testes de UI engloba o fluxo inteiro.
// Por exemplo: Teste instrumentado seria por exemplo testar apenas a tela de lista de usuário,
// Testes de UI seria já realização de teste na tela de login e na tela de lista de usuário, ou seja o fluxo inteiro.
public class CasosTestesVersao1 {


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


    // Verifica se os componentes estão sendo exibidos na tela
    @Test
    public void primeiroTeste() {
        // Verifica se os componentes estão visiveis na tela
        onView(withId(R.id.login_image)).check(matches(isDisplayed()));
        onView(withId(R.id.login_username)).check(matches(isDisplayed()));
        onView(withId(R.id.login_password)).check(matches(isDisplayed()));
        onView(withId(R.id.login_button)).check(matches(isDisplayed()));
        onView(withText("Espresso Tests")).check(matches(isDisplayed()));
        //Verifica se o Hint do campo usuário está sendo exibindo com mensagem correta.
        onView(withId(R.id.login_username)).check(matches(withHint("Type your username")));
        //Verifica se o Hint do campo de senha está sendo exibindo com mensagem correta.
        onView(withId(R.id.login_password)).check(matches(withHint("Type your password")));
    }

    /*

    Cenário de teste:
    Quando eu clicar no botão de logar sem preencher usuário e senha.
    Então deverá ser apresentado um Popup de erro dizendo que terá que preencher os campos de email e senha

     */

    @Test
    public void segundoTeste() {
        // Realiza o evento de click do botão
        onView(withId(R.id.login_button)).perform(click());
        // Quando é referente dialog no android fica em root, então estou validado se o texto está no dialog e se dialog está sendo exibido.
        onView(withText("Important")).inRoot(isDialog()).check(matches(isDisplayed()));
        // Quando é referente dialog no android fica em root, então estou validado se o texto está no dialog e se dialog está sendo exibido.
        onView(withText(R.string.validation_message)).inRoot(isDialog()).check(matches(isDisplayed()));
    }

    /*

    Cenário de teste:
    Quando eu clicar no botão de logar e ter apenas o campo de E-mail preenchido
    Então deverá ser apresentado um Popup de erro dizendo que terá que preencher os campos de email e senha

     */

    @Test
    public void terceiroTeste() {
        //No código abaixo, no campo user name irá ser digitado o texto dentro do TypeText
        onView(withId(R.id.login_username)).perform(typeText("andersoncns19@gmail.com"));
        // Comando para fechar o teclado, pois ao digitar email e não fechar o teclado o espresso não vai identifica os outros componente visuais
        Espresso.closeSoftKeyboard();
        // Realiza o evento de click do botão
        onView(withId(R.id.login_button)).perform(click());
        // Quando é referente dialog no android fica em root, então estou validado se o texto está no dialog e se dialog está sendo exibido.
        onView(withText("Important")).inRoot(isDialog()).check(matches(isDisplayed()));
        // Quando é referente dialog no android fica em root, então estou validado se o texto está no dialog e se dialog está sendo exibido.
        onView(withText(R.string.validation_message)).inRoot(isDialog()).check(matches(isDisplayed()));
    }

    /*

    Cenário de teste:
    Quando eu clicar no botão de logar e ter apenas o campo de senha preenchido
    Então deverá ser apresentado um Popup de erro dizendo que terá que preencher os campos de email e senha

     */

    @Test
    public void quartoTeste() {
        //No código abaixo, no campo user name irá ser digitado o texto dentro do TypeText
        onView(withId(R.id.login_password)).perform(typeText("12345"));
        // Comando para fechar o teclado, pois ao digitar email e não fechar o teclado o espresso não vai identifica os outros componente visuais
        Espresso.closeSoftKeyboard();
        // Realiza o evento de click do botão
        onView(withId(R.id.login_button)).perform(click());
        // Quando é referente dialog no android fica em root, então estou validado se o texto está no dialog e se dialog está sendo exibido.
        onView(withText("Important")).inRoot(isDialog()).check(matches(isDisplayed()));
        // Quando é referente dialog no android fica em root, então estou validado se o texto está no dialog e se dialog está sendo exibido.
        onView(withText(R.string.validation_message)).inRoot(isDialog()).check(matches(isDisplayed()));
    }


    /*

    Cenário de teste:
    Quando eu clicar no botão de logar e ter apenas o campo de email e senha preenchido
    Então deverá ser apresentado a segunda tela com o titulo "Lista de Usuariosä

     */
    @Test
    public void quintoTeste() {
        //No código abaixo, no campo user name irá ser digitado o texto dentro do TypeText
        onView(withId(R.id.login_username)).perform(typeText("andersoncns19@gmail.com"));
        Espresso.closeSoftKeyboard();
        //No código abaixo, no campo user name irá ser digitado o texto dentro do TypeText
        onView(withId(R.id.login_password)).perform(typeText("12345"));
        // Comando para fechar o teclado, pois ao digitar email e não fechar o teclado o espresso não vai identifica os outros componente visuais
        Espresso.closeSoftKeyboard();
        // Realiza o evento de click do botão
        onView(withId(R.id.login_button)).perform(click());
        onView(withText("List of users")).check(matches(isDisplayed()));
    }

    /*

    Cenário de teste:
    Dado que eu esteja com o aplicativo aberto e que esteja visualizando a tela de "lista de usuários",
    quando eu clicar no botão externo do android "voltar", então deverá ser apresentado a tela de login novamente

     */

    @Test
    public void sextoTeste() throws InterruptedException {
        //No código abaixo, no campo user name irá ser digitado o texto dentro do TypeText
        onView(withId(R.id.login_username)).perform(typeText("andersoncns19@gmail.com"));
        Espresso.closeSoftKeyboard();
        //No código abaixo, no campo user name irá ser digitado o texto dentro do TypeText
        onView(withId(R.id.login_password)).perform(typeText("12345"));
        // Comando para fechar o teclado, pois ao digitar email e não fechar o teclado o espresso não vai identifica os outros componente visuais
        Espresso.closeSoftKeyboard();
        // Realiza o evento de click do botão
        onView(withId(R.id.login_button)).perform(click());
        onView(withText("List of users")).check(matches(isDisplayed()));
        Thread.sleep(5000);
        // Evento de click do botão voltar nativo do android
        Espresso.pressBack();
        // Verifica se os componentes estão visiveis na tela de login
        onView(withId(R.id.login_image)).check(matches(isDisplayed()));
        onView(withId(R.id.login_username)).check(matches(isDisplayed()));
        onView(withId(R.id.login_password)).check(matches(isDisplayed()));
        onView(withId(R.id.login_button)).check(matches(isDisplayed()));
        onView(withText("Espresso Tests")).check(matches(isDisplayed()));

    }

    /*

    Cenário de teste:
    Dado que eu esteja com o aplicativo aberto e que esteja visualizando a tela de "lista de usuários",
    quando eu realizar um scroll para baixo. Então a listae usuários deve ser movida para cima

     */
    @Test
    public void setimoTeste() throws InterruptedException {
//No código abaixo, no campo user name irá ser digitado o texto dentro do TypeText
        onView(withId(R.id.login_username)).perform(typeText("andersoncns19@gmail.com"));
        Espresso.closeSoftKeyboard();
        //No código abaixo, no campo user name irá ser digitado o texto dentro do TypeText
        onView(withId(R.id.login_password)).perform(typeText("12345"));
        // Comando para fechar o teclado, pois ao digitar email e não fechar o teclado o espresso não vai identifica os outros componente visuais
        Espresso.closeSoftKeyboard();
        // Realiza o evento de click do botão
        onView(withId(R.id.login_button)).perform(click());
        onView(withText("List of users")).check(matches(isDisplayed()));
        Thread.sleep(5000);
        onView(withId(R.id.recycler_view)).perform(swipeUp(), click());
        Thread.sleep(2000);
    }

}
