package com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    private boolean isVIP;
    public void addAccountMember() {
        System.out.println(getClass() + " add account membership");
    }
    public boolean getIsVIP() {

        return isVIP;
    }
    public void setVIP(boolean isVIP) {
        System.out.println(getClass() + " set VIP");
        this.isVIP = isVIP;
    }

    
}
