package com.senac.estruturas;

public class Celula {
	
	 private String nome;
     private int valor;
     private int formula;
     
     
     
     public Celula(String nome, int valor, int formula) {
             this.nome = nome;
             this.valor = valor;
             this.formula = formula;
     }


     public String getNome() {
             return nome;
     }
     

     public void setNome(String nome) {
             this.nome = nome;
     }


     public int getValor() {
             return valor;
     }
     

     public void setValor(int valor) {
             this.valor = valor;
     }


     public int getFormula() {
             return formula;
     }

     
     public void setFormula(int formula) {
             this.formula = formula;
     }
             
	
	

}//fim da classe celula
