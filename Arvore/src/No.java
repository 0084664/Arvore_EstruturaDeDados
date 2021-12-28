class No {
        private int num;
        private No  dir;
        private No  esq;
    
        public No(int N){
            setNum(N);
            setDir(null);
            setEsq(null);
        }
        
        public void setNum(int N){
            this.num = N;
        }
        public void setDir(No D){
            this.dir = D;
        }
        public void setEsq(No E){
            this.esq = E;
        }
    
        public int getNum(){
            return this.num;
        }
        public No getDir(){
            return this.dir;
        }
        public No getEsq(){
            return this.esq;
        }
    
        public String toString(){
            return ""+this.num;
        }
}
