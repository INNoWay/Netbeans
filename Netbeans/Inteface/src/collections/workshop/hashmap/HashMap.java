
package collections.workshop.hashmap;

/**
 * 
 * Esta classe é uma implementação baseada no conceito de HashMap
 * permite armazenar dados por pares chave/valor.
 * @param <Chave> - chave do elemento na tabela
 * @param <Valor> - valor do elemento na tabela
 */
public class HashMap<Chave, Valor> {

    private Entrada<Chave, Valor>[] tabela;
    private int capacidade = 10;

    static class Entrada<Chave, Valor> {

        Chave chave;
        Valor valor;
        Entrada<Chave, Valor> proximo;

        public Entrada(Chave chave, Valor valor, Entrada<Chave, Valor> proximo) {
            this.chave = chave;
            this.valor = valor;
            this.proximo = proximo;
        }
    }

    @SuppressWarnings("semVerificacao")
    public HashMap() {
        tabela = new Entrada[capacidade];
    }

    /**
     * Metodo que permite adicionar valores ao pares chave-valor no HashMap. Se
     * o mapa já contem o valor é negada a inserção, não é permitido inserir
     * valore null. Essa implementação permite colocar qualquer tipo de objeto
     * como chave.
     *
     * @param novaChave
     * @param dado
     */
    public void inserir(Chave novaChave, Valor dado) { // não aceita armazenar valor null.
        if (novaChave == null) {
            return;
        }

        int hash = hash(novaChave);
        Entrada<Chave, Valor> novaEntrada = new Entrada<Chave, Valor>(novaChave, dado, null);
        if (tabela[hash] == null) {
            tabela[hash] = novaEntrada;
        } else {
            Entrada<Chave, Valor> anterior = null;
            Entrada<Chave, Valor> atual = tabela[hash];

            while (atual != null) { //alcançamos o final
                if (atual.chave.equals(novaChave)) {
                    System.out.println(novaChave + " já foi inserida, não é permitido valores duplicados");
                    return;
                }
                anterior = atual;
                atual = atual.proximo;
            }
            anterior.proximo = novaEntrada;
        }
    }

    /**
     * Método retorna o valor da chave correspondente
     *
     * @param chave
     */
    public Valor pegar(Chave chave) {
        int hash = hash(chave);
        if (tabela[hash] == null) {
            return null;
        } else {
            Entrada<Chave, Valor> temporario = tabela[hash];
            while (temporario != null) {
                if (temporario.chave.equals(chave)) {
                    return temporario.valor;
                }
                temporario = temporario.proximo; //retorna o valor da chave correspondente
            }
            return null;   //retorna null se a chave não for encontrada.
        }
    }

    /**
     * Método remove o par chave/valor do HashMap.
     *
     * @param chave
     */
    public boolean remover(Chave apagarChave) {

        int hash = hash(apagarChave);

        if (tabela[hash] == null) {
            return false;
        } else {
            Entrada<Chave, Valor> anterior = null;
            Entrada<Chave, Valor> atual = tabela[hash];

            while (atual != null) {
                if (atual.chave.equals(apagarChave)) {
                    if (anterior == null) {
                        tabela[hash] = tabela[hash].proximo;
                        return true;
                    } else {
                        anterior.proximo = atual.proximo;
                        return true;
                    }
                }
                anterior = atual;
                atual = atual.proximo;
            }
            return false;
        }

    }

    /**
     * Método exibe todos os valores dos pares presentes no HashMap. A ordem de
     * inserção não é garantida, para manter uma orderm de inserção temos que
     * usar um LinkedHashMap.
     *
     * @param chave
     */
    public void exibir() {

        for (int i = 0; i < capacidade; i++) {
            if (tabela[i] != null) {
                Entrada<Chave, Valor> entrada = tabela[i];
                while (entrada != null) {
                    System.out.print("{" + entrada.chave + "=" + entrada.valor + "}" + " ");
                    entrada = entrada.proximo;
                }
            }
        }

    }

    /**
     * Método retorna null se o conjunto não contém nenhum objeto.
     *
     * @param chave
     */
    public Chave contains(Chave chave) {
        int hash = hash(chave);
        if (tabela[hash] == null) {
            return null;
        } else {
            Entrada<Chave, Valor> temporario = tabela[hash];
            while (temporario != null) {
                if (temporario.chave.equals(chave)) {
                    return chave;
                }
                temporario = temporario.proximo; //retorna valor corresponde a chave.
            }
            return null;   //retorna null se a chave não foi encontrada. 
        }
    }

    /**
     * Método exibe todos os objetos. A ordem de inserção não é garantida, para
     * manter ordem de inserção usamos um LinkedHashSet
     */
    public void exibirConjunto() {

        for (int i = 0; i < capacidade; i++) {
            if (tabela[i] != null) {
                Entrada<Chave, Valor> entrada = tabela[i];
                while (entrada != null) {
                    System.out.print(entrada.chave + " ");
                    entrada = entrada.proximo;
                }
            }
        }

    }

    /**
     * Método implementa funcionalidade de espelhamento, o que ajuda a reserva
     * um local apropriado para armazenar o dado. Este método é muito
     * importante, a performance do HashMap é muito dependente desse método.
     *
     * @param chave
     */
    private int hash(Chave chave) {
        return Math.abs(chave.hashCode()) % capacidade;
    }

}
