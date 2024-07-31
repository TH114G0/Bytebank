package br.com.org.bytebank.model.address;

import br.com.org.bytebank.customException.AddressException;

/**
 * Representacao de um Endereco
 */
public class Address {
    /**
     * Cidade do Endereco atual
     */
    private String city;
    /**
     * Rua do Endereco atual
     */
    private String road;
    /**
     * Complemento do Endereco atual
     */
    private String complement;
    /**
     * Número do Endereco atual
     */
    private int number;

    /**
     * Construtor da classe Address(Endereco) que inicializa os atributos city(cidade), road(rua), complement(complemento) e number(numero).
     * @param city Cidade do Endereco atual
     * @param road Rua do Endereco atual
     * @param complement Complemento do Endereco atual
     * @param number Número do Endereco atual
     * @throws AddressException Valores nulos, vazios ou negativos.
     */
    public Address(String city, String road, String complement, int number) {
        if(city == null || city.isEmpty()) {
            throw new AddressException("Cidade não deve ser vazia ou nulo");
        }
        if(road == null || road.isEmpty()) {
            throw new AddressException("Rua não deve ser vazia ou nulo");
        }
        if(complement == null || complement.isEmpty()) {
            throw new AddressException("Complemento não deve ser vazio ou nulo");
        }
        if(number < 0) {
            throw new AddressException("Numero não deve ser negativo ou menor que zero");
        }
        this.city = city;
        this.road = road;
        this.complement = complement;
        this.number = number;
    }

    /**
     * Obtem a cidade do endereco atual.
     * @return A cidade atual do endereco.
     */
    public String getCity() {
        return city;
    }

    /**
     * Modifica a cidade do endereco atual.
     * @param city Nova cidade para endereco atual.
     * @throws AddressException Valores nulos ou negativos.
     */
    public void setCity(String city) {
        if(city == null || city.isEmpty()) {
            throw new AddressException("Cidade não deve ser vazia ou nulo");
        }
        this.city = city;
    }

    /**
     * Obtem a rua do endereco.
     * @return A rua do endereco atual.
     */
    public String getRoad() {
        return road;
    }

    /**
     * Modifica a rua do endereco atual.
     * @param road Nova rua do endereco atual.
     * @throws IllegalArgumentException Valores nulos ou negativos.
     */
    public void setRoad(String road) {
        if(road == null || road.isEmpty()) {
            throw new AddressException("Rua não deve ser vazia ou nulo");
        }
        this.road = road;
    }

    /**
     * Obtem o complemento do endereco atual.
     * @return O complemento do endereco atual.
     */
    public String getComplement() {
        return complement;
    }

    /**
     * Modifica o complemento do endereco atual.
     * @param complement Novo complemento do endereco atual.
     * @throws IllegalArgumentException Valores nulos ou negativos.
     */
    public void setComplement(String complement) {
        if(complement == null || complement.isEmpty()) {
            throw new AddressException("Complemento não deve ser vazio ou nulo");
        }
        this.complement = complement;
    }

    /**
     * Obtem o numero do endereco atual.
     * @return O numero do endereco atual.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Modifica o numero do endereco atual.
     * @param number Novo numero do endereco atual
     * @throws IllegalArgumentException Valores nulos ou negativos.
     */
    public void setNumber(int number) {
        if(number < 0) {
            throw new AddressException("Numero nao deve ser negativo ou menor que zero");
        }
        this.number = number;
    }
}
