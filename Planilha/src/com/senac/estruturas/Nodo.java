package com.senac.estruturas;


public class Nodo {
	
	int valor;
    Nodo proximo;

    public Nodo(int v){
        this.valor = v;
        this.proximo = null;
    }
	
	
	public void setProximo(Nodo proximo){
		this.proximo= proximo;
	}
	
	public Nodo getProximo(){
		return this.proximo;
	}
	
	public int getValor(){
		return this.valor;
	}
	
}//fim classe nodo
