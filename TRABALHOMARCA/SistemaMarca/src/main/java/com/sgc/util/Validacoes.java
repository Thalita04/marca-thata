package com.sgp.util;

/**
 * Classe utilitária para validação de dados de entrada.
 * Contém métodos estáticos para validar nome, idade e altura,
 * além de retornar mensagens de erro apropriadas.
 *
 * Esta classe não pode ser instanciada (padrão Utility Class).
 */
public class Validacoes { /**professor eu nao sei o porque que esta chave esta em vermelho, já quebrei minha cabeca para tentarr entender */

    /**
     * Construtor privado para impedir a criação de instâncias.
     * Segue o padrão de classe utilitária (Utility Class Pattern).
     */
    private Validacoes() {
        // Construtor privado para evitar instância
    }

    /**
     * Verifica se a marca informado é válido.
     * Uma marca válido não pode ser nulo, vazio ou conter números.
     *
     * @param marca A marca a ser validado
     * @return true se a marca for válido, false caso contrário
     */
    public static boolean marcaValido(String marca) {
        // Retorna false se a marca for nula, vazio ou contiver dígitos
        return !(marca == null || marca.trim().isEmpty() || marca.matches(".*\\d+.*"));
    }


    /**
     * Retorna uma mensagem de erro caso a marca seja inválido.
     *
     * @param marca O marca a ser verificado
     * @return Mensagem de erro descritiva ou string vazia se válido
     */
    public static String mensagemErroMarca(String marca) {
        // Verifica se a marca é nulo ou vazio
        if (marca == null || marca.trim().isEmpty()) {
            return "Erro: A marca não pode estar vazio!";
        // Verifica se a marca contém números usando regex
        } else if (marca.matches(".*\\d+.*")) {
            return "Erro: A marca não pode conter números!";
        }
        // Retorna string vazia se a marca for válido
        return "";
    }


        /**
     * Verifica se o ano de fabricação informado é válido.
     * O ano deve estar entre 1900 e o ano atual.
     *
     * @param anoFabricacao O ano de fabricação a ser validado
     * @return true se estiver válido, false caso contrário
     */
    public static boolean anoFabricacaoValido(int anoFabricacao) {
        
        return anoFabricacao >= 1900 && anoFabricacao <= anoAtual;
}

    /**
 * Verifica se o ano de fabricação informado é válido.
 * O ano deve estar entre 1900 e o ano atual.
 *
 * @param anoFabricacao O ano de fabricação a ser validado
 * @return true se estiver válido, false caso contrário
 */
public static boolean anoFabricacaoValido(int anoFabricacao) {
    
    return anoFabricacao >= 1900 && anoFabricacao <= anoAtual;
}

    /**
     * Retorna uma mensagem de erro caso o ano de fabricação seja inválido.
     *
     * @param anoFabricacao O ano de fabricação a ser verificado
     * @return Mensagem de erro ou string vazia se válido
     */
    public static String mensagemErroAnoFabricacao(int anoFabricacao) {

    if (anoFabricacao < 1900) {
        return "Erro: O ano de fabricação não pode ser menor que 1900!";
    } else if (anoFabricacao > anoAtual) {
        return "Erro: O ano de fabricação não pode ser no futuro!";
    }

    return "";
}

    /**
     * Verifica se o ano de fabricação é válido.
     * O ano de fabricação deve estar entre 1900 e o ano atual.
     *
     * @return ano de fabricação da marca
}