package de.ahus1.bdd.calculator.guistyle.bdd;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.integration.spring.JGivenStage;
import de.ahus1.bdd.calculator.application.CalculatorApplication;
import de.ahus1.bdd.calculator.guistyle.website.StartPage;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

@JGivenStage
public class ThenCalculatorGuiOutcome<SELF extends ThenCalculatorGuiOutcome<?>> extends Stage<SELF> {

    @ProvidedScenarioState
    private StartPage startPage;

    @Autowired
    // @SpyBean annotation already present in GivenCalculatorGuiStage, must not be repeated here
    private CalculatorApplication calculatorApplication;

    public SELF state_$_is_shown(long val) {
        startPage.assertStateIs(val);
        return self();
    }

    public SELF increment_has_been_called() {
        Mockito.verify(calculatorApplication).add(1);
        return self();
    }

}
