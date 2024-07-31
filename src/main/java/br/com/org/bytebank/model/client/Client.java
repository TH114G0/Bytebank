package br.com.org.bytebank.model.client;

import br.com.org.bytebank.customException.ClientException;
import br.com.org.bytebank.model.address.Address;
/**
 * Representacao de um Cliente
 */
public class Client {
    /**
     * Nome do cliente atual.
     */
    private String name;
    /**
     * Idade do cliente atual.
     */
    private int age;
    /**
     * Endereco associado ao cliente atual.
     */
    private Address address;

    /**
     * Construtor da classe Cliente que inicializa name(nome), age(idade) e address(Endereco).
     * @param name Nome do cliente atual.
     * @param age Idade do cliente atual.
     * @param address Endereco associado ao cliente atual.
     * @throws ClientException informacoes nulos, vazios ou negativos
     */
    public Client(String name, int age, Address address) {
        if(name == null || name.isEmpty()) {
            throw new ClientException("Nome nao deve ser vazio ou nulo");
        }
        if(age < 0) {
            throw new ClientException("Idade nao deve ser negativo ou igual a zero");
        }
        if (address == null) {
            throw new ClientException("Endereco não deve ser nulo");
        }
        this.name = name;
        this.age = age;
        this.address = address;
    }


    /**
     * Obtem o nome do cliente atual.
     * @return O nome do cliente.
     */
    public String getName() {
        return name;
    }

    /**
     * Modifica o nome do cliente atual.
     * @param name Novo nome do cliente.
     * @throws ClientException Se nome for nulo ou vazio.
     */
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new ClientException();
        }
        this.name = name;
    }

    /**
     * Obtem a idade do cliente atual.
     * @return A idade do cliente.
     */
    public int getAge() {
        return age;
    }
    /**
     * Modifica a idade do cliente atual.
     * @param age Idade do cliente.
     * @throws ClientException Se idade for negativa ou igual a zero.
     */
    public void setAge(int age) {
        if(age < 0) {
            throw new ClientException();
        }
        this.age = age;
    }

    /**
     * Obtem endereco associado ao cliente.
     * @return Referencia para o objeto {@code Address} na memoria heap associado ao Cliente.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Define o endereco associado ao cliente.
     *
     * @param address O novo endereco a ser associado ao cliente. Nao pode ser nulo.
     * @throws ClientException Se o endereco fornecido for nulo.
     */
    public void setAddress(Address address) {
        if (address == null) {
            throw new ClientException();
        }
        this.address = address;
    }
}
