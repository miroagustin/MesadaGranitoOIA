package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mesadaGranito.Mesada;

public class EntradaSalida {

	public static List<Mesada> getListaMesadas() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("mesadas.in"));
		int tama�o = sc.nextInt();
		List<Mesada> lista = new ArrayList<>(tama�o);
		for (int i = 0; i < tama�o; i++)
			lista.add(new Mesada(sc.nextInt(), sc.nextInt()));
		return lista;
	}

}
