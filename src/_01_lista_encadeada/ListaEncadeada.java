package _01_lista_encadeada;

public class ListaEncadeada<T> {
   private No<T> raiz;
   private int quantidade = 0;
   
   /**
    *Método para adicionar elementos à lista.
    *
    * @param <T> O tipo de dado a ser armazenado na lista.
    */
   public void adicionar(T dado){
        if(this.raiz == null){
            this.raiz = new No<T>(dado);
            this.quantidade = this.quantidade + 1;
        }else{
            No<T> auxiliar = this.raiz;
            while(auxiliar.proximo != null){
                auxiliar = auxiliar.proximo;
            }
            auxiliar.proximo = new No<T>(dado);
            this.quantidade = this.quantidade + 1;
        }
   }
   
   /**
    * Remove e retorna o último elemento da lista encadeada.
    * 
    * @return O último elemento removido da lista.
    */
   public T deletarUltimo(){
       No<T> auxiliar = this.raiz;
       No<T> auxiliarProximo = this.raiz.proximo;
       
       while (auxiliarProximo.proximo != null){
           auxiliar = auxiliar.proximo;
           auxiliarProximo = auxiliarProximo.proximo;
       }
       T objetoRetorno = auxiliar.proximo.dado;
       auxiliar.proximo = null;
       this.quantidade = this.quantidade -1;
       
       return objetoRetorno;
   }
   
   
   /**
    * Remove e retorna o primeiro elemento da lista encadeada.
    * 
    * @return O primeiro elemento removido da lista.
    */
   public T deletarPrimeiro(){
       T objetoRetorno = this.raiz.dado;
       this.raiz = this.raiz.proximo;
       this.quantidade = this.quantidade -1;
       return objetoRetorno;
   }
   
   
   
   public int getQuantidade(){
       return this.quantidade;
   }
   
    
}
