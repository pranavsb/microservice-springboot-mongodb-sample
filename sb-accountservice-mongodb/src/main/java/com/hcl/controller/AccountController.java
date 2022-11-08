package com.hcl.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.AccountModel;
import com.hcl.repository.AccountRepository;

@RestController
@RequestMapping("/sb")
public class AccountController {

  @Autowired AccountRepository accountRepository;

  @RequestMapping(
      value = "/add",
      method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  public String addAccount(@RequestBody AccountModel accountModel) {
    accountRepository.save(accountModel);
    return "Account added successfully";
  }

  @RequestMapping(
      value = "/getAll",
      method = RequestMethod.GET,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Collection<AccountModel>> getAllAccounts() {
	  List<AccountModel> accounts =
              (List<AccountModel>) accountRepository.findAll();
      return ResponseEntity.ok(accounts);
  }
}
