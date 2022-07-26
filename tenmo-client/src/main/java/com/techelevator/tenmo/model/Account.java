package com.techelevator.tenmo.model;


public class Account {

    private Long accountId;
    private Long userId;
    private Double balance;

    public Account(Long accountId, Long userId, Double balance) {
        this.accountId = accountId;
        this.userId = userId;
        this.balance = balance;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return  "accountId = " + accountId +
                ", userId = " + userId +
                ", balance = " + balance +
                '}';
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}