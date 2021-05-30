package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import mesadaGranito.ApiladorMesadas;
import mesadaGranito.Mesada;

public class EntradaSalida {

	public static ApiladorMesadas escribir(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int tama�o = sc.nextInt();
		ApiladorMesadas apilador = new ApiladorMesadas();
		for (int i = 0; i < tama�o; i++)
			apilador.agregar(new Mesada(sc.nextInt(), sc.nextInt()));
		return apilador;
	}

}
