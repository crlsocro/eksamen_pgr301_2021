package com.pgr301.exam;


import com.pgr301.exam.model.Account;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(BankAccountController.class)
public class BankAccountControllerTest {

    @Autowired
    private BankAccountController bankAccountController;

    @Autowired
    private BankingCoreSystmeService bankService;

    @Autowired
    private ReallyShakyBankingCoreSystemService reallyShakyBankingCoreSystemService;

    @Autowired
    private MockMvc mvc;

    private List<Account> accountList;

    @BeforeEach
    void init(){
        this.accountList = new ArrayList<>();
        Account a = new Account();
        a.setId("asd");
        a.setCurrency("NOK");
        a.setBalance(BigDecimal.valueOf(524050));
        return;
    }


}
