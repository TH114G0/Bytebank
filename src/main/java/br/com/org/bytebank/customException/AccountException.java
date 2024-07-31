package br.com.org.bytebank.customException;

/**
 *  Classe AccountException(conta exceção).
 *  <p>
 *      Uma classe personalidade para tratar excecoes especificas para a classe Conta que extends {@code RuntimeException}.
 *  </p>
 */
public class AccountException extends RuntimeException{
    /**
     * Construtor da classe AccountException
     * @param msg Mensagem de erro que descreve a exceção específica.
     */
    public AccountException(String msg) {
        super(msg);
    }
    /**
     * Construtor da classe AccountException
     * Cria uma exceção de conta sem mensagem especifica.
     */
    public AccountException() {
        super();
    }
}
