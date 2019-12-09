package personalfinance.saveload;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import personalfinance.exception.ModelException;
import personalfinance.model.*;


public final class SaveData {

    private static SaveData instance;
    private List<Article> articles = new ArrayList();
    private List<Currency> currencies = new ArrayList();
    private List<Account> accounts = new ArrayList();
    private List<Transaction> transactions = new ArrayList();
    private List<Transfer> transfers = new ArrayList();



    private SaveData() {
 /*       load();
        this.filter = new Filter();*/
    }

/*    public void load() {
        SaveLoad.load(this);
        sort();
        for (Account a : accounts) {
            a.setAmountFromTransactionsAndTransfers(transactions, transfers);
        }
    }*/


    public static SaveData getInstance() {
        if (instance == null) instance = new SaveData();
        return instance;
    }


    public List<Article> getArticles() {
        return articles;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Transfer> getTransfers() {
        return transfers;
    }


    public Currency getBaseCurrency() {
        for (Currency c : currencies)
            if (c.isBase()) return c;
        return new Currency();
    }




}
