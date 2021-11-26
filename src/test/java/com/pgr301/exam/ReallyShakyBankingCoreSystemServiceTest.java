package com.pgr301.exam;

import com.pgr301.exam.model.Account;
import io.restassured.http.ContentType;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.hamcrest.Matchers;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import javax.annotation.PostConstruct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/*@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ReallyShakyBankingCoreSystemServiceTest {

    @Autowired
    private BankAccountController bankAccountController;

    @Autowired
    private ReallyShakyBankingCoreSystemService reallyShakyBankingCoreSystemService;

    @LocalServerPort
    protected int port = 0;

    @Before
    @After
    public void init()
    {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    public void updateAccount(){
        Account a = new Account();
        a.setId("asd");
        a.setCurrency("NOK");
        a.setBalance(BigDecimal.valueOf(524050));

        reallyShakyBankingCoreSystemService.getAccount("asd");
        assertEquals(524050, reallyShakyBankingCoreSystemService.balance("asd"));
      //  reallyShakyBankingCoreSystemService.updateAccount(Account("asd"));
    }

   // @Test
    public void getAccountsById() throws Exception{
        ReallyShakyBankingCoreSystemService service = new ReallyShakyBankingCoreSystemService();
        String account1 = "asd";

        service.getAccount(account1);
    }

    @Test
    public void createAccount(){
        String id = "asd";


        Account account = given().contentType(ContentType.JSON)
                .body(id)
                .post()
                .then()
                .statusCode(200)
                .extract().as(Account.class);

        assertEquals(account.getId(), id);
    }
}
*/