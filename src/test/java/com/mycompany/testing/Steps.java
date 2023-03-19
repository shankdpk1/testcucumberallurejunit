package com.mycompany.testing;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.*;
import java.util.Arrays;
import org.junit.Assert;
import ru.yandex.qatools.allure.annotations.Attachment;

/**
 * @author Viktor Sidochenko viktor.sidochenko@gmail.com
 */
public class Steps {

    int a;
    int b;
    int c;
    int sum;


    @Given("^print$")
    public void print() throws Throwable {
        System.out.println("HELLO");;
    }

    @Given("^first digit (\\d+)$")
    public void firstDigit(int digit) throws Throwable {
        a = digit;
    }

    @And("^second digit (\\d+)$")
    public void secondDigit(int digit) throws Throwable {
        b = digit;
    }

    public void thirdDigit(int digit) throws Throwable {
        c = digit;
    }


    @When("^I multiply it$")
    public void multiply() throws Throwable {
        sum = a + b + c;
    }

    @Then("^sum is (\\d+)$")
    public void sum(int result) throws Throwable {
        Assert.assertEquals(result, sum);
    }



    @Attachment()
    private byte[] createAttachment(String att) {
        String content = att;
        return content.getBytes();
    }

    @And("^waiting$")
    public void waiting() throws Throwable {
        Thread.sleep(5000);
        System.out.println("wait");;
    }
}
