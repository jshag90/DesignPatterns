package com.ji.structural_patterns.adapter.after;

import com.ji.structural_patterns.adapter.after.security.UserDetails;
import com.ji.structural_patterns.adapter.after.security.UserDetailsService;

public class AccountuserDetailsService implements UserDetailsService {
    AccountService accountService;

    public AccountuserDetailsService(AccountService accountService){
        this.accountService = accountService;
    }
    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
