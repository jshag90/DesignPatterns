package com.ji.structural_patterns.adapter.after;

import com.ji.structural_patterns.adapter.after.security.LoginHandler;
import com.ji.structural_patterns.adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountuserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("seonhak", "seonhak");
        System.out.println(login);
    }
}
