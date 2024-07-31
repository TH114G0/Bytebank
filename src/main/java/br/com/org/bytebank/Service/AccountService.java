package br.com.org.bytebank.Service;

import br.com.org.bytebank.model.Accounts.Account;

/**
 * Interface AccountService com contratos especificos como por exemplo:
 * <ul>
 *       <li>{@code deposit(double value)} - Deposita uma quantia na conta.</li>
 *       <li>{@code withdraw(double value)} - Retira uma quantia da conta.</li>
 *       <li>{@code transfer(double value, Account destiny)} - Transfere uma quantia para outra conta.</li>
 * </ul>
 */
public interface AccountService {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(double amount, Account destiny);
}
