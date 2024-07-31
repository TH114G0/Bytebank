package br.com.org.bytebank.customException;

/**
 *Classe ClientException(conta excecao). Uma classe personalidade para tratar excecoes especificas para a classe Cliente que extends RuntimeException.
 */
public class ClientException extends RuntimeException{
    /**
     * Construtor da classe ClientException
     * @param msg Mensagem de erro que descreve a excecao específica.
     */
    public ClientException(String msg) {
        super(msg);
    }
    /**
     * Construtor da classe ClientException
     * Cria uma excecao de conta sem mensagem especifica.
     */
    public ClientException() {
        super();
    }
}
