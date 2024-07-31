package br.com.org.bytebank.customException;

/**
 * Classe AddressException(conta excecao).
 * Uma classe personalidade para tratar exceções especificas para a classe Endereço que extends RuntimeException.
 */
public class AddressException extends RuntimeException{
    /**
     * Construtor da classe AddressException
     * @param msg Mensagem de erro que descreve a exceção específica.
     */
    public AddressException(String msg) {
        super(msg);
    }
    /**
     * Construtor da classe AddressException
     * Cria uma excecao de conta sem mensagem especifica.
     */
    public AddressException() {
        super();
    }
}
