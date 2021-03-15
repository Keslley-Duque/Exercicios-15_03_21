package produto;

public class Produto {
    // atributos
    private int n1;
    private int n2;

    // metodo de acesso
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    // metodo geral
    public long produtoW() {
        long resultado = 0;
        int i = 0;
        // estrutura de repetição while
        while (i < n2) {
            resultado += n1;
            i++;
        }
        return resultado;
    }

    public long produtoDW() {
        long resultado = 0;
        int i = 0;
        // estrutura de repetição do while
        do {
            resultado += n1;
            i++;
        } while (i < n2);
        return resultado;
    }

    public long produtoF() {
        long resultado = 0;
        // estrutura de repetição for
        for (int i = 0; i < n2; i++) {
            resultado += n1;
        }
        return resultado;
    }

}