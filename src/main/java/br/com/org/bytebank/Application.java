package br.com.org.bytebank;

import br.com.org.bytebank.model.Accounts.SavingsAccount;
import br.com.org.bytebank.model.address.Address;
import br.com.org.bytebank.model.client.Client;

public class Application {
    public static void main(String[] args) {
        Address address = new Address("São Paulo", "Rua florestopolis","Casa 2", 255);
        Client client = new Client("Thiago",21, address);
        SavingsAccount account = new SavingsAccount(client, "T123");
        account.deposit(1000);
        System.out.println(account);
    }
}