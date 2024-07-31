package br.com.org.bytebank.model.Accounts;

import br.com.org.bytebank.Service.AccountService;
import br.com.org.bytebank.customException.AccountException;
import br.com.org.bytebank.model.client.Client;

/**
 *  Representacao de uma conta bancaria.
 *  <p>
 *      Esta classe abstrata fornece a estrutura basica para diferentes tipos de conta bancaria,
 *      implementando a interface {@code AccountService} para definir os comportamentos comuns, por exemplo:
 *  </p>
 *  <ul>
 *       <li>{code deposit(double value)} - Deposita uma quantia na conta.</li>
 *       <li>{code withdraw(double value)} - Retira uma quantia da conta.</li>
 *       <li>{code transfer(double value, Account destiny)} - Transfere uma quantia para outra conta.</li>
 *  </ul>
 *
 *  @author Thiago
 */
public abstract class Account implements AccountService {
    /**
     * O saldo atual da conta bancaria.
     */
    private double balance;
    /**
     * O identificador único da conta bancaria.
     */
    private static int id;
    /**
     * O cliente associado à conta bancaria.
     */
    private Client client;
    /**
     * Agência da conta bancaria.
     */
    private String agency;

    /**
     * Construtor da classe Account(conta) que inicializa os atributos client(cliente) e agency(agencia)
     * @param client O cliente associado a conta bancaria.
     * @param agency Agencia da conta bancaria.
     * @throws AccountException Se o cliente for nulo ou se Agencia estiver vazia ou ser nulo
     */
    public Account(Client client, String agency) {
        ++id;
        if(client == null) {
            throw new AccountException("Cliente não deve ser nulo");
        }
        if(agency == null || agency.isEmpty()) {
            throw new AccountException("Agencia não deve ser vazia ou nulo");
        }
        this.client = client;
        this.agency = agency;
    }

    /**
     * Deposita uma quantia na conta.
     * <p>Este metodo é implementado a partir da interface {code AccountService}.</p>
     * @param amount Valor que sera depositado(deve ser um "valor" positivos).
     * @throws AccountException Se o valor for negativo ou igual a zero.
     */
    @Override
    public void deposit(double amount) {
        if(amount <= 0) {
            throw new AccountException("Deposito negado!\n" +
                    "Não e possível realizar Depositos com valores negativos");
        }
        this.balance += amount;
    }

    /**
     * Retira uma quantia da conta
     * <p>Este metodo é implementado a partir da interface {code AccountService}.</p>
     * @param amount Valor que sera retirado da conta(deve ser maior que zero e não deve ultrapassar o saldo disponivel).
     * @throws AccountException Se o valor especificado para saque for negativo ou ultrapassar o saldo disponivel
     */
    @Override
    public void withdraw(double amount) {
        if(this.balance < amount) {
            throw new AccountException("Saque negado!\n" +
                    "Saldo atual: " + getBalance() + ",valor solicitado: " + amount);
        }
        this.balance -= amount;
    }

    /**
     *  Transfere uma quantia para outra conta.
     * <p>Este metodo é implementado a partir da interface {code AccountService}.</p>
     * @param amount O valor que sera transferido.
     * @param destiny A conta de destino para onde o valor sera transferido.
     */
    @Override
    public void transfer(double amount, Account destiny) {
        withdraw(amount);
        destiny.deposit(amount);
    }

    @Override
    public String toString() {
        return "{" +
                "balance=" + this.balance +
                ", client=" + this.client.getName() +
                ", agency=" + this.agency +
                "}";
    }

    /**
     * Obtem o saldo atual da conta.
     * @return O saldo atual da conta.
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Obtem o identificador unico associado a esta conta.
     * @return O identificador associado a esta conta.
     */
    public static int getId() {
        return id;
    }

    /**
     * Obtem o cliente associado a esta conta.
     * @return O cliente associado a esta conta.
     */
    public Client getClient() {
        return client;
    }


    /**
     * Altera o cliente associado a esta conta.
     * @param client Novo cliente associado a esta conta(não pode ser nulo).
     * @throws AccountException Se o cliente fornecido for nulo
     */
    public void setClient(Client client) {
        if(client == null) {
            throw new AccountException("Cliente não deve ser nulo");
        }
        this.client = client;
    }

    /**
     * Obtem a agência atual da conta.
     * @return Agência atual da conta.
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Altera a agencia atual da conta.
     * @param agency Nova agencia da conta(não deve ser vazia ou nulo).
     * @throws AccountException Se agencia fornecida for nulo ou estiver vazia
     */
    public void setAgency(String agency) {
        if(agency == null || agency.isEmpty()) {
            throw new AccountException("Cliente não deve ser nulo");
        }
        this.agency = agency;
    }
}
