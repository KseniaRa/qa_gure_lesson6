package tests_allure;

import org.junit.jupiter.api.Test;

public class Steps {

    private static final String REPOSITORY = "3osnovy_java";
    private static final int ISSUE_NUMBER = 1;

    private WebSteps steps = new WebSteps();

    @Test
    public void shouldSeeIssueInRepository() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }

}


