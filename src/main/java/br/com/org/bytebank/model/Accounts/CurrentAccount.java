package br.com.org.bytebank.model.Accounts;

import br.com.org.bytebank.model.client.Client;

/**
 *  Representacao de uma Conta Corrente.
 *  <p>
 *      Conta Corrente que extend {@code Account} com suas funcionalidades especificas.
 *  </p>
 */
public class CurrentAccount extends Account{
    /**
     * Representa uma Conta Corrente que estende{@code Account}.
     * <p>
     *  Construtor da classe Conta Corrento(CurrentAccount) que inicializa os atributos client(cliente) e agency(agencia).
     * </p>
     * @param client O cliente associado a conta Corrente.
     * @param agency Agencia da Conta Corrente.
     */
    public CurrentAccount(Client client, String agency) {
        super(client, agency);
    }

    @Override
    public String toString() {
        return "Current Account" +super.toString();
    }
}
