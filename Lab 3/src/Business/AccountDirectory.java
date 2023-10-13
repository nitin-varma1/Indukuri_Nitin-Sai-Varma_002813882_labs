/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class AccountDirectory {
    private ArrayList<Account> accountList;
    
    public AccountDirectory(){
        this.accountList = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    public Account addAccount(){
        Account newAccount = new Account();
        accountList.add(newAccount);
        return newAccount;
    }
    
    public void deleteAccount(Account account){
        accountList.remove(account);
    }
    
    public Account searchAccount(int accountNumber){
        for(Account account: accountList){
            if(accountNumber==account.getAccountNumber())
                return account;
        }
        return null;
    }
}
