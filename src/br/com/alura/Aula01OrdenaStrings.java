package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Aula01OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Editora casa do codigo");
		palavras.add("Caelum");
		
//		Comparator<String> comparador = new comparatorDeTamanho();
// Forma antiga de se fazer antes do java 8
// vai ordenar por ordem de tamanho e não alfabetica
//		Collections.sort(palavras, comparador);
//		System.out.println(palavras);
		
		
		
//Forma atual usando o sort
//		palavras.sort(comparador);	
		
		
//		for (String p : palavras) {
//			System.out.println(p);		
//		}
//		System.out.println(palavras);
		
		
//		Consumer<String> consumidor = new ImprimeNaLinha();		
//		palavras.forEach(consumidor);
		
//Exemplo de criação do lambda 1° passo
//		palavras.forEach(new Consumer<String>() {
//			public void accept(String s) {
//				System.out.println(s);		
//			}
//		});	
		
		
		
//Finalizando usando os metodos internos da interface usando lambda		
//		palavras.forEach(s -> System.out.println(s));
		
//Modificando o metodo comparado para lambda usando  a interface sort
//1° passo
//		palavras.sort((s1, s2) -> {
//			if(s1.length() < s2.length())
//				return -1;
//			if(s2.length()>s2.length())
//				return 1;
//			return 0;
//		});
		
		
//2° Passo utilizando o metodo integer.compare() já faz todo esse processo do metodo
//		palavras.sort((s1, s2) -> {
//		return Integer.compare(s1.length(), s2.length());	
//		});
		
		
//3° passo, pode retirar o return as chaves e os pontos
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//4° passo, pode retirar o metodo compare que já fica subentendido
	palavras.sort((s1, s2) -> s1.length() - s2.length());
	
	
//1° Passo, outro exemplo com a classe object
	
//	new Thread(new Runnable() {
//	    @Override
//	    public void run() {
//	        System.out.println("Executando um Runnable");
//	    }
//	}).start();
	
// 2° Passo reduzindo o codigo
	
 new Thread(() -> System.out.println("Executando um Runnable")).start();	
			
	}
}

//class ImprimeNaLinha implements Consumer<String>{
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);		
//	}	
//}


//class comparatorDeTamanho implements Comparator<String>{
//
//	@Override
//	public int compare(String s1, String s2) {
//		if(s1.length() < s2.length()) 
//			return -1;
//		if(s1.length() > s2.length())
//			return 1;		
//		return 0;
//	}	
//}