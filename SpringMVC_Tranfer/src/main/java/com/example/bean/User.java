package com.example.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author lei
 * @date 2024/3/18$
 */
public class User implements Serializable {
    private String username;
    private String password;
    private Integer age;
    private List<Account> accounts;
    private Map<String,Account> accountMap;
    //getters and setters
    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", age="+ age + ",\n accounts=" + accounts + ",\n accountMap=" + accountMap + "]";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Map<String, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<String, Account> accountMap) {
        this.accountMap = accountMap;
    }
}
