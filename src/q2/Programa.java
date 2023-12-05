package q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = null;
		PrintWriter pw = null;
		var alunos = new ArrayList<Aluno>();
		Aluno a = null;
		try {
			sc = new Scanner(new File("entrada.txt"));
			pw = new PrintWriter(new File("saida.txt"));
			String line = "";
			String[] campos = null;
			do {
				line = sc.nextLine();
				campos = line.split(" ");
				Long matricula = Long.parseLong(campos[0]);
				String nome = campos[1] + " " + campos[2];
				
				line = sc.nextLine();
				campos = line.split(" ");
				Double p1 = Double.parseDouble(campos[0]);
				Double p2 = Double.parseDouble(campos[1]);
				Double t1 = Double.parseDouble(campos[2]);
				Double t2 = Double.parseDouble(campos[3]);
				a = new Aluno(matricula, nome, p1, p2, t1, t2);
				alunos.add(a);
			}while(sc.hasNext());
			
			Collections.sort(alunos);
			
			for (var aluno : alunos) {
				pw.println(aluno);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sc.close();
			pw.close();
		}

	}

}



