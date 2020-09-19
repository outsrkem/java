package com.java2;

/**
 * 练习：
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("jane", "Smith");
        Account acct = new Account(1000, 2000, 0.0123);
        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println("姓名：" + cust.getLastName() + " " + cust.getFirstName());
        System.out.println("余额：" + cust.getAccount().getBalance());
        System.out.println("ID：" + cust.getAccount().getId());
        System.out.println("利率：" + cust.getAccount().getAnnualInterestRate() * 100 + "%");


    }
}
