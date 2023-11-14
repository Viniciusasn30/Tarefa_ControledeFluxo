package br.com.mod10exericio;

public class Modulo10Exercicio {
	
	    public static void main(String[] args) {

	        operacaoMedia();

	    }

	        public static void operacaoMedia() {
	            Double nota1 = 9.5;
	            Double nota2 = 9.1;
	            Double nota3 = 9.5;
	            Double nota4 = 9.5;
	            Double nota5 = nota1 + nota2 + nota3 + nota4;
	            Double media1 = nota5 / 4;


	                if (nota5>=7) {
	                    System.out.println("Aprovado");

	                }else if (nota5 >=5){
	                System.out.println("Recuperação");

	                }else{ System.out.println("Reprovado");

	                }


	        }

	}



