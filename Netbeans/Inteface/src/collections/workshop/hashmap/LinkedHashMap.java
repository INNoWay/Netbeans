package collections.workshop.hashmap;

/**
 * 
 * Esta classe é uma implementação baseada no conceito de HashMap
 * permite armazenar dados por pares chave/valor.
 * @param <Chave> - chave do elemento na tabela
 * @param <Valor> - valor do elemento na tabela
 */
public class LinkedHashMap<Chave, Valor> {

    private Entrada<Chave, Valor>[] tabela;
    private int capacidade = 10;
    private Entrada<Chave, Valor> cabecalho;
    private Entrada<Chave, Valor> ultimo;

    static class Entrada<Chave, Valor> {

        Chave chave;
        Valor valor;
        Entrada<Chave, Valor> proximo;
        Entrada<Chave, Valor> antes;
        Entrada<Chave, Valor> depois;

        public Entrada(Chave chave, Valor valor, Entrada<Chave, Valor> proximo) {
            this.chave = chave;
            this.valor = valor;
            this.proximo = proximo;
        }
    }

    @SuppressWarnings("semVerificacao")
    public LinkedHashMap() {
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
        //LinkedHashSet 
        manterOrdemAposInserir(novaEntrada);
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
                   //LinkedHasSet
                    manterOrdemAposDeletar(atual);
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
     * Método exibe todos os valores dos pares presentes no LinkedHashMap.
     *
     * @param chave
     */
    public void exibirLinked() {

                Entrada<Chave, Valor> entradaAtual = cabecalho;
                while (entradaAtual != null) {
                    System.out.print("{" + entradaAtual.chave + "=" + entradaAtual.valor + "}" + " ");
                    entradaAtual = entradaAtual.proximo;
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
     * Método exibe todos os objetos. A ordem de inserção é garantida, para o 
     * LinkedHashSet
     */
    public void exibirConjuntoLinked() {

        Entrada<Chave, Valor> entradaAtual = cabecalho;
                while (entradaAtual != null) {
                    System.out.print(entradaAtual.chave + " ");
                    entradaAtual = entradaAtual.depois;
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

    /**
     * Metódo nos ajuda a garantir a orderm de inserção do LinkedHashMap
     * depois que o novo par chave/valor for adicionado.
     */
    private void manterOrdemAposInserir(Entrada<Chave, Valor> novaEntrada) {

        if (cabecalho == null) {
            cabecalho = novaEntrada;
            ultimo = novaEntrada;
            return;
        }

        if (cabecalho.chave.equals(novaEntrada.chave)) {
            deletarPrimeiro();
            inserirPrimeiro(novaEntrada);
            return;
        }

        if (ultimo.chave.equals(novaEntrada.chave)) {
            deletarUltimo();
            inserirUltimo(novaEntrada);
            return;
        }

        Entrada<Chave, Valor> antesDeletarEntrada = deletarEntradaEspecifica(novaEntrada);
        if (antesDeletarEntrada == null) {
            inserirUltimo(novaEntrada);
        } else {
            inserirDepois(antesDeletarEntrada, novaEntrada);
        }

    }

    /**
   * Metódo nos ajuda a garantir a orderm de inserção do LinkedHashMap
     * depois que o novo par chave/valor for removido.
     */
    private void manterOrdemAposDeletar(Entrada<Chave, Valor> deletarEntrada) {

        if (cabecalho.chave.equals(deletarEntrada.chave)) {
            deletarPrimeiro();
            return;
        }

        if (ultimo.chave.equals(deletarEntrada.chave)) {
            deletarUltimo();
            return;
        }

        deletarEntradaEspecifica(deletarEntrada);

    }

    /**
     * returns entry after which new entry must be added.
     */
    private void inserirDepois(Entrada<Chave, Valor> antesDeletarEntrada, Entrada<Chave, Valor> novaEntrada) {
        Entrada<Chave, Valor> atual = cabecalho;
        while (atual != antesDeletarEntrada) {
            atual = atual.depois;  //move to next node.
        }

        novaEntrada.depois = antesDeletarEntrada.depois;
        antesDeletarEntrada.depois.antes = novaEntrada;
        novaEntrada.antes = antesDeletarEntrada;
        antesDeletarEntrada.depois = novaEntrada;

    }

    /**
     * deletar entrada do primeiro node.
     */
    void deletarPrimeiro() {

        if (cabecalho == ultimo) { //somente uma entrada encontrada.
            cabecalho = ultimo = null;
            return;
        }
        cabecalho = cabecalho.depois;
        cabecalho.antes = null;

    }

    /**
     * inserir entrada do primeiro node.
     */
    void inserirPrimeiro(Entrada<Chave, Valor> novaEntrada) {

        if (cabecalho == null) { //nenhuma entrada encontrada
            cabecalho = novaEntrada;
            ultimo = novaEntrada;
            return;
        }

        novaEntrada.depois = cabecalho;
        cabecalho.antes = novaEntrada;
        cabecalho = novaEntrada;

    }

    /**
     * inserir entrada no último.
     */
    void inserirUltimo(Entrada<Chave, Valor> novaEntrada) {

        if (cabecalho == null) {
            cabecalho = novaEntrada;
            ultimo = novaEntrada;
            return;
        }
        ultimo.depois = novaEntrada;
        novaEntrada.antes = ultimo;
        ultimo = novaEntrada;

    }

    /**
     * deletar entrada no último.
     */
    void deletarUltimo() {

        if (cabecalho == ultimo) {
            cabecalho = ultimo = null;
            return;
        }

        ultimo = ultimo.antes;
        ultimo.depois = null;
    }

    /**
     * deleta entrada especifica e retornar para antes dessa entrada.
     */
    private Entrada<Chave, Valor> deletarEntradaEspecifica(Entrada<Chave, Valor> novaEntrada) {

        Entrada<Chave, Valor> atual = cabecalho;
        while (!atual.chave.equals(novaEntrada.chave)) {
            if (atual.depois == null) {   //entrada não encontrada
                return null;
            }
            atual = atual.depois;  //vá para o próximo node.
        }

        Entrada<Chave, Valor> antesDeletarEntrada = atual.antes;
        atual.antes.depois = atual.depois;
        atual.depois.antes = atual.antes;  //entrada deletada
        return antesDeletarEntrada;
    }

}
