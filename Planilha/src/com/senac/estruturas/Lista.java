package com.senac.estruturas;

public class Lista {
	
	Nodo primeiro,ultimo;
    int totalNodos;

    public Lista(){
        this.primeiro= null;
        this.ultimo= null;
        this.totalNodos = 0;
    }
		
    
    public int getTotalNodos(){
        return totalNodos;
    }
    
    
    public boolean ListaVazia(){
        if (getTotalNodos() == 0){
            return true;
       }
       return false;
    }
    
    
    public void inserirNoInicio(Nodo nodo) {
        if ( ListaVazia() ){
            primeiro = ultimo = nodo;
        }
        else{
        	nodo.proximo = primeiro;
            primeiro = nodo;
        }
        totalNodos++;
    }
    
    
    public void inserirNoFim(Nodo nodo){

        if ( ListaVazia() ){
            primeiro = ultimo = nodo;
        }
        else{
            ultimo.proximo = nodo;
            ultimo = nodo;
       }
        totalNodos++;
    }
    
    
    public void exibirLista(){
        Nodo aux = primeiro;
        String valores = "";
        int contador = 1;
        if ( ListaVazia() == false ){
            while (contador <= getTotalNodos()){
                valores += Integer.toString(aux.valor)+"-";
                aux = aux.proximo;
                contador++;
            }
        }
        System.out.println(valores);
     }
    
    
    public Nodo search(int i){
    	for(Nodo n = primeiro; n != null; n = n.getProximo()){
    		if(n.getValor()==i){
    			return n;
    		}
    	}
    	 return null; 
    }
    
    

}//fim classe Lista
