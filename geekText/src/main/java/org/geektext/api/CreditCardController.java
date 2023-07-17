package org.geektext.api;

import org.geektext.dao.CreditCardDao;
import org.geektext.dao.CreditCardRepository;
import org.geektext.model.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class CreditCardController {

   @Autowired
   CreditCardDao creditCardRepo;

    @Autowired
    public CreditCardController(CreditCardRepository creditCardRepository){
        this.creditCardRepo = creditCardRepository;
    }

    @PostMapping("/createcreditcard")
    public ResponseEntity<String> addCreditCard(@RequestBody CreditCard card){
        try{
            creditCardRepo.insertCard(new CreditCard(card.getCardNumber(), card.getName(), card.getCvv(), card.getCvv()));
            return new ResponseEntity<>("CreditCard was created successfully", HttpStatus.CREATED);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
