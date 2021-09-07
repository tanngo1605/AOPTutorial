package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

// import javax.annotation.PostConstruct;
// import javax.annotation.PreDestroy;

import com.example.demo.Account;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class AccountDAO {
    private String name;
    private String level;
    private List<Account> accounts;

    AccountDAO() {
        accounts = new ArrayList<>();
        System.out.println("AccountDAO constructor");
    }

    // @PostConstruct
    // public void init(){
    // System.out.println("AccountDAO Post construct");
    // }

    // @PreDestroy
    // public void destroy(){
    // System.out.println("AccountDAO Pre destroy");
    // }

    public String getName() {
        System.out.println(getClass() + " getName");
        return name;
    }

    public void throwExp() {
        throw new RuntimeException("Simulate runtime exception");
    }

    @Override
    public String toString() {
        return "AccountDAO [accounts=" + accounts + ", level=" + level + ", name=" + name + "]";
    }

    public void setName(String name) {
        System.out.println(getClass() + " setName");
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int addAccount() {
        System.out.println(this.getClass() + ": Adding account");
        return 1;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
        System.out.println(getClass() + " Adding account: " + account);
    }

    public void addAccount(Account account, int age) {
        this.accounts.add(account);
        System.out.println(getClass() + " Adding account: " + account);
    }

    public List<Account> findAccounts() {
        return this.accounts;
    }
}
