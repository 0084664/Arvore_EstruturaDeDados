public class Principal {
    public static void main(String Args[]) throws Exception{
        No meuNo = new No(5);
        Arvore minhaArvore = new Arvore();
        minhaArvore.incluir(meuNo);
        meuNo = new No(10);
        minhaArvore.incluir(meuNo);
        meuNo = new No(2);
        minhaArvore.incluir(meuNo);
        meuNo = new No(1);
        minhaArvore.incluir(meuNo);
        meuNo = new No(4);
        minhaArvore.incluir(meuNo);
        meuNo = new No(7);
        minhaArvore.incluir(meuNo);
        meuNo = new No(12);
        minhaArvore.incluir(meuNo);

        System.out.println(minhaArvore);
        System.out.println("Quantidade de Elementos: " + 
                           minhaArvore.quantosTenho());
        System.out.println("Quantidade de Elementos Pares: " + 
                           minhaArvore.quantosPares());
        System.out.println("Soma de Elementos: " + minhaArvore.somaDeElementos());
        System.out.println("Altura da Árvore: " + minhaArvore.height());
        System.out.println("Quantidade de Folhas: " + minhaArvore.quantidade_folhas());
    }
}