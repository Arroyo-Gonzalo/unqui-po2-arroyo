package ar.edu.po2.tp3;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numeros;
	
	public Counter() {
		numeros = new ArrayList<>();	
	}
	
	public void addNumber(int numero) {
		numeros.add(numero);
	}

	public int cantidadDeImpares() {
		int contador = 0;
		
		for(int numero : numeros) {
			if(numero % 2 != 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public int cantidadDePares() {
		int contador = 0;
		
		for(int numero : numeros) {
			if(numero % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public int cantidadDeMultiplosDe(int divisor) {
		int contador = 0;
		
		for(int numero : numeros) {
			if(numero % divisor == 0) {
				contador++;
			}
		}
		return contador;
	}
}
