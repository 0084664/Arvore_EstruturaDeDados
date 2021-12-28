class Arvore {

    public No Raiz; //raiz principal 
 
    public Arvore(){
        Raiz = null;
    }

    public Arvore(No raiz) throws Exception{
        if (!ehValido(raiz)) throw new Exception ("Conteúdo inválido");
        //verificar se a raiz do parametro é uma raiz de busca
        this.Raiz = raiz;
    }

    public void incluir(No elemento) throws Exception{
        if (!ehValido(elemento)) throw new Exception ("Elemento inválido");

        if (this.Raiz == null)
            this.Raiz = elemento;
        else{
            if (Raiz.getNum() > elemento.getNum()){
                if (Raiz.getEsq()!=null)
                    incluir(elemento, Raiz.getEsq());
                else //pendura ele na raiz
                    Raiz.setEsq(elemento);
            }else{
                if (Raiz.getDir()!=null)
                    incluir(elemento, Raiz.getDir());
                else
                    Raiz.setDir(elemento);
            }
        }
    }

    //não faz sentido alguem que esta por fora da arvore ter q passar a raiz
    //aqui é a subarvore
    private void incluir (No elemento, No raiz){
        if (raiz.getNum() > elemento.getNum()){
            if (raiz.getEsq()!=null)
                incluir(elemento, raiz.getEsq());
            else    
                raiz.setEsq(elemento);
        }else{
            if (raiz.getDir()!=null)
                incluir(elemento, raiz.getDir());
            else
                raiz.setDir(elemento);
        }
    }

    private boolean ehValido(No elemento){
        return true;
    }

    //trata o elemento no meio
    private String percorreInFixa(No raiz){
        if (raiz!=null){
            return percorreInFixa(raiz.getEsq()) +
                   " " + raiz.getNum() + " " + 
                   percorreInFixa(raiz.getDir());
        }
        return ""; //é obrigado a retornar 
    }
    
    //trata o elemento por ultimo
    private String percorrePosFixa(No raiz){
        if (raiz!=null){
            return percorrePosFixa(raiz.getEsq()) +  " " + 
            percorrePosFixa(raiz.getDir()) +  " " + 
            raiz.getNum() ;
        }
        return ""; //é obrigado a retornar 
    }

    //trata o elemento em primeiro
    private String percorrePreFixa(No raiz){
        if (raiz!=null){
            return raiz.getNum() + " "+ 
            percorrePreFixa(raiz.getEsq()) +  " " + 
            percorrePreFixa(raiz.getDir());
        }
        return ""; //é obrigado a retornar 
    }

    public int somaDeElementos(){
        return somaDeElementos(this.Raiz);  
    }

    private int somaDeElementos(No raiz){
        if (raiz == null) return 0;

        return raiz.getNum() + 
               somaDeElementos(raiz.getEsq()) + 
               somaDeElementos(raiz.getDir());
    }

    public int quantosPares(){
        return quantosPares(this.Raiz);        
    }

    private int quantosPares(No raiz){
        if (raiz == null) return 0;

        if ((raiz.getNum()%2)==0)
            return 1 + quantosPares(raiz.getEsq()) +
                       quantosPares(raiz.getDir());

        return quantosPares(raiz.getEsq())+
               quantosPares(raiz.getDir());         
    }

    public int quantosTenho(){
        return  quantosTenho(this.Raiz);        
    }

    private int quantosTenho(No raiz){
        if (raiz == null) return 0;
        return 1 + 
               quantosTenho(raiz.getEsq()) + 
               quantosTenho(raiz.getDir());      
    }

    // Quantas folhas tem na arvore
    public int quantidade_folhas(){
        return quantidade_folhas(this.Raiz);
    }

    public int quantidade_folhas(No raiz) {
        if(raiz == null) return 0;
        if(raiz.getEsq() == null && raiz.getDir() == null) return 1;
        return quantidade_folhas(raiz.getEsq()) + quantidade_folhas(raiz.getDir());
      }

    // Altura da arvore
    public int height() {
        return height(this.Raiz);
    }
    
    private int height(No raiz) {
        if(raiz == null) return -1;
        else return 1 + Math.max(height(raiz.getEsq()), height(raiz.getDir()));
    }

    public String toString(){
        return percorreInFixa(this.Raiz);
//      return percorrePosFixa(this.Raiz);
//      return percorrePreFixa(this.Raiz);
    }
}
