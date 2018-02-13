package ma.cashback.app.cucumber.stepdefs;

import ma.cashback.app.CashbackApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CashbackApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
