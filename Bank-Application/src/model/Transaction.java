package model;

import java.time.LocalDateTime;

public class Transaction {
    private int transactionID;
    private long accountNumber;
    private String transactionType;
    private double amount;
    private LocalDateTime timestamp;
    private long relatedAccountNumber;
    private String description;

    public Transaction(long accountNumber, String transactionType, double amount, LocalDateTime timestamp, long relatedAccountNumber, String description) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = timestamp;
        this.relatedAccountNumber = relatedAccountNumber;
        this.description = description;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public long getRelatedAccountNumber() {
        return relatedAccountNumber;
    }

    public void setRelatedAccountNumber(long relatedAccountNumber) {
        this.relatedAccountNumber = relatedAccountNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
