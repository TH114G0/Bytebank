package br.com.org.bytebank.model.Accounts;

import br.com.org.bytebank.model.client.Client;
/**
 *  Representacao de uma Conta Poupanca.
 *  <p>
 *      Conta Poupanca que extend {@code Account} com suas funcionalidades especificas.
 *  </p>
 */
public class SavingsAccount extends Account{
    /**
     * Representa uma Conta poupanca que estende{@code Account}.
     * <p>
     *  Construtor da classe Conta poupanca(SavingsAccount) que inicializa os atributos client(cliente) e agency(agencia).
     * </p>
     * @param client O cliente associado a conta poupanca.
     * @param agency Agencia da Conta poupanca.
     */
    public SavingsAccount(Client client, String agency) {
        super(client, agency);
    }

    @Override
    public String toString() {
        return "Savings Account: " + super.toString();
    }
}
