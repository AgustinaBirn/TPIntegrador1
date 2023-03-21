package tpintegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class tpintegrador {

	public static void main(String[] args) {
		try {
			for (String linea : Files.readAllLines(Paths.get("src\\documentos\\pronostico.txt"))){
				
				String equipo1 = linea.split(";")[0];
				String gana1 = linea.split(";")[1];
				String empata = linea.split(";")[2];
				String gana2 = linea.split(";")[3];
				String equipo2 = linea.split(";")[4];
					
				}		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
